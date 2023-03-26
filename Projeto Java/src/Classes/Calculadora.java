package Classes;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Calculadora extends JFrame implements ActionListener {
    private JPanel panel;
    private JTextField display;
    private JButton buttonAdd, buttonSubtract, buttonMultiply, buttonDivide, buttonEnter, buttonClear;
    private JRadioButton staticStackRadio, dynamicStackRadio;

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

        panel.add(staticStackRadio);
        panel.add(dynamicStackRadio);
        panel.add(buttonClear);
        panel.add(buttonAdd);
        panel.add(buttonSubtract);
        panel.add(buttonMultiply);
        panel.add(buttonDivide);
        panel.add(buttonEnter);
        panel.add(display);

        buttonAdd.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = display.getText();
                currentText += " +";
                display.setText(currentText);
            }
        });

        buttonSubtract.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = display.getText();
                currentText += " -";
                display.setText(currentText);
            }
        });

        buttonMultiply.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = display.getText();
                currentText += " *";
                display.setText(currentText);
            }
        });

        buttonDivide.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = display.getText();
                currentText += " /";
                display.setText(currentText);
            }
        });

        buttonEnter.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                /*
                 * staticStackRadio = new JRadioButton("Pilha Estática", true);
                 * dynamicStackRadio
                 */
                System.out.println(staticStackRadio.isSelected());
                Calculate calc = new Calculate(display.getText(), staticStackRadio.isSelected());
                display.setText(Double.toString(calc.resolve()));
            }
        });

        buttonClear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = display.getText();
                currentText = "";
                display.setText(currentText);
            }
        });

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new Calculadora();
    }
}
