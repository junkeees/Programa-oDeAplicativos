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

import static java.lang.Double.parseDouble;

public class Cadastro extends JFrame implements Runnable {
    private JPanel panel1;
    private JLabel logo;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JSeparator separator2;
    private JSeparator separator1;
    private JSeparator separator3;
    private JSeparator separator4;
    private JSeparator separator5;
    private JSeparator separator6;
    private JSeparator separator7;
    private JSeparator separator8;
    private JSeparator separator9;
    private JSeparator separator10;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JButton button1;
    private JButton button2;
    private JSeparator separatorH1;
    private JSeparator separatorH2;
    private JLabel agenciaLabel;
    private JLabel contaLabel;

    public void run() {
        Boolean[] fieldClick = {false};
        String[] txtfieldClick = {"Campo obrigatório"};
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
        textField1.setPreferredSize(new Dimension(150, 25));
        textField1.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        //textField1.setBorder(null);
        textField2.setBackground(new Color(58, 63, 65));
        textField2.setCaretColor(new Color(58, 63, 65));
        textField2.setForeground(new Color(150, 150, 150));
        textField2.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(64, 225, 232), Color.black, new Color(64, 225, 232), Color.black));
        textField2.setPreferredSize(new Dimension(150, 25));
        textField2.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        //textField2.setBorder(null);
        textField3.setBackground(new Color(58, 63, 65));
        textField3.setCaretColor(new Color(58, 63, 65));
        textField3.setForeground(new Color(150, 150, 150));
        textField3.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(64, 225, 232), Color.black, new Color(64, 225, 232), Color.black));
        textField3.setPreferredSize(new Dimension(150, 25));
        textField3.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        //textField3.setBorder(null);
        textField4.setBackground(new Color(58, 63, 65));
        textField4.setCaretColor(new Color(58, 63, 65));
        textField4.setForeground(new Color(150, 150, 150));
        textField4.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(64, 225, 232), Color.black, new Color(64, 225, 232), Color.black));
        textField4.setPreferredSize(new Dimension(150, 25));
        textField4.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        //textField4.setBorder(null);
        textField5.setBackground(new Color(58, 63, 65));
        textField5.setCaretColor(new Color(58, 63, 65));
        textField5.setForeground(new Color(150, 150, 150));
        textField5.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(64, 225, 232), Color.black, new Color(64, 225, 232), Color.black));
        textField5.setPreferredSize(new Dimension(150, 25));
        textField5.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        //textField5.setBorder(null);
        textField6.setBackground(new Color(58, 63, 65));
        textField6.setCaretColor(new Color(58, 63, 65));
        textField6.setForeground(new Color(150, 150, 150));
        textField6.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(64, 225, 232), Color.black, new Color(64, 225, 232), Color.black));
        textField6.setPreferredSize(new Dimension(150, 25));
        textField6.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        //textField6.setBorder(null);
        textField7.setBackground(new Color(58, 63, 65));
        textField7.setCaretColor(new Color(58, 63, 65));
        textField7.setForeground(new Color(150, 150, 150));
        textField7.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(64, 225, 232), Color.black, new Color(64, 225, 232), Color.black));
        textField7.setPreferredSize(new Dimension(150, 25));
        textField7.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        //textField7.setBorder(null);
        separator1.setBackground(new Color(255, 255, 255));
        separator2.setBackground(new Color(64, 225, 232));
        separator3.setBackground(new Color(64, 225, 232));
        separator4.setBackground(new Color(64, 225, 232));
        separator5.setBackground(new Color(64, 225, 232));
        separator6.setBackground(new Color(255, 255, 255));
        separator7.setBackground(new Color(64, 225, 232));
        //separatorH1.setBackground(new Color(255, 255, 255));
        //separatorH2.setBackground(new Color(64, 225, 232));
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
        //button2.setBorder(null);
        button2.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(49, 49, 49), Color.black, new Color(49, 49, 49), Color.black));
        button2.setOpaque(true);
        button2.setContentAreaFilled(true);
        button2.setRequestFocusEnabled(true);
        button2.setRolloverEnabled(false);
        button2.setMargin(new Insets(2, 8, 2, 8));
        label1.setForeground(new Color(187, 187, 187));
        label1.setFont(new Font("Arial", Font.BOLD, 16));
        label2.setForeground(new Color(187, 187, 187));
        label2.setFont(new Font("Arial", Font.BOLD, 16));
        label3.setForeground(new Color(187, 187, 187));
        label3.setFont(new Font("Arial", Font.BOLD, 16));
        label4.setForeground(new Color(187, 187, 187));
        label4.setFont(new Font("Arial", Font.BOLD, 16));
        label5.setForeground(new Color(187, 187, 187));
        label5.setFont(new Font("Arial", Font.BOLD, 16));
        label6.setForeground(new Color(187, 187, 187));
        label6.setFont(new Font("Arial", Font.PLAIN, 16));
        agenciaLabel.setForeground(new Color(187, 187, 187));
        agenciaLabel.setFont(new Font("Arial", Font.BOLD, 16));
        contaLabel.setForeground(new Color(187, 187, 187));
        contaLabel.setFont(new Font("Arial", Font.BOLD, 16));

        textField1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                if (!textField1.getText().equals("Insira o seu nome")) {
                    textField1.setForeground(new Color(208, 208, 208));
                } else {
                    textField1.setText("");
                    textField1.setForeground(new Color(208, 208, 208));
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                if (textField1.getText().equals("")) {
                    textField1.setText("Insira o seu nome");
                    textField1.setForeground(new Color(150, 150, 150));
                } else if (!textField1.getText().equals("Insira o seu nome")) {
                    textField1.setForeground(new Color(150, 150, 150));
                }
            }
        });
        textField2.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                if (!textField2.getText().equals("Insira o seu endereço")) {
                    textField2.setForeground(new Color(208, 208, 208));
                } else {
                    textField2.setText("");
                    textField2.setForeground(new Color(208, 208, 208));
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                if (textField2.getText().equals("")) {
                    textField2.setText("Insira o seu endereço");
                    textField2.setForeground(new Color(150, 150, 150));
                } else if (!textField2.getText().equals("Insira o seu endereço")) {
                    textField2.setForeground(new Color(150, 150, 150));
                }
            }
        });
        textField3.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                if (!textField3.getText().equals("Insira o seu CPF")) {
                    textField3.setForeground(new Color(208, 208, 208));
                } else {
                    textField3.setText("");
                    textField3.setForeground(new Color(208, 208, 208));
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                if (textField3.getText().equals("")) {
                    textField3.setText("Insira o seu CPF");
                    textField3.setForeground(new Color(150, 150, 150));
                } else if (!textField3.getText().equals("Insira o seu CPF")) {
                    textField3.setForeground(new Color(150, 150, 150));
                }
            }
        });
        textField4.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                if (!textField4.getText().equals("Insira a sua profissão")) {
                    textField4.setForeground(new Color(208, 208, 208));
                } else {
                    textField4.setText("");
                    textField4.setForeground(new Color(208, 208, 208));
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                if (textField4.getText().equals("")) {
                    textField4.setText("Insira a sua profissão");
                    textField4.setForeground(new Color(150, 150, 150));
                } else if (!textField4.getText().equals("Insira a sua profissão")) {
                    textField4.setForeground(new Color(150, 150, 150));
                }
            }
        });
        textField5.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                if (!textField5.getText().equals("Insira a sua renda")) {
                    textField5.setForeground(new Color(208, 208, 208));
                } else {
                    textField5.setText("");
                    textField5.setForeground(new Color(208, 208, 208));
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                if (textField5.getText().equals("")) {
                    textField5.setText("Insira a sua renda");
                    textField5.setForeground(new Color(150, 150, 150));
                } else if (!textField5.getText().equals("Insira a sua renda")) {
                    textField5.setForeground(new Color(150, 150, 150));
                }
            }
        });
        textField6.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                if (!textField6.getText().equals("Insira a sua agência")) {
                    textField6.setForeground(new Color(208, 208, 208));
                } else {
                    textField6.setText("");
                    textField6.setForeground(new Color(208, 208, 208));
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                if (textField6.getText().equals("")) {
                    textField6.setText("Insira a sua agência");
                    textField6.setForeground(new Color(150, 150, 150));
                } else if (!textField6.getText().equals("Insira a sua agência")) {
                    textField6.setForeground(new Color(150, 150, 150));
                }
            }
        });
        textField7.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                if (!textField7.getText().equals("Insira a sua conta")) {
                    textField7.setForeground(new Color(208, 208, 208));
                } else {
                    textField7.setText("");
                    textField7.setForeground(new Color(208, 208, 208));
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                if (textField7.getText().equals("")) {
                    textField7.setText("Insira a sua conta");
                    textField7.setForeground(new Color(150, 150, 150));
                } else if (!textField7.getText().equals("Insira a sua conta")) {
                    textField7.setForeground(new Color(150, 150, 150));
                }
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(button1)) {
                    Banco myBanco = new Banco();
                    myBanco.run();
                    dispose();
                    Cliente dataBase = new Cliente();
                    dataBase.agencia = parseDouble(textField6.getText());
                    dataBase.conta = parseDouble(textField7.getText());
                    dataBase.nome = textField1.getText();
                    dataBase.endereço = textField2.getText();
                    dataBase.CPF = textField3.getText();
                    dataBase.profissão = textField4.getText();
                    dataBase.renda = parseDouble(textField5.getText());
                    System.out.println("Agência:\s" + dataBase.agencia + "\nConta:\s" + dataBase.conta + "\nNome:\s" + dataBase.nome + "\nEndereço:\s" + dataBase.endereço + "\nCPF:\s" + dataBase.CPF + "\nProfissão:\s" + dataBase.profissão + "\nRenda:\s" + dataBase.renda);
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(button2)) {
                    textField1.setText("Insira o seu nome");
                    textField2.setText("Insira o seu endereço");
                    textField3.setText("Insira o seu CPF");
                    textField4.setText("Insira a sua profissão");
                    textField5.setText("Insira a sua renda");
                }
            }
        });
    }

    public static void main(String[] args) {
        Cadastro myCadastro = new Cadastro(); Thread thread = new Thread(myCadastro); thread.start();
    }
}
