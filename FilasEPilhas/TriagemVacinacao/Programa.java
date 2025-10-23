package FilasEPilhas.TriagemVacinacao;

public class Programa {
    public static void main(String[] args) {
        Pessoa pessoas[] = new Pessoa[5];
        pessoas[0] = new Pessoa("Ana", 65);
        pessoas[1] = new Pessoa("Bruno", 45);
        pessoas[2] = new Pessoa("Carla", 70);
        pessoas[3] = new Pessoa("Daniel", 30);
        pessoas[4] = new Pessoa("Eva", 80);

        FilaPreferencial filaPreferencial = new FilaPreferencial(5);
        FilaComum filaComum = new FilaComum(5);

        for (int i = 0; i < pessoas.length; i++) {
            filaPreferencial.enqueue(pessoas[i]);
            filaComum.enqueue(pessoas[i]);
        }
        System.out.println("\nFila preferencial:");
        filaPreferencial.mostrarFila();
        System.out.println("\nFila comum:");
        filaComum.mostrarFila();

    }
}
