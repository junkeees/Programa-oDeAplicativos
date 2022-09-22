package hola;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		
		double nota1, nota2, nota3, soma, media, nota;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe sua primeira nota: ");
		nota1 = sc.nextDouble();
		System.out.print("Informe sua segunda nota: ");
		nota2 = sc.nextDouble();
		System.out.print("Informe sua terceira nota: ");
		nota3 = sc.nextDouble();
		
		sc.close();
		
		soma = nota1+nota2+nota3;
		media = soma / 3;
		
		if(media >= 6 && media <= 10) {
			System.out.println("Aprovado");
		}
		if(media >= 3 && media < 5.9) {
			nota = 6 - media;
			System.out.println("Exame\nPrecisa tirar "+nota+" para passar");
		}
		if(media >= 0 && media < 3) {
			System.out.println("Reprovado");
		}
		
	}

}