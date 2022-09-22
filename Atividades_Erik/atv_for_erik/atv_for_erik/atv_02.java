package forr;

import java.util.Scanner;

public class atv_02 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int contador = 0, idade, contadorPeso = 0;
        double peso, altura, alturaTotal = 0, time1 = 0, time2 = 0;

        for (int cont = 0; cont < 2; cont++) {
            for (int e = 0; e < 11; e++) {
                System.out.println("Qual é sua idade: ");
                idade = sc.nextInt();
                System.out.println("Qual é seu peso: ");
                peso = sc.nextDouble();
                System.out.println("Qual é sua altura: ");
                altura = sc.nextDouble();
                
                if(idade < 18){
                    contador++;
                }
                if(cont == 0){
                    time1 += idade;
                } else {
                    time2 += idade;
                }
                if(peso > 80){
                    contadorPeso++;
                }
                alturaTotal += altura;
            }
        }
        System.out.println("Jogadores com idade inferior a 18: " + contador);
        System.out.println("A media da idade do time 1: " + (time1/11));
        System.out.println("A media da idade do time 2: " + (time2/11));
        System.out.println("A media da altura do jogadores: " + (alturaTotal/22));
        System.out.println("Percentual de jogadores com mais de 80KG: " + (contadorPeso*100/22) + "%");
        
        sc.close();
    }
}