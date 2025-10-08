package orientacaoAObjetos.AlgoritmoBusca;

public class BuscaSequencial {
    public static int buscaSequencial(int[] vetor, int valorProcurado) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valorProcurado) {
                return i; // Retorna o índice onde o valor foi encontrado
            }
        }
        return -1; // Retorna -1 se o valor não foi encontrado
    }
    
}
