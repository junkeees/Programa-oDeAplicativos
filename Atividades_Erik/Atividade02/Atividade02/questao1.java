package hola;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		
		double nota1, nota2, nota3, soma, media;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe sua primeira nota: ");
		nota1 = sc.nextDouble();
		System.out.print("Informe sua segunda nota: ");
		nota2 = sc.nextDouble();
		System.out.print("Informe sua terceira nota: ");
		nota3 = sc.nextDouble();
		
		sc.close();
		
		soma = ((nota1 * 2)+(nota2 * 3)+(nota3 * 5));
		media = soma / 10;
		
		if(media >= 8 && media <= 10) {
			System.out.println("Conceito A");
		}
		if(media >= 7 && media < 8) {
			System.out.println("Conceito B");
		}
		if(media >= 6 && media < 7) {
			System.out.println("Conceito C");
		}
		if(media >= 5 && media < 6) {
			System.out.println("Conceito D");
		}
		if(media >= 0 && media < 5) {
			System.out.println("Conceito E");
		}
		
	}

}
