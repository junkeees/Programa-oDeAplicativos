package dowhile;

import java.util.Scanner;

public class atv_01 {	

public static void main(String[] args) {	

Scanner sc = new Scanner(System.in);

int x;

System.out.println("Digite um n�mero maior que 1");

x = sc.nextInt();
	
do {

if (x % 2 == 1 ) {
	
System.out.println("O n�mero � primo");

} else {
	
System.out.println("O n�mero n�o � primo");
	
	
}


break;
 
} while (x > 1); 

}
  }







 
