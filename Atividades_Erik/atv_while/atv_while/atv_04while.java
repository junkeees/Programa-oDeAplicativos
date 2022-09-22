import java.util.Scanner;

public class atv_04while {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double salarioMinimo;
        double quilowatts;
        
        System.out.println("Tipo   | % DE ACRÉSCIMO SOBRE O VALOR GASTO");
        System.out.println("1      |               5%");
        System.out.println("2      |              10%");
        System.out.println("3      |              15%");
        
            System.out.println("Digite o salario:");
            salarioMinimo = sc.nextInt();
            
            quilowatts = salarioMinimo/8;
            
            System.out.println("O valor do quilowatt:R$"+quilowatts);
            
            //residencial 1
            double residencial = salarioMinimo*0.05;
            System.out.println("O valor de acrescimo e:R$"+residencial);
            
            //comercial 2 
            double comercial = salarioMinimo*0.10;
            System.out.println("O valor de acrescimo do comercial é:R$"+comercial);
            
            //industrial
            double industrial = salarioMinimo*0.15;
            System.out.println("O valor de acrescimo do industrial é:R$"+industrial);
            
            //faturamento geral
            double fatGeral = residencial + comercial + industrial;
            System.out.println("Faturamento geral da empresa:R$"+fatGeral);
            
            sc.close();
    }

}