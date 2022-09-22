package hola;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		double num, num1, num2, num3, delt, quad, cubo, r2, r3, bask, bask2;

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe um número: ");
		num = sc.nextInt();
		System.out.print("Informe o A: ");
		num1 = sc.nextInt();
		System.out.print("Informe o B: ");
		num2 = sc.nextInt();
		System.out.print("Informe o C: ");
		num3 = sc.nextInt();

		sc.close();

		quad = Math.pow(num, 2);
		cubo = Math.pow(num, 3);
		r2 = Math.sqrt(num);
		r3 = Math.cbrt(num);

		delt = Math.pow(num2, 2) - ((4 * num1) * num3);
		bask = (-num2 + Math.sqrt(delt)) / 2 * num1;
		bask2 = (-num2 - Math.sqrt(delt)) / 2 * num1;

		System.out.print("Número ao quadrado: " + quad + "\nNúmero ao cubo: " + cubo + "\nRaíz quadrada: " + r2
				+ "\nRaíz cúbica: " + r3 + "\nDelta: " + delt + "\nBhaskara x1: " + bask + "\nBhaskara x2: " + bask2);
	}

}