package Lista1;

import java.util.Scanner;

public class QuestaoL {

	public static void main(String[] args) {
		
		double saldo, reajuste;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe seu saldo: ");
		saldo = sc.nextDouble();
		
		sc.close();
		
		reajuste = saldo + (saldo * 0.01);
		
		System.out.println("Seu novo saldo é: "+reajuste);

	}

}
