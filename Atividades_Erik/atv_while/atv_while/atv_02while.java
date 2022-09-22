import java.util.Scanner;

public class atv_02while {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int recebe = 0;
        
        System.out.println("Informe um numero:");
        recebe =  sc.nextInt();
        
        while(recebe >0) {
            System.out.println("Informe um numero:");
            recebe = sc.nextInt();
            
            System.out.println("Numero ao qudrado:"+recebe*recebe);
            System.out.println("Numero ao cubo:"+recebe*recebe*recebe);
            System.out.println("Raiz qudrada do numero:"+Math.sqrt(recebe));
        }
        
        sc.close();
    }
    

}
