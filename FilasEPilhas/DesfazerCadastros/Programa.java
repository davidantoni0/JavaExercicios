package FilasEPilhas.DesfazerCadastros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);
        int opcao = 0;
        Scanner scanner = new Scanner(System.in);
            
        

        System.out.println("Sistema de cadastro:");

        while(opcao != 4){
            System.out.println("1. Cadastrar pessoa");
            System.out.println("2. Desfazer último cadastro");
            System.out.println("3. Mostrar pessoas cadastradas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número entre 1 e 4.");
                scanner.next(); // Limpa a entrada inválida
                continue;
            }
            switch(opcao){

                case 1:
                    System.out.print("Digite o nome da pessoa: ");
                    String nome = scanner.next();
                    Pessoa novaPessoa = new Pessoa(nome);
                    pilha.push(novaPessoa);
                    break;
                case 2:
                    pilha.pop();
                    break;
                case 3:
                    System.out.println("Pessoas cadastradas:");
                    pilha.mostrarPilha();
                    break;
                case 4:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            
        }
        scanner.close();
    }
}
