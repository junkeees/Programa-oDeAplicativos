package hola;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		
		int num, num1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		num = sc.nextInt();
		System.out.print("Informe outro numero: ");
		num1 = sc.nextInt();
		
		sc.close();
		
		if(num > num1) {
			System.out.println("O número "+num+" é o maior");
		}
		if(num1 > num) {
			System.out.println("O número "+num1+" é o maior");
		}
		if(num == num1) {
			System.out.println("Números iguais");
		}

	}

}
