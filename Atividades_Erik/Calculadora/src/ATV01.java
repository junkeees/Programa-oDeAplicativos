import java.util.Scanner;

public class ATV01  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a operação que deseja fazer:" +
                "\n1 - Soma" +
                "\n2 - Subtração" +
                "\n3 - Divisão" +
                "\n4 - Potenciação" +
                "\n5 - Multiplicação" +
                "\n6 - Porcentagem" +
                "\n7 - Raiz quadrada");

        int opcao = sc.nextInt();



        switch (opcao){
            case 1: {
                System.out.println("quantos números deseja colocar na operação? (min 1, max 5): ");
                int maxNum = sc.nextInt();
                System.out.println("Some os números:");
                int soma=0;
                for(int i = 0; i < maxNum; i++){
                    soma = soma + sc.nextInt();
                    System.out.println("\n");
                }
                System.out.println("Soma: " + soma);
            }
            case 2: {
                System.out.println("quantos números deseja colocar na operação? (min 1, max 5): ");
                int maxNum = sc.nextInt();
                System.out.println("Subtraia os números: ");
                int subtracao = sc.nextInt();
                for(int i = 0; i< maxNum-1; i++){
                    subtracao = subtracao - sc.nextInt();
                }
                System.out.println("Subtração: " + subtracao);
            }
            case 3: {
                System.out.println("quantos números deseja colocar na operação? (min 1, max 5): ");
                int maxNum = sc.nextInt();
                System.out.println("Divida os números: ");
                int divisao = sc.nextInt();
                for(int i = 0; i< maxNum-1; i++){
                    divisao = divisao - sc.nextInt();
                }
                System.out.println("Subtração: " + divisao);
            }
            case 4: {
                System.out.println("Insira 2 números: base, expoente: ");
                int base = sc.nextInt();
                int expoente = sc.nextInt();
                double resultado = Math.pow(base, expoente);
                System.out.println("Resultado: " + resultado);
            }
            case 5: {
                System.out.println("quantos números deseja colocar na operação? (min 1, max 5): ");
                int maxNum = sc.nextInt();
                System.out.println("Multiplique os números: ");
                int multi = sc.nextInt();
                for(int i = 0; i< maxNum-1; i++){
                    multi = multi * sc.nextInt();
                }
                System.out.println("Multiplicação: " + multi);
            }
            case 6: {
                System.out.println("Insira 2 números, (ex: num1 % de num2)");
                System.out.println("Número 1:");
                double num1 = sc.nextInt();
                System.out.println("Número 2:");
                double num2 = sc.nextInt();
                double resultado = num2 * (num1 / 100);
                System.out.println("Resultado: "+resultado);
            }
            case 7: {
                System.out.println("Insira um número para tirar sua raiz quadrada: ");
                double num = sc.nextDouble();
                num = Math.sqrt(num);
                System.out.println("Resultado: " + num);
            }
        }
sc.close();
    }
}