package orientacaoAObjetos.SistemaCorreio;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      Pessoa[] pessoas = new Pessoa[2];

        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i] = new Pessoa();
            pessoas[i].endereco = new Endereço();
            
            System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
            pessoas[i].nome = scanner.next();
            System.out.println("Digite o CPF da pessoa " + (i + 1) + ":");
            pessoas[i].cpf = scanner.nextInt();
            System.out.println("Digite a rua da pessoa " + (i + 1) + ":");
            pessoas[i].endereco.rua = scanner.next();
            System.out.println("Digite o número da casa da pessoa " + (i + 1) + ":");
            pessoas[i].endereco.numero = scanner.nextInt();
            System.out.println("Digite o CEP da pessoa " + (i + 1) + ":");
            pessoas[i].endereco.cep = scanner.next();
            System.out.println("Digite a cidade da pessoa " + (i + 1) + ":");
            pessoas[i].endereco.cidade = scanner.next();
            System.out.println("Digite o estado da pessoa " + (i + 1) + ":");
            pessoas[i].endereco.estado = scanner.next();

        }
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Dados da pessoa " + (i + 1) + ":");
            System.out.println("Nome: " + pessoas[i].nome);
            System.out.println("CPF: " + pessoas[i].cpf);
            System.out.println("Endereço: " + pessoas[i].endereco.rua + ", " + pessoas[i].endereco.numero + ", " + pessoas[i].endereco.cep + ", " + pessoas[i].endereco.cidade + ", " + pessoas[i].endereco.estado);
        }
        scanner.close();
    }
    
}
