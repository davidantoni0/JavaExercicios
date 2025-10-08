package orientacaoAObjetos.AlgoritmoBusca;

public class BuscaBinaria {
    public static int buscaBinaria(int[] vetor, int valorProcurado) {
        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            if (vetor[meio] == valorProcurado) {
                return meio;
            }
            if (vetor[meio] < valorProcurado) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }
}
