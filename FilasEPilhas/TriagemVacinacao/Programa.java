package FilasEPilhas.TriagemVacinacao;


public class Programa {
    public static void main(String[] args) {
        Pessoa pessoas[] = new Pessoa[5];
        pessoas[0] = new Pessoa("Ana", 65);
        pessoas[1] = new Pessoa("Bruno", 45);
        pessoas[2] = new Pessoa("Carla", 70);
        pessoas[3] = new Pessoa("Daniel", 30);
        pessoas[4] = new Pessoa("Eva", 80);

        
        Fila filaPrincipal = new Fila(5);
        Fila filaPreferencial = new Fila(5);
        Fila filaComum = new Fila(5);
        
        for (int i = 0; i < pessoas.length; i++) {
            filaPrincipal.enqueue(pessoas[i]);
        }
        
        int tamanhoDaFila = filaPrincipal.tamanho();

        for (int i = 0; i < tamanhoDaFila; i++) {
            Pessoa p = filaPrincipal.dequeue();
            if (p.getIdade() >= 60) {
                filaPreferencial.enqueue(p);
            } else {
                filaComum.enqueue(p);
            }
        }
        System.out.println("\nFila preferencial:");
        filaPreferencial.mostrarFila();
        System.out.println("\nFila comum:");
        filaComum.mostrarFila();
    }
}
