package SistemaTimes;

import java.util.Scanner;

public class Programa {
        public static void main(String[] args) {
        TimeDeFutebol time = new TimeDeFutebol();
        Scanner scanner = new Scanner(System.in);
        

        for (int i = 0; i < 3 ; i++) {
            System.out.print("Digite o nome do jogador: ");
            String nome = scanner.nextLine();
            System.out.print("Digite a posição do jogador: ");
            String posicao = scanner.nextLine();
            System.out.print("Digite a posição no time (1-11): ");
            int numeroCamisa = scanner.nextInt();
            scanner.nextLine();

            Jogador jogador = new Jogador(nome, posicao);
            time.contratarJogador(jogador, numeroCamisa);
        }

        System.out.println("Time: " + time.nomeDoTime);
        TimeDeFutebol.exibirEscalacao(time);
        scanner.close();
    }
    
}
