package Lista1;

import java.util.Scanner;

public class QuestaoB {

	public static void main(String[] args) {

		String nome;

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe seu nome: ");
		nome = sc.next();

		sc.close();

		System.out.println("Olá " + nome + "!!");

	}

}
