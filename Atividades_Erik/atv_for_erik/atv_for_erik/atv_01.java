package forr;

import java.util.Scanner;

public class atv_01 {
	
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
  
int numero;
  
System.out.println("Digite um número");
numero = sc.nextInt();

for (int i = 1; i < 11; i++) {
	System.out.println(+numero+ " * " +i+ " = " +(numero *i));
}

sc.close();
	}

}
