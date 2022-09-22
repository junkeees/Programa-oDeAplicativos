import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cod;
		double reajuste, salar, valor;
		System.out.println("|----|-----------------|");
		System.out.println("| 1  |   Escriturário  |");
		System.out.println("| 2  |    Secretário   |");
		System.out.println("| 3  |      Caixa      |");
		System.out.println("| 4  |     Gerente     |");
		System.out.println("| 5  |     Diretor     |");
		System.out.println("|----|-----------------|");
		System.out.print("Informe o código do seu cargo: ");
		cod = sc.nextInt();
		System.out.print("Informe o seu salário: ");
		salar = sc.nextInt();
		if (cod == 1) {
			valor = salar * 0.5;
			reajuste = salar + valor;
			System.out.println("Seu salário atual: " + salar + "\nSeu cargo: Escriturário\nValor do seu aumento: "
					+ valor + "\nSeu novo salário: " + reajuste);
		} else if (cod == 2) {
			valor = salar * 0.35;
			reajuste = salar + valor;
			System.out.println("Seu salário atual: " + salar + "\nSeu cargo: Secretário\nValor do seu aumento: "
					+ valor + "\nSeu novo salário: " + reajuste);
		} else if (cod == 3) {
			valor = salar * 0.2;
			reajuste = salar + valor;
			System.out.println("Seu salário atual: " + salar + "\nSeu cargo: Caixa\nValor do seu aumento: "
					+ valor + "\nSeu novo salário: " + reajuste);
		} else if (cod == 4) {
			valor = salar * 0.1;
			reajuste = salar + valor;
			System.out.println("Seu salário atual: " + salar + "\nSeu cargo: Gerente\nValor do seu aumento: "
					+ valor + "\nSeu novo salário: " + reajuste);
		} else if (cod == 5) {
			System.out.println("Seu salário atual: " + salar+"\n Voçê é diretor e não possui um aumento");
		}
		sc.close();
	}

}
