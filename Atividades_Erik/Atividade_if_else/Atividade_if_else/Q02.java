import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mes, ano, dia, hora, min;
		System.out.print("Informe o ano:");
		ano = sc.nextInt();
		System.out.print("Informe o mês: ");
		mes = sc.nextInt();
		System.out.print("Informe o dia: ");
		dia = sc.nextInt();
		System.out.print("Informe as horas: ");
		hora = sc.nextInt();
		System.out.print("Informe os minutos: ");
		min = sc.nextInt();
		if(mes == 1) {
			System.out.println(dia+"º de Janeiro de"+ano+" - "+hora+":"+min);
		}else if(mes == 2) {
			System.out.println(dia+"º de Fevereiro de"+ano+" - "+hora+":"+min);
		}else if(mes == 3) {
			System.out.println(dia+"º de Março de"+ano+" - "+hora+":"+min);
		}else if(mes == 4) {
			System.out.println(dia+"º de Abril de"+ano+" - "+hora+":"+min);
		}else if(mes == 5) {
			System.out.println(dia+"º de Maio de"+ano+" - "+hora+":"+min);
		}else if(mes == 6) {
			System.out.println(dia+"º de Junho de"+ano+" - "+hora+":"+min);
		}else if(mes == 7) {
			System.out.println(dia+"º de Julho de"+ano+" - "+hora+":"+min);
		}else if(mes == 8) {
			System.out.println(dia+"º de Agosto de"+ano+" - "+hora+":"+min);
		}else if(mes == 9) {
			System.out.println(dia+"º de Setembro de"+ano+" - "+hora+":"+min);
		}else if(mes == 10) {
			System.out.println(dia+"º de Outubro de"+ano+" - "+hora+":"+min);
		}else if(mes == 11) {
			System.out.println(dia+"º de Novembro de"+ano+" - "+hora+":"+min);
		}else if(mes == 12) {
			System.out.println(dia+"º de Dezembro de"+ano+" - "+hora+":"+min);
		}else {
			System.out.println("Data inválida");
		}
		sc.close();
	}

}
