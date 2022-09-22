import java.util.Scanner;

public class atividade_4 {
   
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);

        double produto = 5000, valorTotal = 0, valorParcela = 0, diferenca;
        int opcao;

        System.out.println("Opções de pagamento:\n" +
                "1 - Pagamento à vista - 15% de desconto sobre o valor total da compra\n" +
                "2 - Pagamento com cheque pré-datado para 30 dias - 10% de desconto sobre o valor total da compra\n" +
                "3 - Pagamento parcelado em 6 vezes - não haverá desconto\n" +
                "4 - Pagamento parcelado em 12 vezes - 8% de acréscimo sobre o valor da compra." +
                "\n\nDigite sua opcao: ");
        
        opcao = sc.nextInt();
        
        switch (opcao){
            case 1:
                valorTotal = produto - (produto * 0.15);
            case 2:
                valorTotal = produto - (produto * 0.1);
            case 3:
                valorTotal = produto;
                valorParcela = valorTotal / 6;
                System.out.println("Quantidade de parcelas: 6");
                System.out.println("Valor das parcelas: " + valorParcela);
            case 4:
                valorTotal = produto + (produto * 0.08);
                valorParcela = valorTotal / 12;
                System.out.println("Quantidade de parcelas: 12");
                System.out.println("Valor das parcelas: " + valorParcela);
        };

        diferenca = valorTotal - produto;

        System.out.println("Valor da compra: " + produto + "\nValor final: " + valorTotal);

        if(diferenca > 0){
            System.out.println("Juros: " + diferenca); 
        } else {
            System.out.println("Desconto: " + diferenca);
        }
    }
}