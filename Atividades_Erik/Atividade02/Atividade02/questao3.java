package hola;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		
		int num, num1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um n�mero: ");
		num = sc.nextInt();
		System.out.print("Informe outro numero: ");
		num1 = sc.nextInt();
		
		sc.close();
		
		if(num > num1) {
			System.out.println("O n�mero "+num+" � o maior");
		}
		if(num1 > num) {
			System.out.println("O n�mero "+num1+" � o maior");
		}
		if(num == num1) {
			System.out.println("N�meros iguais");
		}

	}

}
