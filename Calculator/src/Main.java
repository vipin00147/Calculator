import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Main implements ActionListener,KeyListener {
    private JTextField textfield;
    private JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    private JButton div, p_age, ac, add_min, equal, dec, add, min, mul;
    private String string = "";
    JFrame f = new JFrame("Calculator");

    Main() {

        textfield = new JTextField("", 3);
        textfield.setFont(new Font("Arial", Font.PLAIN, 25));
        textfield.setHorizontalAlignment(JTextField.RIGHT);

        ac = new JButton("AC");
        add_min = new JButton("±");
        p_age = new JButton("%");
        div = new JButton("÷");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        equal = new JButton("=");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b0 = new JButton("0");
        dec = new JButton(".");
        mul = new JButton("x");
        min = new JButton("-");
        add = new JButton("+");

        ac.setFont(new Font("Arial", Font.BOLD, 20));
        add_min.setFont(new Font("Arial", Font.PLAIN, 20));
        p_age.setFont(new Font("Arial", Font.PLAIN, 20));
        div.setFont(new Font("Arial", Font.PLAIN, 20));
        mul.setFont(new Font("Arial", Font.PLAIN, 20));
        min.setFont(new Font("Arial", Font.PLAIN, 20));
        add.setFont(new Font("Arial", Font.PLAIN, 20));
        equal.setFont(new Font("Arial", Font.PLAIN, 20));
        dec.setFont(new Font("Arial", Font.PLAIN, 20));
        b0.setFont(new Font("Arial", Font.PLAIN, 20));
        b1.setFont(new Font("Arial", Font.PLAIN, 20));
        b2.setFont(new Font("Arial", Font.PLAIN, 20));
        b3.setFont(new Font("Arial", Font.PLAIN, 20));
        b4.setFont(new Font("Arial", Font.PLAIN, 20));
        b5.setFont(new Font("Arial", Font.PLAIN, 20));
        b6.setFont(new Font("Arial", Font.PLAIN, 20));
        b7.setFont(new Font("Arial", Font.PLAIN, 20));
        b8.setFont(new Font("Arial", Font.PLAIN, 20));
        b9.setFont(new Font("Arial", Font.PLAIN, 20));


        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(240, 300);
        f.setVisible(true);
    }

    private void setBounds() {
        textfield.setBounds(0, 0, 240, 50);
        ac.setBounds(0, 50, 60, 45);
        add_min.setBounds(60, 50, 60, 45);
        p_age.setBounds(120, 50, 60, 45);
        div.setBounds(180, 50, 60, 45);
        b7.setBounds(0, 100, 60, 45);
        b8.setBounds(60, 100, 60, 45);
        b9.setBounds(110, 100, 60, 45);
        equal.setBounds(160, 250, 60, 45);
        b4.setBounds(0, 150, 60, 45);
        b5.setBounds(60, 150, 60, 45);
        b6.setBounds(110, 150, 60, 45);
        b1.setBounds(0, 200, 60, 45);
        b2.setBounds(60, 200, 60, 45);
        b3.setBounds(110, 200, 60, 45);
        b0.setBounds(0, 250, 105, 45);
        dec.setBounds(110, 250, 60, 45);
        mul.setBounds(160, 100, 60, 45);
        min.setBounds(160, 150, 60, 45);
        add.setBounds(160, 200, 60, 45);
    }

    private void addToFrame() {
        Container container[] = {textfield, ac, add_min, p_age, div, mul, min, add, equal,
                dec, b0, b1, b2, b3, b4, b5, b6, b7, b8, b9};
        for (Container components : container) {
            f.add(components);
        }
    }

    void setKeyListener() {
        Container components[] = {textfield, ac, add_min, p_age, div, mul, min, add, equal,
                dec, b0, b1, b2, b3, b4, b5, b6, b7, b8, b9};
        for (Component component : components) {
            component.addKeyListener(this);
        }
    }

    public void setActionListener() {
        textfield.addActionListener(this);
        ac.addActionListener(this);
        add_min.addActionListener(this);
        p_age.addActionListener(this);
        div.addActionListener(this);
        mul.addActionListener(this);
        min.addActionListener(this);
        add.addActionListener(this);
        equal.addActionListener(this);
        dec.addActionListener(this);
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == '+') {

        } else if (e.getKeyChar() == '-') {

        } else if (e.getKeyChar() == '*') {

        } else if (e.getKeyChar() == '/') {

        } else if (e.getKeyChar() == '=') {

        }
        if ((e.getKeyChar() >= 'a' && e.getKeyChar() <= 'z') || (e.getKeyChar() >= 'A' && e.getKeyChar() <= 'Z')) {
            textfield.setEditable(false);
        } else {
            textfield.setEditable(true);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.addToFrame();
        main.setBounds();
        main.setKeyListener();
        main.setActionListener();
    }
}