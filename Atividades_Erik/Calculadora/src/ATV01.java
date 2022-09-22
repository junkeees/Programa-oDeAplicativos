import java.util.Scanner;

public class ATV01  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a opera��o que deseja fazer:" +
                "\n1 - Soma" +
                "\n2 - Subtra��o" +
                "\n3 - Divis�o" +
                "\n4 - Potencia��o" +
                "\n5 - Multiplica��o" +
                "\n6 - Porcentagem" +
                "\n7 - Raiz quadrada");

        int opcao = sc.nextInt();



        switch (opcao){
            case 1: {
                System.out.println("quantos n�meros deseja colocar na opera��o? (min 1, max 5): ");
                int maxNum = sc.nextInt();
                System.out.println("Some os n�meros:");
                int soma=0;
                for(int i = 0; i < maxNum; i++){
                    soma = soma + sc.nextInt();
                    System.out.println("\n");
                }
                System.out.println("Soma: " + soma);
            }
            case 2: {
                System.out.println("quantos n�meros deseja colocar na opera��o? (min 1, max 5): ");
                int maxNum = sc.nextInt();
                System.out.println("Subtraia os n�meros: ");
                int subtracao = sc.nextInt();
                for(int i = 0; i< maxNum-1; i++){
                    subtracao = subtracao - sc.nextInt();
                }
                System.out.println("Subtra��o: " + subtracao);
            }
            case 3: {
                System.out.println("quantos n�meros deseja colocar na opera��o? (min 1, max 5): ");
                int maxNum = sc.nextInt();
                System.out.println("Divida os n�meros: ");
                int divisao = sc.nextInt();
                for(int i = 0; i< maxNum-1; i++){
                    divisao = divisao - sc.nextInt();
                }
                System.out.println("Subtra��o: " + divisao);
            }
            case 4: {
                System.out.println("Insira 2 n�meros: base, expoente: ");
                int base = sc.nextInt();
                int expoente = sc.nextInt();
                double resultado = Math.pow(base, expoente);
                System.out.println("Resultado: " + resultado);
            }
            case 5: {
                System.out.println("quantos n�meros deseja colocar na opera��o? (min 1, max 5): ");
                int maxNum = sc.nextInt();
                System.out.println("Multiplique os n�meros: ");
                int multi = sc.nextInt();
                for(int i = 0; i< maxNum-1; i++){
                    multi = multi * sc.nextInt();
                }
                System.out.println("Multiplica��o: " + multi);
            }
            case 6: {
                System.out.println("Insira 2 n�meros, (ex: num1 % de num2)");
                System.out.println("N�mero 1:");
                double num1 = sc.nextInt();
                System.out.println("N�mero 2:");
                double num2 = sc.nextInt();
                double resultado = num2 * (num1 / 100);
                System.out.println("Resultado: "+resultado);
            }
            case 7: {
                System.out.println("Insira um n�mero para tirar sua raiz quadrada: ");
                double num = sc.nextDouble();
                num = Math.sqrt(num);
                System.out.println("Resultado: " + num);
            }
        }
sc.close();
    }
}