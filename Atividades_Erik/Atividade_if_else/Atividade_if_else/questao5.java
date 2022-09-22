2import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cod;
		double reajuste, salar, valor;
		System.out.println("|----|-----------------|");
		System.out.println("| 1  |   Escritur�rio  |");
		System.out.println("| 2  |    Secret�rio   |");
		System.out.println("| 3  |      Caixa      |");
		System.out.println("| 4  |     Gerente     |");
		System.out.println("| 5  |     Diretor     |");
		System.out.println("|----|-----------------|");
		System.out.print("Informe o c�digo do seu cargo: ");
		cod = sc.nextInt();
		System.out.print("Informe o seu sal�rio: ");
		salar = sc.nextInt();
		if (cod == 1) {
			valor = salar * 0.5;
			reajuste = salar + valor;
			System.out.println("Seu sal�rio atual: " + salar + "\nSeu cargo: Escritur�rio\nValor do seu aumento: "
					+ valor + "\nSeu novo sal�rio: " + reajuste);
		} else if (cod == 2) {
			valor = salar * 0.35;
			reajuste = salar + valor;
			System.out.println("Seu sal�rio atual: " + salar + "\nSeu cargo: Secret�rio\nValor do seu aumento: "
					+ valor + "\nSeu novo sal�rio: " + reajuste);
		} else if (cod == 3) {
			valor = salar * 0.2;
			reajuste = salar + valor;
			System.out.println("Seu sal�rio atual: " + salar + "\nSeu cargo: Caixa\nValor do seu aumento: "
					+ valor + "\nSeu novo sal�rio: " + reajuste);
		} else if (cod == 4) {
			valor = salar * 0.1;
			reajuste = salar + valor;
			System.out.println("Seu sal�rio atual: " + salar + "\nSeu cargo: Gerente\nValor do seu aumento: "
					+ valor + "\nSeu novo sal�rio: " + reajuste);
		} else if (cod == 5) {
			System.out.println("Seu sal�rio atual: " + salar+"\n Vo�� � diretor e n�o possui um aumento");
		}
		sc.close();
	}

}
