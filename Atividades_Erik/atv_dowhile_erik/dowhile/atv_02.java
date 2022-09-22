package dowhile;

import java.util.Scanner;

public class atv_02 {

static Scanner sc = new Scanner(System.in);

public static void main(String[] args) {
        
int contCidade = 0, codigo, numeroVeiculos, acidentes, somaVeiculos = 0, somaVeiculosMenos = 0,
        
cidadeMenos = 0, maior = 0, menor = 999999999, somaAcidentes = 0, codigoMenor = 0, codigoMaior = 0;

do {

System.out.println("Codigo da cidade: ");
            
codigo = sc.nextInt();
            
System.out.println("Números de veiculos de passeios: ");
            
numeroVeiculos = sc.nextInt();
            
System.out.println("Número de acidentes: ");
            
acidentes = sc.nextInt();

            
if (numeroVeiculos < 2000) {
             
cidadeMenos++;
                
somaVeiculosMenos += acidentes;
            
}
            
            
if (acidentes < menor) {
               
codigoMenor = codigo;
               
menor = acidentes;
           
}
            
            
if (acidentes > maior) {
                
codigoMaior = codigo;
                
maior = acidentes;
            
}
            
            
somaAcidentes += acidentes;

somaVeiculos += numeroVeiculos;
           
contCidade++;
       
} while (contCidade <= 4);

        
System.out.println("Codigo cidade: " + codigoMaior +  " Maior indice de acidentes: " + (maior * 100)/somaAcidentes);
        
System.out.println("Codigo cidade: " + codigoMenor + " Menor indice de acidentes: " + (menor * 100)/somaAcidentes);
        
System.out.println("Média de veiculos das cidades: " + (somaVeiculos / 5));
        
System.out.println("Média de acidentes de transito com cidades com menos de 2000 veiculos: " + (somaVeiculosMenos / cidadeMenos));
    }

}