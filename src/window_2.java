import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class window_2 extends JFrame implements ActionListener {

  public window_2() {
    // super("Home_Work_Two");
    super("Simple Animation");
    JTabbedPane pane = new JTabbedPane();

    pane.addTab("Car", new Car());
    pane.addTab("Balls", new Balls());
    pane.addTab("Any other Shape", new MyPanel());
    pane.addTab("Graphics2D", new graphics2D());
    pane.addTab("Mmosaic", new mosaic());
    pane.addTab("Impressionism", new shape1());
    pane.addTab("Rug", new shape2());
    pane.addTab("Other", new shape3());

    add(pane);

    setSize(600, 600);
    setVisible(true);
    setResizable(false);
    // this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  class MyPanel extends JPanel implements ActionListener {
    // new Drawing
    JButton B3;

    public MyPanel() {
      // new Drawing
      B3 = new JButton("Press Me");
      add(B3);
      setLayout(null);
      B3.setToolTipText("new drawing");
      B3.setFont(new Font("Arial", Font.BOLD, 22));
      B3.setForeground(Color.BLUE);
      B3.setBackground(Color.YELLOW);
      B3.setBorder(BorderFactory.createLineBorder(Color.BLUE));
      B3.setBounds(0, 485, 600, 50);
      B3.addActionListener(this);
    }

    public void paint(Graphics g) {
      super.paint(g);
      // Draw mosaic
      int size = 5;
      int rows = getHeight() / size;
      int cols = getWidth() / size;
      for (int row = 0; row < rows; row++) {
        for (int col = 0; col < cols; col++) {
          int red = (int) (Math.random() * 256);
          int green = (int) (Math.random() * 256);
          int blue = (int) (Math.random() * 256);
          Color color = new Color(red, green, blue);
          g.setColor(color);
          g.fillRect(col * size, row * size - 50, size, size);
          g.setColor(Color.BLACK);
          g.drawRect(col * size, row * size - 50, size, size);
        }
      }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == B3)
        new Drawing();
    }
  }

  class Car extends JPanel implements ActionListener {

    JRadioButton B1, B2;
    int x = 0, y = 248;

    public Car() {
      B1 = new JRadioButton("Drive");
      B2 = new JRadioButton("Stop");

      ButtonGroup group = new ButtonGroup();
      group.add(B1);
      group.add(B2);

      add(B1);
      add(B2);

      B1.addActionListener(this);
      B2.addActionListener(this);

      Timer timer;
      timer = new Timer(200, this);
      timer.start();

    }

    public void paint(Graphics g) {
      super.paint(g);
      g.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2);
      g.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight());
      g.drawRect(x, y, 60, 10);
      g.drawLine(x + 10, y, x + 20, y - 10);
      g.drawLine(x + 20, y - 10, x + 40, y - 10);
      g.drawLine(x + 40, y - 10, x + 50, y);
      g.drawOval(x + 10, y + 10, 10, 10);
      g.drawOval(x + 40, y + 10, 10, 10);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if (B1.isSelected()) {
        x += 10;
        if (x > getWidth())
          x = 0;
        repaint();
      }
    }
  }

  class Balls extends JPanel implements ActionListener {

    JTextField JTF = new JTextField(15);
    int number;

    public Balls() {
      JPanel panel = new JPanel();
      panel.setPreferredSize(new Dimension(600, 30));
      add(panel);
      JLabel L1 = new JLabel("No of Balls");
      JTF.setText(number + "");
      JTF.addActionListener(this);
      panel.add(JTF);
      panel.add(L1);
      panel.setBackground(Color.MAGENTA);
    }

    public void paint(Graphics g) {
      super.paint(g);
      for (int x = 0; x < number; x++) {
        g.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
        g.fillOval((int) (Math.random() * 530 + 10), (int) (Math.random() * 440 + 50), 30, 30);
      }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == JTF) {
        try {
          number = Integer.parseInt(JTF.getText());
        } catch (NumberFormatException ex) {
          JOptionPane.showMessageDialog(this, "Please enter a valid number!", "Invalid input",
              JOptionPane.WARNING_MESSAGE);
        }
        repaint();
      }
    }
  }

  class graphics2D extends Canvas {
    public void paint(Graphics g) {
      super.paint(g);
      Graphics2D g2 = (Graphics2D) g;
      // Define the dimensions of the canvas
      int width = getWidth();
      int height = getHeight();

      // Fill the background with dark blue
      g2.setColor(new Color(10, 25, 72));
      g2.fillRect(0, 0, width, height);

      // Draw geometric shapes
      for (int i = 0; i < 50; i++) {
        int x = (int) (Math.random() * width);
        int y = (int) (Math.random() * height);
        int size = (int) (Math.random() * 80) + 20;

        // Define random colors
        int R = (int) (Math.random() * 256);
        int G = (int) (Math.random() * 256);
        int B = (int) (Math.random() * 256);
        Color color = new Color(R, G, B);
        g2.setColor(color);

        // Draw the shape
        int shape = (int) (Math.random() * 3);
        switch (shape) {
          case 0:
            g2.fillOval(x, y, size, size);
            break;
          case 1:
            g2.fillRect(x, y, size, size);
            break;
          case 2:
            int[] xpoints = { x, x + size / 2, x + size };
            int[] ypoints = { y + size, y, y + size };
            g2.fillPolygon(xpoints, ypoints, 3);
            break;
        }
      }

      // Draw the moon
      int moonX = width - 300;
      int moonY = height - 400;
      int moonRadius = 100;
      g2.setColor(Color.WHITE);
      g2.fillOval(moonX, moonY, moonRadius, moonRadius);

      // Draw the crescent
      int[] xPoints = { moonX + 60, moonX + 100, moonX + 60 };
      int[] yPoints = { moonY + 20, moonY + 50, moonY + 80 };
      g2.setColor(new Color(10, 25, 72));
      g2.fillPolygon(xPoints, yPoints, 3);

      // Draw the star
      int starX = moonX + 30;
      int starY = moonY + 30;
      int starSize = 15;
      int[] xCoords = { starX, starX + starSize, starX + starSize / 2, starX - starSize / 2, starX - starSize };
      int[] yCoords = { starY + starSize / 2, starY + starSize / 2, starY - starSize / 2, starY + starSize / 2,
          starY + starSize / 2 };
      g2.setColor(Color.WHITE);
      g2.fillPolygon(xCoords, yCoords, 5);
    }
  }

  class mosaic extends Canvas {
    public void paint(Graphics g) {
      super.paint(g);
      Graphics2D g2 = (Graphics2D) g;

      // قم بتعريف أبعاد الفسيفساء
      int width = getWidth();
      int height = getHeight();

      // اختر الألوان التي ترغب بها
      g2.setColor(Color.RED);
      g2.fillRect(0, 0, width, height);

      // رسم الزخارف بطريقة عشوائية
      Random rand = new Random();
      for (int i = 0; i < 50; i++) {
        int x = rand.nextInt(width);
        int y = rand.nextInt(height);
        int w = rand.nextInt(50) + 10;
        int h = rand.nextInt(50) + 10;
        g2.setColor(new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)));
        g2.fillOval(x, y, w, h);

        // Set background color
        setBackground(Color.black);

        // Define variables
        Random random = new Random();

        // Draw stars
        for (int j = 0; j < 100; j++) {
          int x2 = random.nextInt(width);
          int y2 = random.nextInt(height);
          int size = random.nextInt(5) + 1;

          // Define random golden color
          int R = 255;
          int G = random.nextInt(90) + 165;
          int B = random.nextInt(20) + 10;
          Color color = new Color(R, G, B);
          g.setColor(color);

          // Draw star
          g.fillRect(x2, y2, size, size);

          // Add sparkle effect
          for (int k = 0; k < size; k++) {
            int sparkleX = x + random.nextInt(size);
            int sparkleY = y + random.nextInt(size);
            g.drawLine(sparkleX, sparkleY, sparkleX, sparkleY);
          }
        }
      }
    }
  }

  class shape1 extends JPanel {
    public void paint(Graphics g) {
      int size = 20;
      for (int y = 0; y < getHeight(); y += size) {
        for (int x = 0; x < getWidth(); x += size) {
          int red = (int) (Math.random() * 256);
          int green = (int) (Math.random() * 256);
          int blue = (int) (Math.random() * 256);
          Color color = new Color(red, green, blue);
          g.setColor(color);
          int shape = (int) (Math.random() * 3);
          if (shape == 0) {
            g.fillOval(x, y, size, size);
          } else if (shape == 1) {
            Polygon p = new Polygon();
            p.addPoint(x + size / 2, y);
            p.addPoint(x + size, y + size);
            p.addPoint(x, y + size);
            g.fillPolygon(p);
          } else if (shape == 2) {
            g.fillRect(x, y, size, size);
          }
        }
      }
    }
  }

  class shape2 extends JPanel {
    public void paint(Graphics g) { // تعيين لون الخلفية
      g.setColor(Color.WHITE);
      g.fillRect(0, 0, getWidth(), getHeight());

      // تعيين لون السجادة
      g.setColor(Color.BLACK);

      // حجم السجادة
      int carpetWidth = getWidth();
      int carpetHeight = getHeight();

      // حجم الخطوط
      int lineWidth = 20;

      // الرسم
      for (int i = 0; i < carpetWidth; i += lineWidth * 2) {
        for (int j = 0; j < carpetHeight; j += lineWidth * 2) {
          g.fillRect(i, j, lineWidth, lineWidth);
          g.fillRect(i + lineWidth, j + lineWidth, lineWidth, lineWidth);
        }
      }
    }
  }

  class shape3 extends JPanel {
    public void paint(Graphics g) {
      // تعيين لون الخلفية
      g.setColor(Color.WHITE);
      g.fillRect(0, 0, getWidth(), getHeight());

      // حجم السجادة
      int carpetWidth = getWidth();
      int carpetHeight = getHeight();

      // تعيين ألوان السجادة
      Color[] colors = {
          Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA,
          Color.ORANGE, Color.PINK, Color.RED, Color.YELLOW
      };

      // حجم الأشكال
      int shapeSize = 50;

      // الرسم
      for (int i = 0; i < carpetWidth; i += shapeSize) {
        for (int j = 0; j < carpetHeight; j += shapeSize) {
          // تعيين لون الشكل
          int colorIndex = (i / shapeSize + j / shapeSize) % colors.length;
          g.setColor(colors[colorIndex]);

          // الرسم بشكل عشوائي
          if (Math.random() < 0.5) {
            g.fillRect(i, j, shapeSize, shapeSize);
          } else {
            g.fillOval(i, j, shapeSize, shapeSize);
          }

        }
      }
    }

  }

  @Override
  public void actionPerformed(ActionEvent e) {

  }

  public static void main(String[] args) {
    new window_2();
  }
}
