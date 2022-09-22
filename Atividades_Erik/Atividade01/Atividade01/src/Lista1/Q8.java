package Lista1;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Informe sua idade: ");
		idade = sc.nextInt();
		
		sc.close();
		
		System.out.println("A idade informada foi de: "+idade+ " anos");
	}

}
