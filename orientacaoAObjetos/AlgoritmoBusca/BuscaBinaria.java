package orientacaoAObjetos.AlgoritmoBusca;

public class BuscaBinaria {
    public static int buscaBinaria(int[] vetor, int valorProcurado) {
        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            if (vetor[meio] == valorProcurado) {
                return meio; // Retorna o índice onde o valor foi encontrado
            }
            if (vetor[meio] < valorProcurado) {
                inicio = meio + 1; // Continua a busca na metade direita
            } else {
                fim = meio - 1; // Continua a busca na metade esquerda
            }
        }
        return -1; // Retorna -1 se o valor não foi encontrado
    }
}
