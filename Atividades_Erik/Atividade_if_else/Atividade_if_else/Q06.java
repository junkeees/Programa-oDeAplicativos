import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int opcao;
		double salar, imposto;

		System.out.print("Menu de Opções:\n1 - Imposto\n2 - Novo Salário\n3 - Classificação\n--> ");
		opcao = sc.nextInt();

		if (opcao == 1) {
			System.out.print("Informe seu salário atual: ");
			salar = sc.nextDouble();
				if(salar < 500) {
					imposto = salar * 0.05;
					System.out.print("O valor do imposto é de: "+imposto);
				}else if(salar >= 500 && salar <= 850) {
					imposto = salar * 0.1;
					System.out.print("O valor do imposto é de: "+imposto);
				}else {
					imposto = salar * 0.15;
					System.out.print("O valor do imposto é de: "+imposto);
				}
		} else if (opcao == 2) {
			System.out.print("Informe seu salário atual: ");
			salar = sc.nextDouble();
			if (salar > 1500) {
				salar += 25;
				System.out.print("Seu novo salário é de: " + salar);
			} else if (salar >= 750 && salar <= 1500) {
				salar += 50;
				System.out.print("Seu novo salário é de: " + salar);
			} else if(salar >= 450 && salar <= 750){
				salar += 75;
				System.out.print("Seu novo salário é de: " + salar);
			}else if(salar < 450){
				salar += 100;
				System.out.print("Seu novo salário é de: " + salar);
			}
		} else {
			System.out.print("Informe seu salário atual: ");
			salar = sc.nextDouble();
			if(salar <= 700) {
				System.out.println("Mal remunerado");
			}else {
				System.out.println("Bem remunerado");
			}
		}
		sc.close();

	}

}
