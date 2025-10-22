package Encapsulamento.Icms;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char resposta;
        String descricao;
        double valor;
        double quantidade;
        double icms;

        do{
        System.out.println("Digite a descrição do produto:");
        descricao = scanner.next();
        System.out.println("Digite o valor do produto:");
        valor = scanner.nextDouble();
        System.out.println("Digite a quantidade do produto:");
        quantidade = scanner.nextDouble();
        Produto produto = new Produto(descricao, valor, quantidade);
        icms = CalcularIcms.calcularIcms(produto);
        System.out.println("Descrição: " + produto.getDescricao());
        System.out.println("Valor: R$ " + String.format("%.2f", produto.getValor()));
        System.out.println("Total: R$ " + String.format("%.2f", produto.getValor() * produto.getQuantidade()));
        System.out.println("ICMS: R$ " + String.format("%.2f", icms));
        System.out.println("Deseja encerrar o programa? (s/n)");
        resposta = scanner.next().charAt(0);
        } while(resposta != 's' && resposta != 'S');
        scanner.close();
    }

    
}
