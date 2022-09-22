package forr;

import java.util.Scanner;

public class atv_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salarioMinimo = 1212;
        String classe;
        String sexo;
        System.out.println("Informe sua classe (1-3):\s");
        for (int i = 1; i < 16; i++) {
            int pecas;
            System.out.println("\n" + "[Operário " + i + "]" + "\sPeças fabricadas por mês:\s");
            pecas = sc.nextInt();
            System.out.println("Sexo do(a) opérario(a):\s");
            sexo = sc.nextLine();
            if (pecas <= 30) {
                salarioMinimo = 1212;
                System.out.println("Salário:\s" + salarioMinimo);
                classe = "Classe 1";
                System.out.println("Salário:\s" + classe);
                System.out.println("Peças fabricadas por mês:\s" + pecas);
            } else if (pecas >= 31 && pecas <= 50) {
                salarioMinimo += (salarioMinimo * 0.03);
                System.out.println("Salário:\s" + salarioMinimo);
                classe = "Classe 2";
                System.out.println("Salário:\s" + classe);
                System.out.println("Peças fabricadas por mês:\s" + pecas);
            } else if (pecas > 50) {
                salarioMinimo += (salarioMinimo * 0.05);
                System.out.println("Salário:\s" + salarioMinimo);
                classe = "Classe 3";
                System.out.println("Salário:\s" + classe);
                System.out.println("Peças fabricadas por mês:\s" + pecas);
            } else {
                System.out.println("Não possui classe");
            }
        }

        sc.close();
    }
}