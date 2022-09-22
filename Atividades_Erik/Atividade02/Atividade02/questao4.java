package hola;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {

		int num, num1, num2;

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe um número: ");
		num = sc.nextInt();
		System.out.print("Informe outro numero: ");
		num1 = sc.nextInt();
		System.out.print("Informe outro numero: ");
		num2 = sc.nextInt();

		sc.close();

		if (num > num1) {
			if (num > num2) {
				if (num1 > num2) {
					System.out.println("ordem: " + num2 + ", " + num1 + ", " + num);
				} else if(num2 > num1) {
					System.out.println("ordem: " + num1 + ", " + num2 + ", " + num);
				}
			} else if (num2 > num1) {
				System.out.println("ordem: " + num1 + ", " + num + ", " + num2);
			}
		} else if (num1 > num2) {
			if (num > num2) {
				if (num1 > num) {
					System.out.println("ordem: " + num2 + ", " + num + ", " + num1);
				}
			} else if (num2 > num) {
				System.out.println("ordem: " + num + ", " + num2 + ", " + num1);
			}
		} else if (num2 > num1) {
			if (num1 > num) {
				System.out.println("ordem: " + num + ", " + num1 + ", " + num2);
			}
		}
		if(num1 == num2 || num == num1 || num == num2) {
			System.out.println("Tem dois números iguai ae meu irmão");
		}
	}

}
