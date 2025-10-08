package orientacaoAObjetos.AlgoritmoBusca.AlgoritmoOrdenacao;

public class SelectionSort {
    public static void selectionSort(int[] vetor) {
        int tamanhoDoVetor = vetor.length;

        for (int i = 0; i < tamanhoDoVetor - 1; i++) {
            int posicaoMenorNumero = i;
            for (int j = i + 1; j < tamanhoDoVetor; j++) {
                if (vetor[j] < vetor[posicaoMenorNumero]) {
                    posicaoMenorNumero = j;
                }
            }
            // Troca o elemento mínimo encontrado com o primeiro elemento
            int temp = vetor[posicaoMenorNumero];
            vetor[posicaoMenorNumero] = vetor[i];
            vetor[i] = temp;
        }
    }
}
