package hola;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {

		int num, parim;

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe um n�mero: ");
		num = sc.nextInt();
		
		sc.close();

		parim = num % 2;

		if (parim == 0) {
			System.out.println("O n�mero � par!");
		} else {
			System.out.println("O n�mero � �mpar!");
		}

	}

}
