package SistemaTimes;



public class TimeDeFutebol {
    String nomeDoTime;
    Jogador[] jogadores;

        public TimeDeFutebol() {
        this.nomeDoTime = "Mengão";
        this.jogadores = new Jogador[11];


        }

    public void contratarJogador(Jogador jogador, int camisa) {
        if (camisa < 1 || camisa >= jogadores.length + 1) {
            System.out.println("Posição inválida. Deve ser entre 1 e 11.");
            return;
        }
        else if (jogadores[camisa - 1] != null) {
            System.out.println("Posição já ocupada por " + jogadores[camisa - 1].nome);
            return;
        }
        jogadores[camisa -1] = jogador;
        System.out.println("Jogador " + jogador.nome + " contratado para usar a camisa " + camisa);
    }

    static void exibirEscalacao( TimeDeFutebol time) {
        for (int i = 0; i < time.jogadores.length; i++) {
            if (time.jogadores[i] != null) {
                System.out.println("Posição " + (i+1) + ": " + time.jogadores[i].nome + " - " + time.jogadores[i].posicao);
            } else {
                System.out.println("Posição " + (i+1) + ": Vaga disponível");
            }
        }
    }


}

