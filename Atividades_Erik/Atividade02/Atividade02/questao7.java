package hola;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		
		int A, B, C, I;

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe se você quer 1, 2 ou 3: ");
		I = sc.nextInt();
		
		if(I == 1) {
		System.out.print("Informe um número: ");
		A = sc.nextInt();
		System.out.print("Informe outro numero: ");
		B = sc.nextInt();
		System.out.print("Informe outro numero: ");
		C = sc.nextInt();

		sc.close();

		if (A > B) {
			if (A > C) {
				if (B > C) {
					System.out.println("ordem: " + C + ", " + B + ", " + A);
				} else if(C > B) {
					System.out.println("ordem: " + B + ", " + C + ", " + A);
				}
			} else if (C > B) {
				System.out.println("ordem: " + B + ", " + A + ", " + C);
			}
		} else if (B > C) {
			if (A > C) {
				if (B > A) {
					System.out.println("ordem: " + C + ", " + A + ", " + B);
				}
			} else if (C > A) {
				System.out.println("ordem: " + A + ", " + C + ", " + B);
			}
		} else if (C > B) {
			if (B > A) {
				System.out.println("ordem: " + A + ", " + B + ", " + C);
			}
		}
		if(B == C || A == B || A == C) {
			System.out.println("Tem dois números iguai ae meu irmão");
		}

		}
		if(I == 2) {
			System.out.print("Informe um número: ");
			A = sc.nextInt();
			System.out.print("Informe outro numero: ");
			B = sc.nextInt();
			System.out.print("Informe outro numero: ");
			C = sc.nextInt();

			sc.close();

			if (A > B) {
				if (A > C) {
					if (B > C) {
						System.out.println("ordem: " + A + ", " + B + ", " + C);
					} else if(C > B) {
						System.out.println("ordem: " + A + ", " + C + ", " + B);
					}
				} else if (C > B) {
					System.out.println("ordem: " + C + ", " + A + ", " + B);
				}
			} else if (B > C) {
				if (A > C) {
					if (B > A) {
						System.out.println("ordem: " + B + ", " + A + ", " + C);
					}
				} else if (C > A) {
					System.out.println("ordem: " + B+ ", " + C + ", " + A);
				}
			} else if (C > B) {
				if (B > A) {
					System.out.println("ordem: " + C + ", " + B + ", " +A);
				}
			}
			if(B == C || A == B || A == C) {
				System.out.println("Tem dois números iguai ae meu irmão");
			}

			}
		if(I == 3) {
			System.out.print("Informe um número: ");
			A = sc.nextInt();
			System.out.print("Informe outro numero: ");
			B = sc.nextInt();
			System.out.print("Informe outro numero: ");
			C = sc.nextInt();

			sc.close();

			if (A > B) {
				if (A > C) {
					if (B > C) {
						System.out.println("ordem: " + C + ", " + A + ", " + B);
					} else if(C > B) {
						System.out.println("ordem: " + B + ", " + A + ", " + C);
					}
				} else if (C > B) {
					System.out.println("ordem: " + B + ", " + C + ", " + A);
				}
			} else if (B > C) {
				if (A > C) {
					if (B > A) {
						System.out.println("ordem: " + C + ", " + B + ", " + A);
					}
				} else if (C > A) {
					System.out.println("ordem: " + A + ", " + B + ", " + C);
				}
			} else if (C > B) {
				if (B > A) {
					System.out.println("ordem: " + A + ", " + C + ", " + B);
				}
			}
			if(B == C || A == B || A == C) {
				System.out.println("Tem dois números iguai ae meu irmão");
			}

			}
	}

}
