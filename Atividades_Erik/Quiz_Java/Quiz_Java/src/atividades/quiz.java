package atividades;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class quiz implements ActionListener {
    //Cria a janela do projeto
    JFrame JFrame;
    //Cria os botões de respostas
    JRadioButton JRButton1, JRButton2, JRButton3, JRButton4;
    //Cria dois botões, um de confirmar resposta e o outro de avançar questão
    JButton JButton1, JButton2;
    //Cria o texto da questão
    JLabel JLabel1, JLabel2, JLabel3, JLabel4;
    //Adiciona os botões a um grupo de botões
    ButtonGroup ButtonGroup;
    //Cria a variável String para as questões
    String[] questao = {"Quem criou o Java e em que ano foi criado?", "Qual o menor país do mundo?",
            "Qual é o animal nacional da Austrália?", "Em quantas regiões o Brasil é dividido",
            "Quando é verão no Brasil, qual é a estação do ano na Europa?",
            "Em qual cidade de Portugal é realizado o campeonato de surf de ondas gigantes?",
            "Quem foi o primeiro brasileiro a conquistar um cinturão no UFC?",
            "Quantos campeonatos de Fórmula 1 venceu o piloto brasileiro Ayrton Senna?",
            "Qual é a capital da Islândia?",
            "Qual o resultado de 5 + 5!?"};
    //Cria a variável String para as alternativas
    String[] opcao1 = {"Brendan Eich, 1995", "Nauru", "Canguru-vermelho", "3", "Inverno", "Lagos",
            "Marco Ruas", "6", "Reykjavík", "10"};
    String[] opcao2 = {"James Gosling, 1991", "Vaticano", "Leão", "4", "Verão", "Nazaré",
            "Royce Gracie", "5", "Oslo", "25"};
    String[] opcao3 = {"Dennis Ritchie, 1972", "Tuvalu", "Tigre-siberiano", "5", "Outono", "Tavira",
            "Murilo Bustamante", "4", "Nuuk", "50"};
    String[] opcao4 = {"Guido van Rossum, 1990", "Mônaco", "Dragão-de-Komodo", "6", "Primavera", "Cascais",
            "Vitor Belfort", "3", "Estocolmo", "125"};
    //Cria a variável String para a resposta certa
    String[] resposta = {"James Gosling, 1991", "Vaticano", "Canguru-vermelho", "5", "Inverno", "Nazaré",
            "Murilo Bustamante", "3", "Reykjavík", "125"};
    //Variáveis para a quantidade acumulada
    int quantia = 0, quantia2 = 2500;
    //Variáveis Integer que servem de incremento para avançar as questões
    int i, i2 = 1;

    //Função inicial do projeto, que cria todos os elementos
    quiz() {
        JFrame = new JFrame("Quiz do milhão");
        JFrame.setLayout(null);
        JFrame.setSize(650, 400);
        JLabel1 = new JLabel(questao[0]);
        JLabel1.setBounds(50, 50, 1080, 30);
        JFrame.add(JLabel1);
        JLabel1.setFont(new Font("Digital", Font.BOLD, 24));
        JLabel2 = new JLabel("Quantia: R$" + quantia);
        JLabel2.setBounds(10, 10, 200, 20);
        JFrame.add(JLabel2);
        JLabel2.setFont(new Font("Digital", Font.BOLD, 12));
        JLabel3 = new JLabel("Valor da questão: R$" + quantia2);
        JLabel3.setBounds(220, 80, 200, 20);
        JFrame.add(JLabel3);
        JLabel3.setFont(new Font("Digital", Font.BOLD, 12));
        JLabel4 = new JLabel("");
        JLabel4.setBounds(50, 80, 750, 50);
        JFrame.add(JLabel4);
        JLabel4.setVisible(false);
        JLabel4.setFont(new Font("Digital", Font.BOLD, 24));
        JRButton1 = new JRadioButton(opcao1[0]);
        JRButton1.setBounds(100, 120, 150, 30);
        JFrame.add(JRButton1);
        JRButton2 = new JRadioButton(opcao2[0]);
        JRButton2.setBounds(350, 120, 150, 30);
        JFrame.add(JRButton2);
        JRButton3 = new JRadioButton(opcao3[0]);
        JRButton3.setBounds(100, 220, 150, 30);
        JFrame.add(JRButton3);
        JRButton4 = new JRadioButton(opcao4[0]);
        JRButton4.setBounds(350, 220, 150, 30);
        JFrame.add(JRButton4);
        ButtonGroup = new ButtonGroup();
        ButtonGroup.add(JRButton1);
        ButtonGroup.add(JRButton2);
        ButtonGroup.add(JRButton3);
        ButtonGroup.add(JRButton4);
        //Adiciona evento de ação do usuário
        JRButton1.addActionListener(this);
        JRButton2.addActionListener(this);
        JRButton3.addActionListener(this);
        JRButton4.addActionListener(this);
        JButton1 = new JButton("Confirmar");
        JButton1.setBounds(180, 300, 100, 30);
        JFrame.add(JButton1);
        JButton2 = new JButton("Próximo");
        JButton2.setBounds(320, 300, 100, 30);
        JFrame.add(JButton2);
        JButton1.addActionListener(this);
        JButton2.addActionListener(this);
        JFrame.setVisible(true);
    }

    public static void main(String[] args) {
        //Inicia a função que cria o projeto
        new quiz();
    }

    //Importa um pacote de evento de ações do usuário
    public void actionPerformed(ActionEvent actionEvent) {
        //Condição caso o evento de ações do usuário identifique uma ação no botão de confirmar
        if (actionEvent.getSource() == JButton1) {
            //Cria a variável 'is' para o texto nos botões
            String is = "";
            //Se o evento identificar uma ação, cria condições para o botão que for selecionado
            if (JRButton1.isSelected()) {
                //Aplica o valor do texto do botão que for selecionado para a variável 'is'
                is = JRButton1.getText();
            }
            if (JRButton2.isSelected()) {
                is = JRButton2.getText();
            }
            if (JRButton3.isSelected()) {
                is = JRButton3.getText();
            }
            if (JRButton4.isSelected()) {
                is = JRButton4.getText();
            }
            //Se o botão selecionado for a resposta certa, envia uma mensagem de resposta certa
            //Analisa o valor da resposta da certa de acordo com o número da questão
            if (is.equals(resposta[i])) {
                //Adiciona a quantidade pontuada
                quantia += quantia2;
                quantia2 += (i2 * 2.5) * 2500;
                JOptionPane.showMessageDialog(null, "Resposta certa");
                //Se não, envia uma mensagem de resposta errada
            } else {
                quantia2 += (i2 * 2.5) * 2500;
                JOptionPane.showMessageDialog(null, "Resposta errada");
            }
            //Se houver ação nos botões de confirmar ou avançar na última questão, atualiza os elementos
            if (i == 9 && (actionEvent.getSource() == JButton1 || actionEvent.getSource() == JButton2)) {
                JFrame.setSize(720, 400);
                JLabel1.setVisible(false);
                JLabel2.setVisible(false);
                JLabel3.setVisible(false);
                JLabel4.setText("Parabéns, você concluiu o quiz e recebeu R$" + quantia);
                JLabel4.setVisible(true);
                JButton1.setVisible(false);
                JButton2.setVisible(false);
                JRButton1.setVisible(false);
                JRButton2.setVisible(false);
                JRButton3.setVisible(false);
                JRButton4.setVisible(false);
                //Se o evento receber uma ação do botão de confirmar ou o de avançar, atualiza a questão do projeto
            } else if (actionEvent.getSource() == JButton1 || actionEvent.getSource() == JButton2) {
                i++;
                i2++;
                JLabel1.setText(questao[i]);
                JLabel2.setText("Quantia: R$" + quantia);
                JLabel3.setText("Valor da questão: R$" + quantia2);
                JRButton1.setText(opcao1[i]);
                JRButton2.setText(opcao2[i]);
                JRButton3.setText(opcao3[i]);
                JRButton4.setText(opcao4[i]);
            }
        }
    }
}

//Tema: Geral