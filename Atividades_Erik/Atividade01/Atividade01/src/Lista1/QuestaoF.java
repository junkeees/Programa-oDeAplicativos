package Lista1;

import java.util.Scanner;

public class QuestaoF {

	public static void main(String[] args) {
		
		int num, suc, ant;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		num = sc.nextInt();
		
		sc.close();
		
		suc = num+1;
		ant = num-1;
		System.out.println("O número digitado foi: "+num+"\nSeu sucessor: "+suc+"\nSeu antecessor: "+ant);

	}

}