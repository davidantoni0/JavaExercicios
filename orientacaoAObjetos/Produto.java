package orientacaoAObjetos;

import java.util.Scanner;

public class Produto {
    String nome;
    int codigo;
    double preco;
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto:");
        produto1.nome = scanner.nextLine();
        System.out.println("Digite o código do produto:");
        produto1.codigo = scanner.nextInt();
        System.out.println("Digite o preço do produto:");
        produto1.preco = scanner.nextDouble();

        System.out.println("Produto: " + produto1.nome + ", código: " + produto1.codigo + ", preço: " + produto1.preco);
        scanner.close();

    }
}
