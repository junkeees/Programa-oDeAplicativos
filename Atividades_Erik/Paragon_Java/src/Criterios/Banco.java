package Criterios;

import Pessoal.Cliente;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.*;
import java.awt.event.*;

import static java.lang.Double.parseDouble;

public class Banco extends JFrame implements Runnable {
    boolean pronto = false;
    private JPanel panel1;
    private JPanel panel2;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JComboBox comboBox1;
    private JSeparator separator1;
    private JSeparator separator2;
    private JSeparator separator3;
    private JSeparator separator4;
    private JSeparator separator5;
    private JSeparator separator6;
    private JSeparator separator7;
    private JSeparator separatorH1;
    private JSeparator separatorH2;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    public JButton button5;
    private JLabel logo;

    public void run() {
        Boolean[] fieldClick = {false, false};
        String[] txtfieldClick = {"", ""};
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException |
                 IllegalAccessException exc) {
            exc.printStackTrace();
        }
        setContentPane(panel1);
        setTitle("Paragon Bank");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(Frame.MAXIMIZED_BOTH);
        getContentPane().setBackground(Color.black);
        //setLayout(null);
        setSize(1920, 1080);
        setVisible(true);
        textField1.setBackground(new Color(58, 63, 65));
        textField1.setCaretColor(new Color(58, 63, 65));
        textField1.setForeground(new Color(150, 150, 150));
        textField1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(64, 225, 232), Color.black, new Color(64, 225, 232), Color.black));
        textField1.setPreferredSize(new Dimension(250, 50));
        textField1.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        //textField1.setBorder(null);
        comboBox1.setBackground(new Color(187, 187, 187));
        comboBox1.setForeground(new Color(58, 63, 65));
        label1.setForeground(new Color(187, 187, 187));
        label1.setFont(new Font("Arial", Font.PLAIN, 16));
        label2.setForeground(new Color(187, 187, 187));
        label2.setFont(new Font("Arial", Font.BOLD, 16));
        //label3.setForeground(new Color(187,187,187));
        //label3.setFont(new Font("Arial", NORMAL, 16));
        label4.setForeground(new Color(187, 187, 187));
        label4.setFont(new Font("Arial", Font.BOLD, 16));
        //label5.setForeground(new Color(187,187,187));
        //label5.setFont(new Font("Arial", NORMAL, 16));
        label6.setForeground(new Color(187, 187, 187));
        label6.setFont(new Font("Arial", Font.PLAIN, 16));
        passwordField1.setBackground(new Color(58, 63, 65));
        passwordField1.setCaretColor(new Color(58, 63, 65));
        passwordField1.setForeground(new Color(150, 150, 150));
        passwordField1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(64, 225, 232), Color.black, new Color(64, 225, 232), Color.black));
        passwordField1.setPreferredSize(new Dimension(250, 50));
        passwordField1.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        //textField2.setBorder(null);
        if (passwordField1.getEchoChar() != '\u0000') {
            passwordField1.setEchoChar('\u0000');
        }
        separator1.setBackground(new Color(64, 225, 232));
        separator2.setBackground(new Color(255, 255, 255));
        separator3.setBackground(new Color(64, 225, 232));
        separator4.setBackground(new Color(64, 225, 232));
        separator5.setBackground(new Color(64, 225, 232));
        separator6.setBackground(new Color(255, 255, 255));
        separator7.setBackground(new Color(64, 225, 232));
        //Continuar
        button1.setBackground(new Color(86, 86, 86));
        button1.setForeground(new Color(255, 255, 255));
        button1.setFocusPainted(false);
        //button1.setBorder(null);
        button1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(49, 49, 49), Color.black, new Color(49, 49, 49), Color.black));
        button1.setOpaque(true);
        button1.setContentAreaFilled(true);
        button1.setRequestFocusEnabled(true);
        button1.setRolloverEnabled(false);
        button1.setMargin(new Insets(2, 8, 2, 8));
        //Limpar
        button2.setBackground(new Color(63, 140, 189));
        button2.setForeground(new Color(255, 255, 255));
        button2.setFocusPainted(false);
        button2.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(28, 61, 82), Color.black, new Color(28, 61, 82), Color.black));
        button2.setOpaque(true);
        button2.setContentAreaFilled(true);
        button2.setRequestFocusEnabled(true);
        button2.setRolloverEnabled(false);
        button2.setMargin(new Insets(2, 8, 2, 8));
        //Cadastrar
        button3.setBackground(new Color(189, 153, 63));
        button3.setForeground(new Color(255, 255, 255));
        button3.setFocusPainted(false);
        button3.setBorder(null);
        button3.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(82, 67, 28), Color.black, new Color(82, 67, 28), Color.black));
        button3.setOpaque(true);
        button3.setContentAreaFilled(true);
        button3.setRequestFocusEnabled(true);
        button3.setRolloverEnabled(false);
        button3.setPreferredSize(new Dimension(80, 25));
        button3.setMargin(new Insets(2, 8, 2, 8));

        textField1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                if (!textField1.getText().equals("Conta corrente")) {
                    textField1.setForeground(new Color(208, 208, 208));
                } else {
                    textField1.setText("");
                    textField1.setForeground(new Color(208, 208, 208));
                }
            }
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                if (textField1.getText().equals("")) {
                    textField1.setText("Conta corrente");
                    textField1.setForeground(new Color(150, 150, 150));
                } else if (!textField1.getText().equals("Conta corrente")) {
                    textField1.setForeground(new Color(150, 150, 150));
                }
            }
        });
        passwordField1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                if (!passwordField1.getText().equals("Agência bancária")) {
                    passwordField1.setForeground(new Color(208, 208, 208));
                } else {
                    passwordField1.setText("");
                    passwordField1.setForeground(new Color(208, 208, 208));
                }
            }
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                if (passwordField1.getText().equals("")) {
                    passwordField1.setText("Agência bancária");
                    passwordField1.setForeground(new Color(150, 150, 150));
                } else if (!passwordField1.getText().equals("Agência bancária")) {
                    passwordField1.setForeground(new Color(150, 150, 150));
                }
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(button1)) {
                    textField1.setText("Insira o usuário");
                    textField1.setForeground(new Color(150, 150, 150));
                    passwordField1.setText("Insira o CPF");
                    passwordField1.setForeground(new Color(150, 150, 150));
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(button2)) {
                    Cliente dataBase = new Cliente();
                    if (parseDouble(textField1.getText()) == (dataBase.conta) && parseDouble(passwordField1.getText()) == (dataBase.agencia)) {
                        Menu myMenu = new Menu();
                        myMenu.run();
                        dispose();
                    }
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(button3)) {
                    Cadastro myCadastro = new Cadastro();
                    myCadastro.run();
                    dispose();
                }
            }
        });
    }


    public static void main(String[] args) {
        Banco myBank = new Banco(); Thread thread = new Thread(myBank); thread.start();
        //Banco myBank = new Banco();
    }
}

/*

Tema: Banco
Equipe: Daniel, Erik, Otávio e Sérgio

 */
