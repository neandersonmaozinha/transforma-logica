package tiposprimitivos;
import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        /* 1 - Crie uma classe que receba o valor de um produto e a 
        porcentagem de desconto, calcule e mostre o valor do desconto 
        e o valor do produto com o desconto. 
        Observação: o valor do desconto é calculado por meio da fórmula:
        valor do desconto = valor do produto * percentual de desconto / 100. 
        */
        Scanner console = new Scanner(System.in);
        
        double desconto = 0.0;
        

        System.out.println("Digite valor do produto:");
        double valorProduto = console.nextDouble();

        System.out.println("Digite o percentual do produto: ");
        double percentualDesconto = console.nextDouble();

        desconto = valorProduto * (percentualDesconto / 100);
        double valorDoProdutoComDesconto = valorProduto - desconto;

        System.out.println( "Valor do produto com desconto é de: " + valorDoProdutoComDesconto + " Deconto do produto foi de: " + desconto);









    }
}