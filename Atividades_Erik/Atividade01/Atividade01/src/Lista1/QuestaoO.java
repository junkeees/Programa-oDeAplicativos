package Lista1;

import java.util.Scanner;

public class QuestaoO {

	public static void main(String[] args) {

		double base, alt, area;

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a base do triângulo: ");
		base = sc.nextInt();
		System.out.print("Informe a altura do triângulo: ");
		alt = sc.nextInt();

		sc.close();

		area = (base * alt) / 2;
		
		System.out.println("Área do triângulo: "+area);

	}

}
