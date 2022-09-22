import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mes1, ano1, dia1, mes2, ano2, dia2;
		System.out.print("Informe um ano:");
		ano1 = sc.nextInt();
		System.out.print("Informe um mês: ");
		mes1 = sc.nextInt();
		System.out.print("Informe um dia: ");
		dia1 = sc.nextInt();
		System.out.print("Informe outro ano:");
		ano2 = sc.nextInt();
		System.out.print("Informe outro mês: ");
		mes2 = sc.nextInt();
		System.out.print("Informe outro dia: ");
		dia2 = sc.nextInt();

		if (ano1 > ano2) {
			if (mes1 > mes2) {
				if (dia1 > dia2) {
					System.out.print("Data: " + dia1 + "/" + mes1 + "/" + ano1);
				} else {
					System.out.print("Data: " + dia1 + "/" + mes1 + "/" + ano1);
				}
			} else {
				System.out.print("Data: " + dia1 + "/" + mes1 + "/" + ano1);
			}
		} else if (ano2 > ano1) {
			if (mes2 > mes2) {
				if (dia2 > dia1) {
					System.out.print("Data: " + dia2 + "/" + mes2 + "/" + ano2);
				} else {
					System.out.print("Data: " + dia2 + "/" + mes2 + "/" + ano2);
				}
			} else {
				System.out.print("Data: " + dia2 + "/" + mes2 + "/" + ano2);
			}
		} else if (ano1 == ano2) {
			if (mes1 > mes2) {
				if (dia1 > dia2) {
					System.out.print("Data: " + dia1 + "/" + mes1 + "/" + ano1);
				}
			} else if (mes1 == mes2) {
				if (dia1 > dia2) {
					System.out.print("Data: " + dia1 + "/" + mes1 + "/" + ano1);
				} else {
					System.out.print("Data: " + dia2 + "/" + mes2 + "/" + ano2);
				}
			} else {
				System.out.print("Data: " + dia2 + "/" + mes2 + "/" + ano2);
			}
		}
		sc.close();
	}

}
