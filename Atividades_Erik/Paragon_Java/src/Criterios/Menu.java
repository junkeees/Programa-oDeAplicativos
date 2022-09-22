package Criterios;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Menu extends JFrame implements Runnable {
    public int amount = 1500;
    private JPanel panel1;
    private JSeparator separator2;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JLabel logo;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JSeparator separator1;
    private JSeparator separator3;
    private JSeparator separator4;
    private JSeparator separator5;
    private JSeparator separatorH1;
    private JSeparator separatorH2;
    private JButton button4;

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
        label2.setForeground(new Color(60,63,65));
        label2.setFont(new Font("Arial", Font.PLAIN, 12));
        label3.setForeground(new Color(187, 187, 187));
        label3.setFont(new Font("Arial", Font.BOLD, 16));
        label4.setForeground(new Color(60,63,65));
        label4.setFont(new Font("Arial", Font.PLAIN, 12));
        label5.setForeground(new Color(187, 187, 187));
        label5.setFont(new Font("Arial", Font.BOLD, 16));
        label6.setForeground(new Color(60,63,65));
        label6.setFont(new Font("Arial", Font.PLAIN, 12));
        label7.setForeground(new Color(255, 255, 255));
        label7.setFont(new Font("Arial", Font.BOLD, 16));
        separator1.setBackground(new Color(64, 225, 232));
        button1.setBackground(new Color(63, 140, 189));
        button1.setForeground(new Color(255,255,255));
        button1.setFocusPainted(false);
        //button1.setBorder(null);
        button1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(28, 61, 82), Color.black, new Color(28, 61, 82), Color.black));
        button1.setOpaque(true);
        button1.setContentAreaFilled(true);
        button1.setRequestFocusEnabled(true);
        button1.setRolloverEnabled(false);
        button1.setMargin(new Insets(2, 8, 2, 8));
        button2.setBackground(new Color(63, 140, 189));
        button2.setForeground(new Color(255,255,255));
        button2.setFocusPainted(false);
        //button1.setBorder(null);
        button2.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(28, 61, 82), Color.black, new Color(28, 61, 82), Color.black));
        button2.setOpaque(true);
        button2.setContentAreaFilled(true);
        button2.setRequestFocusEnabled(true);
        button2.setRolloverEnabled(false);
        button2.setMargin(new Insets(2, 8, 2, 8));
        button3.setBackground(new Color(63, 140, 189));
        button3.setForeground(new Color(255,255,255));
        button3.setFocusPainted(false);
        //button1.setBorder(null);
        button3.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(28, 61, 82), Color.black, new Color(28, 61, 82), Color.black));
        button3.setOpaque(true);
        button3.setContentAreaFilled(true);
        button3.setRequestFocusEnabled(true);
        button3.setRolloverEnabled(false);
        button3.setMargin(new Insets(2, 8, 2, 8));
        button4.setBackground(new Color(86, 86, 86));
        button4.setForeground(new Color(255, 255, 255));
        button4.setFocusPainted(false);
        button4.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(49, 49, 49), Color.black, new Color(49, 49, 49), Color.black));
        button4.setOpaque(true);
        button4.setContentAreaFilled(true);
        button4.setRequestFocusEnabled(true);
        button4.setRolloverEnabled(false);
        button4.setMargin(new Insets(2, 8, 2, 8));

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(button1)) {
                    Sacar mySacar = new Sacar();
                    mySacar.run();
                    dispose();
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(button2)) {
                    Depositar myDepositar = new Depositar();
                    myDepositar.run();
                    dispose();
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(button3)) {
                    Transferir myTransferir = new Transferir();
                    myTransferir.run();
                    dispose();
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(button4)) {
                    Banco myBanco = new Banco();
                    myBanco.run();
                    dispose();
                }
            }
        });
    }

    /*public static void startMenu(boolean situacao) {
        if (situacao) {
            new Thread() {
                @Override
                public void run() {
                    new Menu();
                }
            }.start();
        }
    }*/

    public static void main(String[] args) {
        Menu myMenu = new Menu(); Thread thread = new Thread(myMenu); thread.start();
    }
}
