import java.util.Scanner;

public class atv_03while {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num, i =0, qtdNum=0, somaNum = 0, par=0, mediaPar=0, impar=0, soma=0;
    
        int numMaior = 0;
        int numMenor = 0;

        do {
            System.out.println("Informe um número: ");
            num = sc.nextInt();
            
            soma = soma +num;
            i = i + 1;
            
            if (num%2==0) {
                mediaPar = mediaPar +num;
                par++;
            }
            
            if (num<numMenor && num !=0) {
                numMenor = num;
            }
            
            if (num> numMaior) {
                numMaior = num;
            }
            if (num==0) {
                i--;
                par--;
            }
            
        } while (num<30.000);
        
        int media = soma/i;
        mediaPar = mediaPar/par;
        
        System.out.println("Soma: " + soma);
        System.out.println("Quantidade de números digitados: " + i);
        System.out.println("Maior número digitado: " + numMaior);
        System.out.println("Menor número digitado: " + numMenor);
        System.out.println("Média dos números pares: " + media); 
    }

}