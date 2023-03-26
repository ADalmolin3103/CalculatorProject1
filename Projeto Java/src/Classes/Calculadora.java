import java.awt.*;
import java.awt.event.*;
import Classes.*;

import javax.swing.*;

import Classes.DynamicStack;

public class Calculadora extends JFrame implements ActionListener {
    private JPanel panel;
    private JTextField display;
    private JButton buttonAdd, buttonSubtract, buttonMultiply, buttonDivide, buttonEnter, buttonClear;
    private JRadioButton staticStackRadio, dynamicStackRadio;
    private Stack stack;

    public Calculadora() {
        setTitle("Calculadora com Pilha");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panel = new JPanel(new GridLayout(3, 3));
        display = new JTextField();
        buttonAdd = new JButton("+");
        buttonSubtract = new JButton("-");
        buttonMultiply = new JButton("*");
        buttonDivide = new JButton("/");
        buttonEnter = new JButton("Enter");
        buttonClear = new JButton("C");
        staticStackRadio = new JRadioButton("Pilha Estática", true);
        dynamicStackRadio = new JRadioButton("Pilha Dinâmica");

        ButtonGroup stackRadioGroup = new ButtonGroup();
        stackRadioGroup.add(staticStackRadio);
        stackRadioGroup.add(dynamicStackRadio);

        stack = new StaticStack();

        panel.add(staticStackRadio);
        panel.add(dynamicStackRadio);
        panel.add(buttonClear);
        panel.add(buttonAdd);
        panel.add(buttonSubtract);
        panel.add(buttonMultiply);
        panel.add(buttonDivide);
        panel.add(buttonEnter);
        panel.add(display);

        buttonAdd.addActionListener(this);
        buttonSubtract.addActionListener(this);
        buttonMultiply.addActionListener(this);
        buttonDivide.addActionListener(this);
        buttonEnter.addActionListener(this);
        buttonClear.addActionListener(this);
        staticStackRadio.addActionListener(this);
        dynamicStackRadio.addActionListener(this);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonAdd) {
            push();
            stack.add("+");
            display.setText("");
        } else if (e.getSource() == buttonSubtract) {
            push();S
            stack.add("-");
            display.setText("");
        } else if (e.getSource() == buttonMultiply) {
            push();
            stack.add("*");
            display.setText("");
        } else if (e.getSource() == buttonDivide) {
            push();
            stack.add("/");
            display.setText("");
        } else if (e.getSource() == buttonEnter) {
            push();
            display.setText(String.valueOf(stack.pop()));
        } else if (e.getSource() == buttonClear) {
            stack.clear();
            display.setText("");
        } else if (e.getSource() == staticStackRadio) {
            stack = new StaticStack();
        } else if (e.getSource() == dynamicStackRadio) {
//            stack = new DynamicStack(10);
        }
    }

    private void push() {
        try {
            int num = Integer.parseInt(display.getText());
            stack.add(num);
        } catch (NumberFormatException ex) {
            // ignore non-numeric input
        }
    }

    public static void main(String[] args) {
        new Calculadora();
    }
}
