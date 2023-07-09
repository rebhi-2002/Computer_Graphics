import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener {

  Container container;
  JMenuBar menubar;
  JMenu HomePage;
  JButton HW_1, HW_2, HW_3;

  public Home() {
    super("#" + "Home Page");

    container = getContentPane();
    container.add(menubar = new JMenuBar(), BorderLayout.NORTH);
    // container.add(new MyPanel());
    container.add(new BubblePanel());

    menubar.add(HomePage = new JMenu("Assignment"));

    HomePage.add(HW_1 = new JButton("Home Work 1"));
    HomePage.add(HW_2 = new JButton("Home Work 2"));
    HomePage.add(HW_3 = new JButton("Home Work 3"));

    HW_1.setBackground(Color.YELLOW);
    HW_2.setBackground(Color.YELLOW);
    HW_3.setBackground(Color.YELLOW);

    HW_1.setForeground(Color.BLUE);
    HW_2.setForeground(Color.BLUE);
    HW_3.setForeground(Color.BLUE);

    HW_1.setToolTipText("Go To HW.1");
    HW_2.setToolTipText("Go To HW.2");
    HW_3.setToolTipText("Go To HW.3");

    HW_1.setFont(new Font("Arial", Font.BOLD, 12));
    HW_2.setFont(new Font("Arial", Font.BOLD, 12));
    HW_3.setFont(new Font("Arial", Font.BOLD, 12));

    HW_1.addActionListener(this);
    HW_2.addActionListener(this);
    HW_3.addActionListener(this);

    // HomePage.add(menu2 = new JMenu("HW.2"));
    // HomePage.add(menu3 = new JMenu("HW.3"));
    // setSize(600, 600);
    setSize(800, 700);
    setVisible(true);
    setResizable(false);
    // this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  class MyPanel extends JPanel {
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
          g.fillRect(col * size, row * size, size, size);
          g.setColor(Color.BLACK);
          g.drawRect(col * size, row * size, size, size);
        }
      }
    }
  }

  public void actionPerformed(ActionEvent e) {

    if (e.getSource() == HW_1)
      new window_1();
    if (e.getSource() == HW_2)
      new window_2();
    if (e.getSource() == HW_3)
      new window_3();
  }

  public static void main(String[] args) {
    new Home();
  }
}
