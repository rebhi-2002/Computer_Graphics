import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

// * Panel (1)
// class Qustion1 extends JPanel {
//   public Qustion1() {}
//   @Override
//   public void paint(Graphics g) {
//     super.paint(g);
//     Graphics2D g2d = (Graphics2D) g;
//     int x[] = {160, 220, 220, 190, 160};
//     int y[] = {130, 130, 160, 180, 160};
//     g2d.rotate(-45 * Math.PI / 180, 500, 0);
//     g2d.transform(new AffineTransform(1, 0, 0, -1, 0, 0));
//     g2d.rotate(45 * Math.PI / 180, 500, 0);
//     g2d.drawPolygon(x, y, 5);
//   }
// }

class Qustion1 extends JPanel {
  public Qustion1() {}
  @Override
  public void paint(Graphics g) {
    super.paint(g);
    Graphics2D g2d = (Graphics2D) g;
    g2d.setBackground(Color.lightGray);
    g2d.clearRect(0, 0, getWidth(), getHeight());
    int x[] = {160, 220, 220, 190, 160};
    int y[] = {130, 130, 160, 180, 160};
    // Drawing the original shape
		g2d.setStroke(new BasicStroke(2)); // Setting the stroke width
    g2d.drawPolygon(x, y, 5);
    // Reflecting the shape about the line Y = -X + 500
    AffineTransform reflectTransform = new AffineTransform(1, 0, 0, -1, 0, 0);
    reflectTransform.rotate(-45 * Math.PI / 180, 500, 0);
    int reflectedX[] = new int[x.length];
    int reflectedY[] = new int[y.length];
    for (int i = 0; i < x.length; i++) {
      Point2D point = reflectTransform.transform(new Point(x[i], y[i]), null);
      reflectedX[i] = (int) point.getX();
      reflectedY[i] = (int) point.getY();
    }
    // Drawing the reflection line
		g2d.setColor(Color.blue);
		// g2d.setStroke(new BasicStroke(2)); // Setting the stroke width
		g2d.drawLine(0, 500, 1000, 0);
    // Drawing the reflected shape
    g2d.setColor(Color.red);
		// g2d.setStroke(new BasicStroke(2)); // Setting the stroke width
    g2d.drawPolygon(reflectedX, reflectedY, 5);
		// Resetting the transformation and drawing the original shape again
	  g2d.rotate(-45 * Math.PI / 180, 500, 0);
    g2d.transform(new AffineTransform(1, 0, 0, -1, 0, 0));
    g2d.rotate(45 * Math.PI / 180, 500, 0);
    g2d.drawPolygon(x, y, 5);
  }
}

// * Panel (2)
class Qustion2 extends JPanel {
  public Qustion2() {}
  Graphics2D g2d;
	public void left(double a) {
    g2d.rotate(-a * Math.PI / 180);
  }
  public void right(double a) {
    g2d.rotate(a * Math.PI / 180);
  }
  public void forward(int length) {
    g2d.drawLine(0, 0, length, 0);
    g2d.translate(length, 0);
  }
  public void moveTo(int x, int y) {
    g2d.translate(x, y);
  }
  void f2() {
    int length = 120;
    double angle = 120;
    left(-angle / 2);
    int x = 0, y = -15, w = 120, h = 30;
    int x1 = -90;
    for (int i = 0; i <= 5; i++) {
      g2d.setColor(Color.blue);
      g2d.drawOval(x, y, w, h);
      left(-angle / 2);
      g2d.setColor(Color.black);
      forward(length);
      left(angle);
      g2d.setColor(Color.blue);
      g2d.drawOval(x, y, w, h);
      left(-angle / 2);
      g2d.setColor(Color.blue);
      g2d.fillOval(x, y, w, h);
      forward(length);
      g2d.setColor(Color.red);
      g2d.fillRect(x1, x, w / 2, h * 2);
			g2d.drawLine((x), (y + h / 2), (x1 * 2 + w / 2), (y + h / 2));
      g2d.setColor(Color.blue);
      left(angle);
      g2d.drawOval(x, y, w, h);
    }
  }
  @Override
  public void paint(Graphics g) {
    super.paint(g);
    g2d = (Graphics2D) g;
    moveTo(180, 180);
    f2();
  }
}

// * Panel (3)
class Qustion3 extends JPanel {
  public Qustion3() {}
  Graphics2D g2d;
  public void left(double a) {
    g2d.rotate(-a * Math.PI / 180);
  }
  public void right(double a) {
    g2d.rotate(a * Math.PI / 180);
  }
  public void forward(int length) {
    g2d.drawLine(0, 0, length, 0);
    g2d.translate(length, 0);
  }
  public void moveTo(int x, int y) {
    g2d.translate(x, y);
  }
  void f1() {
    int length = 120;
    double angle = 120;
    forward(length);
    left(angle);
    forward(length);
    left(angle);
    forward(length);
    left(angle - 5);
  }
  @Override
  public void paint(Graphics g) {
    super.paint(g);
    g2d = (Graphics2D) g;
    moveTo(getWidth() / 2 - 10, getHeight() / 2 - 10);
    for (int i = 1; i <= 8; i++) {
      g2d.rotate(-50 * Math.PI / 180);
      f1();
    }
  }
}

// * Panel (4)
class Qustion4 extends JPanel {
  public Qustion4() {}
  Graphics2D g2d;
  public void left(double a) {
    g2d.rotate(-a * Math.PI / 180);
  }
  public void right(double a) {
    g2d.rotate(a * Math.PI / 180);
  }
  public void forward(int length) {
    g2d.drawLine(0, 0, length, 0);
    g2d.translate(length, 0);
  }
  public void moveTo(int x, int y) {
    g2d.translate(x, y);
  }
  void f() {
    int length = 60;
    double angle = 120;
    for (int j = 1; j <= 3; j++) {
      forward(length);
      left(angle);
    }
    forward(length);
    left(30);
  }
  @Override
  public void paint(Graphics g) {
    super.paint(g);
    g2d = (Graphics2D) g;
    moveTo(220, 380);
    for (int i = 1; i <= 12; i++) {
      f();
    }
  }
}

// * Panel (5)
// class Qustion5 extends JPanel {
// 	public Qustion5() {
// 	}

// 	@Override
// 	public void paint(Graphics g) {
// 			super.paint(g);
// 			Graphics2D g2d = (Graphics2D) g;
			
// 			// Set rendering hints for better quality
// 			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
// 			g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
			
// 			// Set up the shape parameters
// 			int x = 100;
// 			int y = 100;
// 			int width = 200;
// 			int height = 200;
// 			int startAngle = 45;
// 			int arcAngle = 270;
			
// 			// Draw the shape
// 			g2d.setColor(Color.blue);
// 			g2d.fillArc(x, y, width, height, startAngle, arcAngle);
			
// 			// Draw additional effects
// 			g2d.setColor(Color.white);
// 			g2d.setStroke(new BasicStroke(5));
			
// 			// Draw lines inside the shape
// 			int numLines = 10;
// 			int lineSpacing = width / numLines;
// 			for (int i = 0; i < numLines; i++) {
// 					int startX = x + (i * lineSpacing);
// 					int startY = y;
// 					int endX = startX;
// 					int endY = y + height;
// 					g2d.drawLine(startX, startY, endX, endY);
// 			}
			
// 			// Draw a border around the shape
// 			g2d.setColor(Color.black);
// 			g2d.drawArc(x, y, width, height, startAngle, arcAngle);
// 	}
// }

// * Panel (5)
// class Qustion5 extends JPanel {
// 	public Qustion5() {}
// 	@Override
// 	public void paintComponent(Graphics g) {
// 		super.paintComponent(g);
// 		Graphics2D g2d = (Graphics2D) g;
// 		// Set rendering hints for better quality
// 		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
// 		g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
// 		// Set up the shape parameters
// 		int x = 100;
// 		int y = 100;
// 		int width = 200;
// 		int height = 200;
// 		int startAngle = 45;
// 		int arcAngle = 270;
// 		// Draw the shape
// 		g2d.setColor(new Color(39, 120, 237));
// 		g2d.fillArc(x, y, width, height, startAngle, arcAngle);
// 		// Draw additional effects
// 		g2d.setStroke(new BasicStroke(3));
// 		// Draw lines inside the shape
// 		int numLines = 20;
// 		int lineSpacing = width / numLines;
// 		for (int i = 0; i < numLines; i++) {
// 			int startX = x + (i * lineSpacing);
// 			int startY = y;
// 			int endX = startX;
// 			int endY = y + height;
// 			g2d.setColor(new Color(255, 255, 255, 50));
// 			g2d.drawLine(startX, startY, endX, endY);
// 		}
// 		// Draw a border around the shape
// 		g2d.setColor(new Color(39, 39, 39));
// 		g2d.drawArc(x, y, width, height, startAngle, arcAngle);
// 	}
// }

// * Panel (5)
class Qustion5 extends JPanel {
	public Qustion5() {
		setOpaque(false); // تجعل الخلفية شفافة
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		// Set rendering hints for better quality
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		// Get the width and height of the panel
		int panelWidth = getWidth();
		int panelHeight = getHeight();
		// Set up the shape parameters
		int x = 100;
		int y = 100;
		int width = 200;
		int height = 200;
		int startAngle = 45;
		int arcAngle = 270;
		// Draw the background
		g2d.setColor(new Color(252, 253, 255));
		g2d.fillRect(0, 0, panelWidth, panelHeight);
		// Draw the shape
		g2d.setColor(new Color(39, 120, 237));
		g2d.fillArc(x, y, width, height, startAngle, arcAngle);
		// Draw additional effects
		g2d.setStroke(new BasicStroke(3));
		// Draw lines inside the shape
		int numLines = 20;
		int lineSpacing = width / numLines;
		for (int i = 0; i < numLines; i++) {
			int startX = x + (i * lineSpacing);
			int startY = y;
			int endX = startX;
			int endY = y + height;
			g2d.setColor(new Color(255, 255, 255, 50));
			g2d.drawLine(startX, startY, endX, endY);
		}
		// Draw a border around the shape
		g2d.setColor(new Color(39, 39, 39));
		g2d.drawArc(x, y, width, height, startAngle, arcAngle);
	}
}

// * Main function
class window_3 extends JFrame {
  JTabbedPane pane;
  public window_3() {
    add(pane = new JTabbedPane());
    pane.addTab("Qustion(1)", new Qustion1());
    pane.insertTab("Qustion(2)", null, new Qustion2(), null, 1);
    pane.insertTab("Qustion(3)", null, new Qustion3(), null, 2);
    pane.addTab("Qustion(4)", new Qustion4());
    pane.addTab("**Extra Shape**", new Qustion5());
    pane.setTabPlacement(JTabbedPane.LEFT);
    setTitle("Home Work '3'");
    setSize(600, 600);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
  }
  public static void main(String args[]) {
    new window_3();
  }
}
