package Lista1;

import java.util.Scanner;

public class QuestaoN {

	public static void main(String[] args) {

		int raio;
		double area, peri;

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o raio do círculo: ");
		raio = sc.nextInt();

		sc.close();

		peri = 2 * 3.14 * raio;

		area = 3.14 * (raio * raio);

		System.out.println("Área: " + area + "\nPerímetro: " + peri);

	}

}
