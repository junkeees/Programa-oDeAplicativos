package Lista1;

import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idadano, idadmes, idaddia, mes, ano, dias;
		
		System.out.print("Informe quantos anos você tem: ");
		idadano = sc.nextInt();
		System.out.print("Informe quantos meses depois do seu niver voce tem: ");
		idadmes = sc.nextInt();
		System.out.print("Informe quantos dias depois dos meses você tem: ");
		idaddia = sc.nextInt();
		
		sc.close();
		
		mes = idadmes * 30;
		ano = idadano * 365;
		dias = mes + ano + idaddia;
		
		System.out.println("Essa é a quantidade de dias que você tem: "+dias);

	}

}
