package FilasEPilhas.SistemaEmbarque;

public class Programa {
    public static void main(String[] args) {
        Pessoa pessoas[] = new Pessoa[7];
        pessoas[0] = new Pessoa("Ana");
        pessoas[1] = new Pessoa("Bruno");
        pessoas[2] = new Pessoa("Carla");
        pessoas[3] = new Pessoa("Daniel");
        pessoas[4] = new Pessoa("Eva");
        pessoas[5] = new Pessoa("Fabio");
        pessoas[6] = new Pessoa("Gisele");

        Fila filaPrincipal = new Fila(7);
        Pilha pilhaEmbarque = new Pilha(4);

        for (int i = 0; i < pessoas.length; i++) {
            Pessoa pessoa = pessoas[i];
            filaPrincipal.enqueue(pessoa);
        }

        int tamanhoFila = filaPrincipal.tamanho();

        for (int i = 0; i < tamanhoFila; i++) {
            if (pilhaEmbarque.tamanho() < 4) {
            Pessoa p = filaPrincipal.dequeue();
            pilhaEmbarque.push(p);
            }
            System.out.println();                               
        }

        System.out.println("Pessoas na pilha de embarque:");
        pilhaEmbarque.mostrarPilha();
        System.out.println("\nPessoas restantes na fila principal:");
        filaPrincipal.mostrarFila();

        for (int i = 0; i < 4; i++) {
            pilhaEmbarque.pop();
        }
    }
}

