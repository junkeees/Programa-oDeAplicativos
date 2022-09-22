import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		double soma, raiz, num1, num2, num3;
		System.out.print("Menu de opções:\n1 - Soma dois números\n2 - Raíz quadrada de um número\n--> ");
		opcao = sc.nextInt();

		if (opcao == 1) {
			System.out.print("Informe um número: ");
			num1 = sc.nextDouble();
			System.out.print("Informe um número: ");
			num2 = sc.nextDouble();
			soma = num1 + num2;
			System.out.println("Soma: " + soma);
		} else {
			System.out.print("Informe um número: ");
			num3 = sc.nextDouble();
			raiz = Math.sqrt(num3);
			System.out.println("Raíz: " + raiz);
		}
		sc.close();
	}

}
