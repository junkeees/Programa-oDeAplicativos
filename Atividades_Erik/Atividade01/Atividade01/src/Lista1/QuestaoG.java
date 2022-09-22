package Lista1;

import java.util.Scanner;

public class QuestaoG{

	public static void main(String[] args) {
		
		long telefone;
		String nome, endereco;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe seu nome: ");
		nome = sc.next();
		System.out.print("Informe seu endereço: ");
		endereco = sc.next();
		System.out.print("Informe seu telefone: ");
		telefone = sc.nextLong();
		
		sc.close();
		
		System.out.println("Olá "+nome+"\nSeu telefone é: "+telefone+"\nSeu endereço é: "+endereco);

	}

}
