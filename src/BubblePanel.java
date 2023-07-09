import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BubblePanel extends JPanel implements Runnable, MouseListener {
  private static final int WIDTH = 800;
  private static final int HEIGHT = 600;
  private static final int NUM_BUBBLES = 45;

  private List<Bubble> bubbles = new ArrayList<>();
  private Random random = new Random();
  private boolean isRunning = false;

  public BubblePanel() {
    setPreferredSize(new Dimension(WIDTH, HEIGHT));
    setBackground(Color.BLACK);
    addMouseListener(this);
  }

  @Override
  public void paint(Graphics g) {
    super.paint(g);
    // Draw all the bubbles on the screen
    for (Bubble bubble : bubbles) {
      bubble.draw(g);
    }
  }

  @Override
  public void run() {
    JOptionPane.showMessageDialog(this, "يمكنك إنشاء كرات جديدة عند الضغط بزر الفأرة الأيمن", "Hint",
        JOptionPane.INFORMATION_MESSAGE);
    while (isRunning) {
      // Move all the bubbles randomly
      for (Bubble bubble : bubbles) {
        bubble.moveRandomly();
      }
      // Repaint the screen to show the updated bubbles
      repaint();
      // Sleep for a short time to slow down the animation
      try {
        Thread.sleep(20);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  private Bubble generateRandomBubble() {
    int x = random.nextInt(WIDTH);
    int y = random.nextInt(HEIGHT);
    int radius = random.nextInt(50) + 10;
    Color color = new Color(random.nextInt(256), random.nextInt(256),
        random.nextInt(256), random.nextInt(200) + 55);
    return new Bubble(x, y, radius, color);
  }

  @Override
  public void mouseClicked(MouseEvent e) {
    if (e.getButton() == MouseEvent.BUTTON1 && !isRunning) {
      isRunning = true;
      // Add some initial bubbles to the screen
      for (int i = 0; i < NUM_BUBBLES; i++) {
        bubbles.add(generateRandomBubble());
      }
      // Create a new thread to run the animation
      Thread t = new Thread(this);
      t.start();
    }
    // Add a new bubble to the screen when the right mouse button is clicked
    else if (e.getButton() == MouseEvent.BUTTON3 && isRunning) {
      bubbles.add(generateRandomBubble());
      repaint();

    }
  }

  @Override
  public void mousePressed(MouseEvent e) {
  }

  @Override
  public void mouseReleased(MouseEvent e) {
  }

  @Override
  public void mouseEntered(MouseEvent e) {
    // Start the animation when the mouse is clicked
    if (!isRunning) {
      isRunning = true;
      // Add some initial bubbles to the screen
      for (int i = 0; i < NUM_BUBBLES; i++) {
        bubbles.add(generateRandomBubble());
      }
      // Create a new thread to run the animation
      Thread t = new Thread(this);
      t.start();
    }
  }

  @Override
  public void mouseExited(MouseEvent e) {
  }

  private class Bubble {
    private int x;
    private int y;
    private int radius;
    private Color color;
    private int dx;
    private int dy;

    public Bubble(int x, int y, int radius, Color color) {
      this.x = x;
      this.y = y;
      this.radius = radius;
      this.color = color;
      // Generate a random velocity for the bubble
      this.dx = random.nextInt(6) - 3;
      this.dy = random.nextInt(6) - 3;
    }

    public void draw(Graphics g) {
      g.setColor(color);
      g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }

    public void moveRandomly() {
      // Move the bubble by its velocity
      x += dx;
      y += dy;

      // Reverse direction if the bubble hits a wall
      if (x - radius < 0 || x + radius > WIDTH) {
        dx = -dx;
      }
      if (y - radius < 0 || y + radius > HEIGHT) {
        dy = -dy;
      }

    }

  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Bubble Panel");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new BubblePanel());
    frame.pack();
    frame.setVisible(true);
  }
}