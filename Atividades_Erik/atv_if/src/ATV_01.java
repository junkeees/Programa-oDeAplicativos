import java.util.Scanner;

public class ATV_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Diga a nota trabalho de laboratorio");
		double nota1 = sc.nextDouble();
		
		System.out.println("Diga a nota da avaliação semestral");
		double nota2 = sc.nextDouble();
		
		System.out.println("Diga a nota do exame final");
		double nota3 = sc.nextDouble();
		
		double media = ((nota1 * 2)+(nota2 *3)+(nota3 *5))/(2+3+5);
		
		if (media>=8) {
			System.out.println("media: "+media+"\nconceito: A");
			
			
		}
		if (media>=7 && media<8) {
			System.out.println("media: "+media+"\nconceito: B");
		}
		if (media>=6 && media<7 ) {
			System.out.println("media: "+media+"\nconceito: C");
		}
		if (media>=5 && media<6) {
			System.out.println("media: "+media+"\nconceito: D");
		}
		if (media<5) {
			System.out.println("media: "+media+"\nconceito: E");
		}
	}

}
