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
            System.out.println("\n" + "[Oper�rio " + i + "]" + "\sPe�as fabricadas por m�s:\s");
            pecas = sc.nextInt();
            System.out.println("Sexo do(a) op�rario(a):\s");
            sexo = sc.nextLine();
            if (pecas <= 30) {
                salarioMinimo = 1212;
                System.out.println("Sal�rio:\s" + salarioMinimo);
                classe = "Classe 1";
                System.out.println("Sal�rio:\s" + classe);
                System.out.println("Pe�as fabricadas por m�s:\s" + pecas);
            } else if (pecas >= 31 && pecas <= 50) {
                salarioMinimo += (salarioMinimo * 0.03);
                System.out.println("Sal�rio:\s" + salarioMinimo);
                classe = "Classe 2";
                System.out.println("Sal�rio:\s" + classe);
                System.out.println("Pe�as fabricadas por m�s:\s" + pecas);
            } else if (pecas > 50) {
                salarioMinimo += (salarioMinimo * 0.05);
                System.out.println("Sal�rio:\s" + salarioMinimo);
                classe = "Classe 3";
                System.out.println("Sal�rio:\s" + classe);
                System.out.println("Pe�as fabricadas por m�s:\s" + pecas);
            } else {
                System.out.println("N�o possui classe");
            }
        }

        sc.close();
    }
}