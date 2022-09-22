package Criterios;

import Pessoal.Cliente;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import static java.lang.Integer.parseInt;

public class Transferir extends JFrame implements Runnable {
    Cliente dataBase = new Cliente();
    int limite = 50000;
    private JPanel panel1;
    private JLabel logo;
    private JLabel amountLabel;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JSeparator separator1;
    private JSeparator separator2;
    private JSeparator separator3;
    private JSeparator separator4;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JButton button1;
    private JButton button2;
    private JSeparator separatorH1;
    private JSeparator separatorH2;
    private JLabel pessoaLabel;

    public void run() {
        setContentPane(panel1);
        setTitle("Paragon Bank");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(Frame.MAXIMIZED_BOTH);
        getContentPane().setBackground(Color.black);
        //setLayout(null);
        setSize(1920, 1080);
        setVisible(true);
        label1.setForeground(new Color(187, 187, 187));
        label1.setFont(new Font("Arial", Font.BOLD, 16));
        label2.setForeground(new Color(187, 187, 187));
        label2.setFont(new Font("Arial", Font.PLAIN, 16));
        label3.setForeground(new Color(123, 123, 123));
        label3.setFont(new Font("Arial", Font.PLAIN, 12));
        pessoaLabel.setForeground(new Color(153, 255, 71));
        pessoaLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        amountLabel.setForeground(new Color(187, 187, 187));
        amountLabel.setFont(new Font("Arial", Font.BOLD, 16));
        textArea1.setBackground(new Color(58, 63, 65));
        textArea1.setCaretColor(new Color(58, 63, 65));
        textArea1.setForeground(new Color(150, 150, 150));
        textArea1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(64, 225, 232), Color.black, new Color(64, 225, 232), Color.black));
        textArea2.setBackground(new Color(58, 63, 65));
        textArea2.setCaretColor(new Color(58, 63, 65));
        textArea2.setForeground(new Color(150, 150, 150));
        textArea2.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(64, 225, 232), Color.black, new Color(64, 225, 232), Color.black));
        textArea2.setPreferredSize(new Dimension(150, 25));
        separator1.setBackground(new Color(64, 225, 232));
        separator2.setBackground(new Color(64, 225, 232));
        separator3.setBackground(new Color(255, 255, 255));
        separator4.setBackground(new Color(255, 255, 255));
        button1.setBackground(new Color(63, 140, 189));
        button1.setForeground(new Color(255, 255, 255));
        button1.setFocusPainted(false);
        button1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(28, 61, 82), Color.black, new Color(28, 61, 82), Color.black));
        button1.setOpaque(true);
        button1.setContentAreaFilled(true);
        button1.setRequestFocusEnabled(true);
        button1.setRolloverEnabled(false);
        button1.setMargin(new Insets(2, 8, 2, 8));
        button2.setBackground(new Color(86, 86, 86));
        button2.setForeground(new Color(255, 255, 255));
        button2.setFocusPainted(false);
        button2.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(49, 49, 49), Color.black, new Color(49, 49, 49), Color.black));
        button2.setOpaque(true);
        button2.setContentAreaFilled(true);
        button2.setRequestFocusEnabled(true);
        button2.setRolloverEnabled(false);
        button2.setMargin(new Insets(2, 8, 2, 8));

        textArea1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                if (!textArea1.getText().equals("Insira a quantia")) {
                    textArea1.setForeground(new Color(208, 208, 208));
                } else {
                    textArea1.setText("");
                    textArea1.setForeground(new Color(208, 208, 208));
                }
            }

            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                if (textArea1.getText().equals("")) {
                    textArea1.setText("Insira a quantia");
                    textArea1.setForeground(new Color(150, 150, 150));
                } else if (!textArea1.getText().equals("Insira a quantia")) {
                    textArea1.setForeground(new Color(150, 150, 150));
                }
            }
        });
        textArea2.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                if (!textArea2.getText().equals("Informe a conta alvo")) {
                    textArea2.setForeground(new Color(208, 208, 208));
                } else {
                    textArea2.setText("");
                    textArea2.setForeground(new Color(208, 208, 208));
                }
            }

            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                if (textArea2.getText().equals("")) {
                    textArea2.setText("Informe a conta alvo");
                    textArea2.setForeground(new Color(150, 150, 150));
                } else if (!textArea2.getText().equals("Informe a conta alvo")) {
                    textArea2.setForeground(new Color(150, 150, 150));
                }
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button1) {
                    if (parseInt(textArea1.getText()) > dataBase.amount || limite < dataBase.amount) {
                        textArea1.setForeground(new Color(234, 66, 66));
                        textArea1.setText("Erro, tente um outro valor");
                        //try catch para NumberFormatException
                    } else {
                        dataBase.amount -= parseInt(textArea1.getText());
                        limite -= parseInt(textArea1.getText());;
                        amountLabel.setText("Total: R$" + dataBase.amount + ",00 (Conta demo)");
                        pessoaLabel.setText("Foi transferido para a conta de '" + textArea2.getText() + "' um total de: R$" + textArea1.getText() + ",00");
                    }
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(button2)) {
                    Menu myMenu = new Menu();
                    myMenu.run();
                    dispose();
                }
            }
        });
    }

    public static void main(String[] args) {
        Transferir myTransferir = new Transferir(); Thread thread = new Thread(myTransferir); thread.start();
    }
}
