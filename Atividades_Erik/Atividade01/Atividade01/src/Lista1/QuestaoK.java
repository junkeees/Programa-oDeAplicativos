package Lista1;

import java.util.Scanner;

public class QuestaoK {

	public static void main(String[] args) {
		
		double media, num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		num1 = sc.nextInt();
		System.out.print("Informe outro número: ");
		num2 = sc.nextInt();
		
		sc.close();

		media = (num1 + num2) / 2;
		
		System.out.println("Produto dos dois números: "+media);
	}

}