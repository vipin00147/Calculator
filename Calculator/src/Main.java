import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import javax.xml.crypto.dsig.XMLObject;

class Main implements ActionListener,KeyListener {
    private JTextField textfield;
    private JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    private JButton div, p_age, ac, add_min, equal, dec, add, min, mul;
    JFrame f = new JFrame("Calculator");

    Main() {

        textfield = new JTextField("",12);
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


        ac.setFont(new Font("TimesRoman", Font.BOLD, 20));
        add_min.setFont(new Font("TimesRoman", Font.BOLD, 20));
        p_age.setFont(new Font("TimesRoman", Font.BOLD, 20));
        div.setFont(new Font("TimesRoman", Font.BOLD, 20));
        mul.setFont(new Font("TimesRoman", Font.BOLD, 20));
        min.setFont(new Font("TimesRoman", Font.BOLD, 20));
        add.setFont(new Font("TimesRoman", Font.BOLD, 20));
        equal.setFont(new Font("TimesRoman", Font.BOLD, 20));
        dec.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        b0.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        b1.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        b2.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        b3.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        b4.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        b5.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        b6.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        b7.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        b8.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        b9.setFont(new Font("TimesRoman", Font.PLAIN, 20));

        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        //f.setLayout(null);
        f.setSize(240, 328);
        f.setVisible(true);
    }

    private void setBounds() {
        textfield.setBounds(0, 0, 240, 50);
        ac.setBounds(0, 50, 60, 50);
        add_min.setBounds(60, 50, 60, 50);
        p_age.setBounds(120, 50, 60, 50);
        div.setBounds(180, 50, 60, 50);
        b7.setBounds(0, 100, 60, 50);
        b8.setBounds(60, 100, 60, 50);
        b9.setBounds(120, 100, 60, 50);
        equal.setBounds(180, 250, 60, 50);
        b4.setBounds(0, 150, 60, 50);
        b5.setBounds(60, 150, 60, 50);
        b6.setBounds(120, 150, 60, 50);
        b1.setBounds(0, 200, 60, 50);
        b2.setBounds(60, 200, 60, 50);
        b3.setBounds(120, 200, 60, 50);
        b0.setBounds(0, 250, 120, 50);
        dec.setBounds(120, 250, 60, 50);
        mul.setBounds(180, 100, 60, 50);
        min.setBounds(180, 150, 60, 50);
        add.setBounds(180, 200, 60, 50);
    }

    private void addToFrame() {
        Component container[] = {textfield, ac, add_min, p_age, div, mul, min, add, equal,
                dec, b0, b1, b2, b3, b4, b5, b6, b7, b8, b9};
        for (Component components : container) {
            f.add(components);
        }
    }

    void setKeyListener() {
        Component components[] = {textfield, ac, add_min, p_age, div, mul, min, add, equal,
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
    public void actionPerformed(ActionEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == '+') {

        } else if (e.getKeyChar() == '-') {

        } else if (e.getKeyChar() == '*') {

        } else if (e.getKeyChar() == '/') {

        } else if (e.getKeyChar() == '=') {

        } else if (e.getKeyChar() == '.') {
            if(Model.DEC_FLAG == 0){
                textfield.setText(textfield.getText()+'.');
                Model.DEC_FLAG = 1;
                Model.DEC_INDEX = textfield.getText().lastIndexOf('.');
            }
            else if(textfield.getText().lastIndexOf('.') != Model.DEC_INDEX){
                Model.DEC_FLAG = 0;
                Model.DEC_INDEX = -1;
            }
        }

        char caracter = e.getKeyChar();
        if (((caracter < '0') || (caracter > '9'))
                && (caracter != '\b')) {
            e.consume();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyChar() == '.') {
            if(Model.DEC_FLAG == 0){
                textfield.setText(textfield.getText()+'.');
                Model.DEC_FLAG = 1;
                Model.DEC_INDEX = textfield.getText().lastIndexOf('.');
            }
            else if(textfield.getText().lastIndexOf('.') != Model.DEC_INDEX){
                Model.DEC_FLAG = 0;
                Model.DEC_INDEX = -1;
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.addToFrame();
        main.setBounds();
        main.setKeyListener();
        main.setActionListener();
    }
}