import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora, min, hora1, min1, horafim, minfim;

		System.out.print("Informe a hora de início: ");
		hora = sc.nextInt();
		System.out.print("Informe o minuto de início: ");
		min = sc.nextInt();
		System.out.print("Informe a hora de término: ");
		hora1 = sc.nextInt();
		System.out.print("Informe o minuto de término: ");
		min1 = sc.nextInt();

		horafim = hora1 - hora;
		minfim = min1 - min;
		if (horafim > 24) {
			System.out.println("Passou do limite de tempo!");
		} else {
			if (minfim > 0) {
				System.out.println("Tempo: " + horafim + " horas e " + minfim + " minutos");
			} else {
				System.out.println("Tempo: " + horafim + " horas e " + (-minfim) + " minutos");
			}
		}
		sc.close();
	}

}
