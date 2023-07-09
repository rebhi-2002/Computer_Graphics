import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class Drawing extends JFrame implements ActionListener {

  // Draw Bus
  Timer t;
  int x1 = 800, y1 = 565;
  /// Option
  JMenuBar menubar;
  JCheckBox B1;

  public Drawing() {

    super("Any other Shape");

    t = new Timer(120, (ActionListener) this);
    t.start();

    add(new AllOther());

    // Option
    add(menubar = new JMenuBar(), BorderLayout.NORTH);
    menubar.add(B1 = new JCheckBox("Timer"));
    B1.addActionListener(this);
    B1.setBackground(Color.YELLOW);
    B1.setForeground(Color.RED);
    B1.setFont(new Font("Arial", Font.BOLD, 20));

    setSize(1500, 800);
    setVisible(true);
    setResizable(false);
    // sthis.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  class AllOther extends JPanel {
    public void paint(Graphics g) {

      // Draw dark blue sky
      g.setColor(new Color(12, 20, 68));
      g.fillRect(0, 0, getWidth(), getHeight());

      // Draw stars
      g.setColor(Color.WHITE);
      for (int i = 0; i < 50; i++) {
        int starX = (int) (Math.random() * getWidth());
        int starY = (int) (Math.random() * getHeight());
        g.fillOval(starX, starY, 3, 3);
      }

      // Draw stars
      for (int i = 0; i < 200; i++) {
        int x = (int) (Math.random() * getWidth());
        int y = (int) (Math.random() * 300);
        int radius = (int) (Math.random() * 2);
        g.setColor(Color.WHITE);
        g.fillOval(x, y, radius, radius);
      }

      // Draw stars
      g.setColor(Color.WHITE);
      g.fillOval(200, 100, 5, 5);
      g.fillOval(250, 50, 5, 5);
      g.fillOval(300, 150, 5, 5);
      g.fillOval(350, 75, 5, 5);
      g.fillOval(400, 125, 5, 5);
      g.fillOval(450, 100, 5, 5);
      g.fillOval(500, 150, 5, 5);
      g.fillOval(550, 75, 5, 5);
      g.fillOval(600, 125, 5, 5);

      // Draw stars
      g.setColor(Color.WHITE);
      g.fillOval(300, 150, 5, 5);
      g.fillOval(400, 200, 5, 5);
      g.fillOval(500, 100, 5, 5);
      g.fillOval(600, 250, 5, 5);
      g.fillOval(750, 180, 5, 5);

      // Draw light rays
      g.setColor(new Color(200, 200, 255));
      for (int i = 0; i < 20; i++) {
        int rayX = (int) (Math.random() * getWidth());
        int rayY = (int) (Math.random() * getHeight() / 2 + 50);
        int rayEndX = (int) (rayX + Math.random() * 20 - 20);
        int rayEndY = (int) (rayY + Math.random() * 10 + 20);
        g.drawLine(rayX, rayY, rayEndX, rayEndY);
      }

      // Draw rain
      Random rand = new Random();
      g.setColor(new Color(200, 200, 255));
      for (int i = 0; i < 100; i++) {
        int x = rand.nextInt(getWidth());
        int y = rand.nextInt(getHeight());
        g.drawLine(x, y, x + 1, y + 1);
      }

      // Draw moon
      g.setColor(new Color(255, 255, 153));
      g.fillOval(50, 50, 75, 75);

      // Draw clouds

      /* g.setColor(Color.WHITE); */
      g.setColor(Color.decode("#225796"));
      g.fillOval(50, 100, 50, 30);
      g.fillOval(65, 90, 50, 30);
      g.fillOval(80, 100, 50, 30);
      g.fillOval(95, 90, 50, 30);
      g.fillOval(110, 100, 50, 30);

      g.setColor(new Color(189, 195, 199));

      g.fillOval(100, 130, 60, 40);
      g.fillOval(115, 120, 60, 40);
      g.fillOval(130, 130, 60, 40);
      g.fillOval(145, 120, 60, 40);
      g.fillOval(160, 130, 60, 40);

      g.setColor(Color.decode("#d7dbe6"));

      g.fillOval(300, 130, 60, 40);
      g.fillOval(315, 120, 60, 40);
      g.fillOval(330, 130, 60, 40);
      g.fillOval(345, 120, 60, 40);
      g.fillOval(360, 130, 60, 40);

      g.setColor(new Color(189, 195, 199));

      g.fillOval(500, 130, 60, 40);
      g.fillOval(515, 120, 60, 40);
      g.fillOval(530, 130, 60, 40);
      g.fillOval(545, 120, 60, 40);
      g.fillOval(560, 130, 60, 40);

      g.setColor(Color.decode("#d7dbe6"));

      g.fillOval(700, 130, 60, 40);
      g.fillOval(715, 120, 60, 40);
      g.fillOval(730, 130, 60, 40);
      g.fillOval(745, 120, 60, 40);
      g.fillOval(760, 130, 60, 40);

      g.setColor(new Color(189, 195, 199));

      g.fillOval(900, 130, 60, 40);
      g.fillOval(915, 120, 60, 40);
      g.fillOval(930, 130, 60, 40);
      g.fillOval(945, 120, 60, 40);
      g.fillOval(960, 130, 60, 40);

      g.setColor(Color.decode("#d7dbe6"));

      g.fillOval(1100, 130, 60, 40);
      g.fillOval(1115, 120, 60, 40);
      g.fillOval(1130, 130, 60, 40);
      g.fillOval(1145, 120, 60, 40);
      g.fillOval(1160, 130, 60, 40);

      g.setColor(new Color(189, 195, 199));

      g.fillOval(1300, 130, 60, 40);
      g.fillOval(1315, 120, 60, 40);
      g.fillOval(1330, 130, 60, 40);
      g.fillOval(1345, 120, 60, 40);
      g.fillOval(1360, 130, 60, 40);

      g.setColor(Color.decode("#d7dbe6"));

      g.fillOval(205, 175, 60, 40);
      g.fillOval(220, 165, 60, 40);
      g.fillOval(235, 175, 60, 40);
      g.fillOval(250, 165, 60, 40);
      g.fillOval(265, 175, 60, 40);

      g.setColor(new Color(189, 195, 199));

      g.fillOval(405, 175, 60, 40);
      g.fillOval(420, 165, 60, 40);
      g.fillOval(435, 175, 60, 40);
      g.fillOval(450, 165, 60, 40);
      g.fillOval(465, 175, 60, 40);

      g.setColor(Color.decode("#d7dbe6"));

      g.fillOval(605, 175, 60, 40);
      g.fillOval(620, 165, 60, 40);
      g.fillOval(635, 175, 60, 40);
      g.fillOval(650, 165, 60, 40);
      g.fillOval(665, 175, 60, 40);

      g.setColor(new Color(189, 195, 199));

      g.fillOval(805, 175, 60, 40);
      g.fillOval(820, 165, 60, 40);
      g.fillOval(835, 175, 60, 40);
      g.fillOval(850, 165, 60, 40);
      g.fillOval(865, 175, 60, 40);

      g.setColor(Color.decode("#d7dbe6"));

      g.fillOval(1005, 175, 60, 40);
      g.fillOval(1020, 165, 60, 40);
      g.fillOval(1035, 175, 60, 40);
      g.fillOval(1050, 165, 60, 40);
      g.fillOval(1065, 175, 60, 40);

      g.setColor(new Color(189, 195, 199));

      g.fillOval(1205, 175, 60, 40);
      g.fillOval(1220, 165, 60, 40);
      g.fillOval(1235, 175, 60, 40);
      g.fillOval(1247, 165, 60, 40);
      g.fillOval(1262, 175, 60, 40);

      // Draw city
      g.setColor(new Color(150, 150, 150));
      g.fillRect(0, getHeight() - 100, getWidth(), 100);
      g.fillRect(0, getHeight() - 150, getWidth(), 50);

      // Draw house
      g.setColor(new Color(192, 57, 43));
      g.fillRect(50, getHeight() - 250, 150, 150);

      // Draw door
      g.setColor(new Color(44, 62, 80));
      g.fillRect(95, getHeight() - 150, 60, 50);

      // Draw windows
      g.setColor(Color.WHITE);
      g.drawRect(70, getHeight() - 210, 40, 40);
      g.fillRect(70, getHeight() - 210, 40, 40);
      g.drawRect(140, getHeight() - 210, 40, 40);
      g.fillRect(140, getHeight() - 210, 40, 40);

      // Add roof to the house
      int[] xPoints = { 50, 125, 200 };
      int[] yPoints = { getHeight() - 250, getHeight() - 300, getHeight() - 250 };
      Polygon roof = new Polygon(xPoints, yPoints, 3);
      g.setColor(new Color(149, 165, 166));
      g.fillPolygon(roof);

      // Draw person
      g.setColor(Color.BLUE);
      g.fillRect(170, getHeight() - 130, 10, 30);
      g.fillOval(165, getHeight() - 140, 20, 20);
      g.drawLine(175, getHeight() - 100, 170, getHeight() - 110);
      g.drawLine(175, getHeight() - 100, 180, getHeight() - 110);

      // Draw buildings
      g.setColor(new Color(50, 50, 50));
      g.fillRect(225, getHeight() - 250, 95, 150);
      g.fillRect(400, getHeight() - 175, 95, 75);

      // Add windows to buildings
      g.setColor(Color.YELLOW);
      for (int i = 0; i < 100; i += 25) {
        for (int j = 0; j < 150; j += 25) {
          g.fillRect(225 + i, getHeight() - 250 - j, 20, 20);
        }
      }
      for (int i = 0; i < 100; i += 25) {
        for (int j = 0; j < 75; j += 25) {
          g.fillRect(400 + i, getHeight() - 175 - j, 20, 20);
        }
      }

      // Draw road
      g.setColor(Color.GRAY);
      g.fillRect(0, getHeight() - 75, getWidth(), getHeight());
      g.setColor(new Color(220, 220, 220));
      for (int i = 0; i < getWidth(); i += 50) {
        g.fillRect(i, getHeight() - 45, 25, 10);
      }

      // Draw Car

      g.setColor(new Color(220, 0, 0)); // Ferrari red
      g.fillRect(600, getHeight() - 120, 100, 40); // Enlarge the car

      // Draw windows
      g.setColor(new Color(245, 245, 245));
      g.fillRect(610, getHeight() - 110, 25, 20); // Front window
      g.fillRect(655, getHeight() - 110, 25, 20); // Rear window

      // Draw wheels
      g.setColor(new Color(50, 50, 50)); // Ferrari dark gray
      g.fillOval(610, getHeight() - 80, 25, 25); // Enlarge the wheels
      g.fillOval(665, getHeight() - 80, 25, 25);

      // Draw wheel rims
      g.setColor(new Color(245, 245, 245));
      g.fillOval(617, getHeight() - 73, 10, 10); // Front wheel rim
      g.fillOval(672, getHeight() - 73, 10, 10); // Rear wheel rim

      g.setColor(new Color(50, 50, 50)); // Ferrari dark gray
      g.fillOval(642, getHeight() - 95, 5, 5);
      g.fillOval(642, getHeight() - 110, 5, 5);

      // Move the wheels to the left with the car
      for (int i = 0; i < 25; i += 5) {
        g.setColor(Color.WHITE);
        g.drawLine(627 + i, getHeight() - 65, 632 + i, getHeight() - 65);
        g.drawLine(627 + i, getHeight() - 60, 632 + i, getHeight() - 60);
        g.drawLine(637 + i, getHeight() - 65, 642 + i, getHeight() - 65);
        g.drawLine(637 + i, getHeight() - 60, 642 + i, getHeight() - 60);
      }

      // draw snowman

      // out body
      g.setColor(new Color(255, 255, 255)); // white
      g.fillOval(1245, 450, 200, 200);
      g.setColor(new Color(0, 0, 0)); // black
      g.fillArc(1245, 450, 200, 200, 0, 360);

      int X = 1200;
      int Y = 210;

      g.setColor(Color.BLACK); // hat color
      g.fillRect(X + 120, Y + 190, 60, 10); // hat brim
      g.setColor(Color.RED); // fez color
      g.fillRect(X + 135, Y + 150, 30, 40); // fez top
      g.setColor(Color.WHITE); // head color
      g.fillOval(X + 110, Y + 200, 80, 80); // head
      g.setColor(Color.BLACK); // eye color
      g.fillOval(X + 130, Y + 225, 10, 10); // left eye
      g.fillOval(X + 170, Y + 225, 10, 10); // right eye
      g.setColor(Color.ORANGE); // nose color
      g.fillOval(X + 150, Y + 240, 20, 20); // nose
      g.setColor(Color.WHITE); // body color
      g.fillOval(X + 70, Y + 280, 160, 160); // body
      g.setColor(Color.LIGHT_GRAY); // scarf color
      g.fillRect(X + 110, Y + 350, 80, 10); // scarf top
      g.fillRect(X + 125, Y + 360, 50, 10); // scarf bottom
      g.setColor(Color.BLACK); // waist color
      g.fillRect(X + 135, Y + 390, 30, 10); // waist
      g.setColor(Color.BLACK); // belt color
      g.fillRect(X + 120, Y + 405, 60, 10); // belt
      g.setColor(Color.BLACK); // button color
      g.fillOval(X + 145, Y + 330, 10, 10); // top button
      g.fillOval(X + 145, Y + 360, 10, 10); // middle button
      g.fillOval(X + 145, Y + 390, 10, 10); // bottom button
      g.setColor(Color.BLACK); // arm color

      // Adjusted arm positions

      // g.drawLine(X + 90, Y + 320, X + 45, Y + 340); // left arm
      // g.drawLine(X + 230, Y + 320, X + 160, Y + 340); // right arm

      float thickness = 5;
      Graphics2D g2d = (Graphics2D) g;
      g2d.setStroke(new BasicStroke(thickness));
      g.drawLine(X + 90, Y + 320, X + 45, Y + 340); // left arm
      g.drawLine(X + 230, Y + 320, X + 160, Y + 340); // right arm

      // Draw street light
      int x = 360;
      int y = getHeight() - 100;
      int poleWidth = 10;
      int poleHeight = 150;
      int lightRadius = 50;

      // Draw pole
      g.setColor(new Color(112, 128, 144));
      g.fillRect(x - poleWidth / 2, y - poleHeight, poleWidth, poleHeight);

      // Draw light
      g.setColor(new Color(255, 255, 102));
      g.fillOval(x - lightRadius / 2, y - poleHeight - lightRadius / 2, lightRadius, lightRadius);

      // Draw light post's head
      int headWidth = 40;
      int headHeight = 20;
      g.setColor(new Color(112, 128, 144));
      g.fillRect(x - headWidth / 2, y - poleHeight - lightRadius / 2 - headHeight, headWidth, headHeight);

      // Draw trees
      g.setColor(Color.DARK_GRAY);
      g.fillRect(930, 520, 20, 60);
      g.fillRect(540, 500, 30, 80);
      g.setColor(Color.GREEN);
      g.fillOval(915, 490, 50, 50);
      g.fillOval(520, 450, 70, 70);

      // Draw Town

      int x2 = 550, y2 = 330;

      // Draw buildings
      g.setColor(Color.LIGHT_GRAY);
      g.fillRect(x2 + 50, y2 + 50, 100, 200);
      g.fillRect(x2 + 250, y2 + 100, 80, 150);
      g.fillRect(x2 + 450, y2 + 0, 120, 250);

      // Draw windows
      g.setColor(Color.YELLOW);
      // System.out.println("#############################");
      for (int i = 0; i < 5; i++) {
        g.fillRect(x2 + 60, y2 + 60 + i * 40, 20, 20);
        // System.out.println("g.fillRect(" + (x2 + 60) + ", " + (y2 + 60 + i * 40) + ",
        // " + (20) + ", " + (20) + ");");
        g.fillRect(x2 + 80, y2 + 60 + i * 40, 20, 20);
        // System.out.println("g.fillRect(" + (x2 + 80) + ", " + (y2 + 60 + i * 40) + ",
        // " + (20) + ", " + (20) + ");");
      }
      // System.out.println("#############################");
      for (int i = 0; i < 3; i++) {
        g.fillRect(x2 + 260, y2 + 110 + i * 50, 20, 20);
        // System.out.println("g.fillRect(" + (x2 + 260) + ", " + (y2 + 110 + i * 50) +
        // ", " + (20) + ", " + (20) + ");");
        g.fillRect(x2 + 280, y2 + 110 + i * 50, 20, 20);
        // System.out.println("g.fillRect(" + (x2 + 280) + ", " + (y2 + 110 + i * 50) +
        // ", " + (20) + ", " + (20) + ");");
      }
      // System.out.println("#############################");
      for (int i = 0; i < 7; i++) {
        g.fillRect(x2 + 460, y2 + 30 + i * 30, 40, 20);
        // System.out.println("g.fillRect(" + (x2 + 460) + ", " + (y2 + 30 + i * 30) +
        // ", " + (40) + ", " + (20) + ");");
        g.fillRect(x2 + 480, y2 + 30 + i * 30, 40, 20);
        // System.out.println("g.fillRect(" + (x2 + 480) + ", " + (y2 + 30 + i * 30) +
        // ", " + (40) + ", " + (20) + ");");
      }
      // System.out.println("#############################");

      // draw stars
      g.setColor(new Color(255, 255, 255));
      g.fillOval(200, 100, 10, 10);
      g.fillOval(400, 50, 10, 10);
      g.fillOval(550, 200, 10, 10);
      g.fillOval(750, 150, 10, 10);
      g.fillOval(900, 300, 10, 10);
      g.fillOval(1100, 250, 10, 10);
      g.fillOval(1250, 400, 10, 10);
      g.fillOval(1450, 350, 10, 10);

      // Draw sun
      int i = 750, j = 520;
      g.setColor(Color.WHITE);
      g.fillOval(i + 420, j + 70, 20, 20);
      g.fillOval(i + 460, j + 70, 20, 20);
      g.fillOval(i + 420, j + 110, 20, 20);
      g.fillOval(i + 460, j + 110, 20, 20);
      g.fillOval(i + 435, j + 90, 30, 30);

      // Draw clouds
      g.setColor(Color.WHITE);
      g.fillOval(50, 250, 60, 30);
      g.fillOval(80, 260, 60, 30);
      g.fillOval(65, 240, 60, 30);
      g.fillOval(220, 50, 60, 30);
      g.fillOval(250, 60, 60, 30);
      g.fillOval(235, 40, 60, 30);

    }
  }

  public void paint(Graphics g) {
    super.paint(g);
    // Draw Bus

    g.setColor(new Color(226, 88, 34));

    g.fillOval(x1 + 108, y1 + 205, 8, 8); // chimney

    g.setColor(new Color(255, 216, 0));

    g.fillRect(x1 + 120, y1 + 200, 8, 8); // chimney
    g.fillRect(x1 + 112, y1 + 205, 16, 8); // chimney

    g.fillRect(x1 + 130, y1 + 85, 160, 15); // roof
    g.setColor(Color.white);
    g.drawRect(x1 + 130, y1 + 85, 160, 15); // roof

    g.setColor(new Color(254, 219, 0));
    g.fillRect(x1 + 100, y1 + 100, 250, 100); // rectangle

    g.fillArc(x1 + 280, y1 + 100, 140, 140, 0, 90); // Top Arch
    g.fillArc(x1 + 280, y1 + 125, 140, 80, 0, -90); // Bottom Arch

    g.setColor(new Color(55, 40, 0));
    g.fillOval(x1 + 160, y1 + 180, 40, 40); // external wheel
    g.fillOval(x1 + 320, y1 + 180, 40, 40); // external wheel

    g.setColor(new Color(255, 255, 255));
    g.fillOval(x1 + 166, y1 + 186, 28, 28); // internal wheel
    g.fillOval(x1 + 326, y1 + 186, 28, 28); // internal wheel

    g.setColor(new Color(199, 227, 225));
    g.fillRect(x1 + 125, y1 + 120, 25, 25); // window_1
    g.fillRect(x1 + 175, y1 + 120, 25, 25); // window_2
    g.fillRect(x1 + 225, y1 + 120, 25, 25); // window_3
    g.fillRect(x1 + 275, y1 + 120, 25, 25); // window_4
    g.fillRect(x1 + 325, y1 + 120, 25, 25); // window_5
    g.fillArc(x1 + 362, y1 + 142, 35, 55, 0, 180); // window_6

    g.setColor(Color.black);
    g.fillArc(x1 + 115, y1 + 110, 20, 20, 270, 90); // inner_window_1
    g.fillArc(x1 + 165, y1 + 110, 20, 20, 270, 90); // inner_window_2
    g.fillArc(x1 + 215, y1 + 110, 20, 20, 270, 90); // inner_window_3
    g.fillArc(x1 + 265, y1 + 110, 20, 20, 270, 90); // inner_window_4
    g.fillArc(x1 + 315, y1 + 110, 20, 20, 270, 90); // inner_window_5

    g.fillArc(x1 + 140, y1 + 110, 20, 20, 180, 90); // inner_window_1
    g.fillArc(x1 + 190, y1 + 110, 20, 20, 180, 90); // inner_window_2
    g.fillArc(x1 + 240, y1 + 110, 20, 20, 180, 90); // inner_window_3
    g.fillArc(x1 + 290, y1 + 110, 20, 20, 180, 90); // inner_window_4
    g.fillArc(x1 + 340, y1 + 110, 20, 20, 180, 90); // inner_window_5

    g.fillArc(x1 + 140, y1 + 135, 20, 20, 90, 90); // inner_window_1
    g.fillArc(x1 + 190, y1 + 135, 20, 20, 90, 90); // inner_window_2
    g.fillArc(x1 + 240, y1 + 135, 20, 20, 90, 90); // inner_window_3
    g.fillArc(x1 + 290, y1 + 135, 20, 20, 90, 90); // inner_window_4
    g.fillArc(x1 + 340, y1 + 135, 20, 20, 90, 90); // inner_window_5

    g.fillArc(x1 + 115, y1 + 135, 20, 20, 0, 90); // inner_window_1
    g.fillArc(x1 + 165, y1 + 135, 20, 20, 0, 90); // inner_window_2
    g.fillArc(x1 + 215, y1 + 135, 20, 20, 0, 90); // inner_window_3
    g.fillArc(x1 + 265, y1 + 135, 20, 20, 0, 90); // inner_window_4
    g.fillArc(x1 + 315, y1 + 135, 20, 20, 0, 90); // inner_window_5

    g.fillArc(x1 + 362, y1 + 142, 35, 55, 0, 90); // inner_window_6

    // Draw street light
    g.setColor(Color.BLACK);
    g.fillRect(750, getHeight() - 200, 20, 200);
    g.setColor(Color.YELLOW);
    g.fillOval(745, getHeight() - 230, 30, 30);
    g.setColor(Color.WHITE);
    g.fillOval(745, getHeight() - 200, 30, 30);

  }

  public void actionPerformed(ActionEvent e) {
    // Option (Timer)
    if (B1.isSelected()) {

      B1.setSelected(true);
      t.start();
      x1 += 10;

      if (x1 == getWidth())
        x1 = -100;

      if (x1 == 500) {
        JOptionPane.showMessageDialog(this, "You have reached your destination", "Wake up",
            JOptionPane.WARNING_MESSAGE);
        B1.setSelected(false);
        t.stop();
      }

      repaint();
    }

  }

  public static void main(String[] args) {
    new Drawing();
  }

}
