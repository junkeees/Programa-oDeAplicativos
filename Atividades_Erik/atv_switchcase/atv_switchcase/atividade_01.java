import java.util.Scanner;

public class atividade_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		double percentual;
		double salario;
		double novoSalario;
		System.out.println("Informe o Sal�rio: ");
		salario = sc.nextDouble();
		System.out.println("Informe o cargo: ");
		x = sc.nextInt();
		String cargo;
		switch (x) {
		case 1:
			cargo = "Escritur�rio";
			percentual = 0.5;
			novoSalario = salario * percentual;
			System.out.println("Cargo: " +cargo);
			System.out.println("Novo sal�rio: " +(salario + novoSalario));
			break;
		case 2:
			cargo = "Secret�rio";
			percentual = 0.35;
			novoSalario = salario * percentual;
			System.out.println("Cargo: " +cargo);
			System.out.println("Novo sal�rio: " +(salario + novoSalario));
			break;
		case 3:
			cargo = "Caixa";
			percentual = 0.2;
			novoSalario = salario * percentual;
			System.out.println("Cargo: " +cargo);    
			System.out.println("Novo sal�rio: " +(salario + novoSalario));
			break;
		case 4:
			cargo = "Gerente";
			percentual = 0.1;
			novoSalario = salario * percentual;
			System.out.println("Cargo: " +cargo);
			System.out.println("Novo sal�rio: " +(salario + novoSalario));
			break;
		case 5:
			cargo = "Diretor";
			System.out.println("Cargo: " +cargo);
			System.out.println("N�o tem aumento");
			break;
		default:
			System.out.println("Cargo inv�lido");
			break;
		}
		
	}
	
}
