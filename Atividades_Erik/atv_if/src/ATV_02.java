import java.util.Scanner;

public class ATV_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Diga a primeira nota");
		double nota1 = sc.nextDouble();
		
		System.out.println("Diga a segunda nota");
		double nota2 = sc.nextDouble();
		
		System.out.println("Diga a terceira nota");
		double nota3 = sc.nextDouble();
		
		double media = (nota1 + nota2 +nota3)/3;
		
		if (media>=7) {
			System.out.printf("media: %.2f"+"\nAprovado",media);
		}
		if (media>=3 && media<7) {
			System.out.printf("media: %.2f"+"\nEm exame",media);
		}
		if (media<3) {
			System.out.printf("media: %.2f"+"\nReprovado",media);
		}
		sc.close();
	}

}
