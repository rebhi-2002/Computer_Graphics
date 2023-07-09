import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class window_1 extends JFrame implements ActionListener {
  Container container;
  JMenuBar menubar;
  JMenu menu1, submenu;
  JCheckBox shape_1, shape_2, shape_3, shape_4, shape_5;
  Panel p;
  JButton B1, B3, B4, B5;
  JLabel pic_1, pic_2;
  JLabel copyRight;

  String animate1_String = "GIF";
  String animate2_String = "CopyRight";
  String animate3_String = "RGB";
  JRadioButton animate1_Button = new JRadioButton(animate1_String);
  JRadioButton animate2_Button = new JRadioButton(animate2_String);
  JRadioButton animate3_Button = new JRadioButton(animate3_String);
  JRadioButton animate4_Button = new JRadioButton("No Animation");

  public window_1() {

    super("Home Work One");

    container = getContentPane();
    container.add(menubar = new JMenuBar(), BorderLayout.NORTH);

    menubar.add(menu1 = new JMenu("JMenu"));
    menu1.add(shape_1 = new JCheckBox("A1"));
    menu1.add(shape_2 = new JCheckBox("A2"));
    menu1.add(shape_3 = new JCheckBox("A3"));
    menu1.add(shape_4 = new JCheckBox("A4"));
    menu1.add(shape_5 = new JCheckBox("A5"));
    menu1.addSeparator();

    menu1.add(submenu = new JMenu("Advanced"));
    submenu.add(animate1_Button);
    submenu.add(animate2_Button);
    submenu.add(animate3_Button);
    submenu.add(animate4_Button);

    menu1.add(B1 = new JButton("Submit "));
    B1.setBackground(Color.YELLOW);
    B1.setForeground(Color.BLUE);
    B1.setToolTipText("Press to show");
    B1.setFont(new Font("Arial", Font.BOLD, 16));

    menu1.add(B3 = new JButton("    Exit      "));
    menu1.add(B4 = new JButton("Select All"));
    menu1.add(B5 = new JButton("Reset All "));

    container.add(p = new Panel());

    shape_1.addActionListener(this);
    shape_2.addActionListener(this);
    shape_3.addActionListener(this);
    shape_4.addActionListener(this);
    shape_5.addActionListener(this);

    animate1_Button.addActionListener(this);
    animate2_Button.addActionListener(this);
    animate3_Button.addActionListener(this);
    animate4_Button.addActionListener(this);

    B1.addActionListener(this);
    B3.addActionListener(this);
    B4.addActionListener(this);
    B5.addActionListener(this);

    pic_1 = new JLabel();
    container.add(pic_1, BorderLayout.EAST);

    copyRight = new JLabel("Copyright © 2022-2023 Made With 💖 By Rebhe. All Right Reserved.");
    p.setLayout(null);
    copyRight.setBounds(10, 715, 395, 45);

    setSize(800, 810);
    setVisible(true);
    setResizable(false);
    // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  class Panel extends JPanel {
    boolean Shape1 = false, Shape2 = false, Shape3 = false, Shape4 = false, Shape5 = false;

    @Override
    public void paint(Graphics g) {
      super.paint(g);
      if (Shape1) {
        g.setColor(Color.cyan);
        g.drawLine(125, 50, 175, 50);
        g.drawLine(175, 50, 200, 100);
        g.drawLine(200, 100, 175, 150);
        g.drawLine(175, 150, 125, 150);
        g.drawLine(125, 150, 100, 100);
        g.drawLine(100, 100, 125, 50);
        g.setColor(Color.magenta);
        g.drawLine(100, 100, 200, 100);
        g.drawLine(125, 50, 175, 150);
        g.drawLine(175, 50, 125, 150);
        g.setColor(Color.red);
        g.fillOval(120, 45, 10, 10);
        g.fillOval(170, 45, 10, 10);
        g.fillOval(195, 95, 10, 10);
        g.fillOval(170, 145, 10, 10);
        g.fillOval(120, 145, 10, 10);
        g.fillOval(95, 95, 10, 10);
        g.fillOval(145, 95, 10, 10);
      }
      if (Shape2) {
        g.setColor(Color.black);
        g.drawLine(280, 40, 280, 220);
        g.drawLine(280, 40, 380, 40);
        g.drawLine(380, 40, 380, 75);
        g.drawLine(380, 75, 320, 75);
        g.drawLine(320, 75, 320, 105);
        g.drawLine(320, 105, 350, 105);
        g.drawLine(350, 105, 350, 135);
        g.drawLine(350, 135, 320, 135);
        g.drawLine(320, 135, 320, 220);
        g.drawLine(320, 220, 280, 220);
      }
      if (Shape3) {
        g.setColor(new Color(165, 42, 42));
        g.fillRect(510, 160, 20, 80);
        g.setColor(Color.green);
        g.fillOval(480, 15, 80, 150);
      }
      if (Shape4) {
        g.setColor(Color.black);
        g.drawRect(300, 300, 200, 200);
        g.setColor(Color.red);
        g.fillOval(300, 375, 50, 50);
        g.fillOval(375, 300, 50, 50);
        g.fillOval(450, 375, 50, 50);
        g.fillOval(375, 450, 50, 50);
        g.setColor(Color.blue);
        g.fillOval(350, 350, 100, 100);
      }
      if (Shape5) {

        int x1 = 250, y = 520, w = 150, h = 200, x2 = x1 + w;

        g.setColor(Color.blue);
        g.drawRect(x1, y, w * 2, h);
        System.out.println("g.drawRect(" + x1 + "," + y + "," + w * 2 + "," + h + ");");

        g.setColor(Color.red);
        System.out.println("// ###############");
        for (int i = 0; i < 50; i = i + 10) {
          g.drawOval(x1 + 2 * i, y + i, w - 2 * i, h - 2 * i);
          System.out.println(
              "g.drawOval" + "(" + (x1 + 2 * i) + "," + (y + i) + "," + (w - 2 * i) + "," + (h - 2 * i) + ");");
        }

        System.out.println("// ###############");
        for (int j = 0; j < 50; j = j + 10) {
          g.drawOval(x2, y + j, w - 2 * j, h - 2 * j);
          System.out.println("g.drawOval" + "(" + x2 + "," + (y + j) + "," + (w - 2 * j) + "," + (h - 2 * j) + ");");
        }

      }
    }
  }

  public void actionPerformed(ActionEvent e) {

    if (e.getSource() == shape_1)
      p.Shape1 = shape_1.isSelected();
    else if (e.getSource() == shape_2)
      p.Shape2 = shape_2.isSelected();
    else if (e.getSource() == shape_3)
      p.Shape3 = shape_3.isSelected();
    else if (e.getSource() == shape_4)
      p.Shape4 = shape_4.isSelected();
    else if (e.getSource() == shape_5)
      p.Shape5 = shape_5.isSelected();

    if (e.getSource() == B1) {
      p.repaint();
      String x = "";
      String y = "";

      if (shape_1.isSelected())
        x += "A1 ";
      if (shape_2.isSelected())
        x += "A2 ";
      if (shape_3.isSelected())
        x += "A3 ";
      if (shape_4.isSelected())
        x += "A4 ";
      if (shape_5.isSelected())
        x += "A5 ";
      if (x.length() == 0)
        x += "Nothing ";

      if (animate1_Button.isSelected()) {
        pic_1.setIcon(new ImageIcon("1.gif"));
        y += "And Your Select Animation 1";
      } else {
        pic_1.setIcon(new ImageIcon(""));
      }

      if (animate2_Button.isSelected()) {
        p.add(copyRight);
      } else {
        p.remove(copyRight);
      }

      if (animate3_Button.isSelected()) {
        Color c = JColorChooser.showDialog(p, "Color Picker", p.getBackground());
        p.setBackground(c);
        if (c != null)
          y += "And Your Select Animation 3";
        else
          y += "And Your Cancel Animation 3 After Celected";
      } else {
        p.setBackground(new Color(238, 238, 238, 255));
      }

      if (y.length() == 0)
        y += "And Your Don't Select Any Animation";

      JOptionPane.showMessageDialog(this, "Your shapes is " + x + y);
    }

    if (e.getSource() == B3)
      System.exit(0);

    ButtonGroup group = new ButtonGroup();
    group.add(animate1_Button);
    group.add(animate2_Button);
    group.add(animate3_Button);
    group.add(animate4_Button);

    if (e.getSource() == B4) {
      shape_1.setSelected(true);
      p.Shape1 = shape_1.isSelected();
      shape_2.setSelected(true);
      p.Shape2 = shape_2.isSelected();
      shape_3.setSelected(true);
      p.Shape3 = shape_3.isSelected();
      shape_4.setSelected(true);
      p.Shape4 = shape_4.isSelected();
      shape_5.setSelected(true);
      p.Shape5 = shape_5.isSelected();
    }

    if (e.getSource() == B5) {
      shape_1.setSelected(false);
      p.Shape1 = shape_1.isSelected();
      shape_2.setSelected(false);
      p.Shape2 = shape_2.isSelected();
      shape_3.setSelected(false);
      p.Shape3 = shape_3.isSelected();
      shape_4.setSelected(false);
      p.Shape4 = shape_4.isSelected();
      shape_5.setSelected(false);
      p.Shape5 = shape_5.isSelected();
      group.clearSelection();
    }
  }
    public static void main(String args[]) {
    new window_1();
  }
}



