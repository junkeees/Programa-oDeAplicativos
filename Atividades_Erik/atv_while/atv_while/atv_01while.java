import java.util.Scanner;

public class atv_01while {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i=1;
        
        System.out.println("Informe o sal�rio do Carlos: ");
        double salCarlos = sc.nextDouble();
        
        double salJoao = salCarlos/3;
        
        System.out.println("Sal�rio do Jo�o � igual a: " + salJoao);
        
        double rendCarlos = (salCarlos*0.02+salCarlos);
        double rendJoao =(salJoao*0.05+salJoao);
        
    
        while (rendJoao<rendCarlos) {
            rendJoao =(rendJoao*0.05+rendJoao);
            rendCarlos = (rendCarlos*0.02+rendCarlos);
            i++;
        }
        
        System.out.println("Meses = " + i);
        
        sc.close();
    }

}