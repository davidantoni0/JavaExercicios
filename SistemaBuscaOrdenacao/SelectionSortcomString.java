package SistemaBuscaOrdenacao;

public class SelectionSortcomString {
    public static void selectionSort(String[] vetor) {
        int tamanhoDoVetor = vetor.length;

        for (int i = 0; i < tamanhoDoVetor - 1; i++) {
            int menorNoIndex = i;
            for (int j = i + 1; j < tamanhoDoVetor; j++) {
                if (vetor[j].compareToIgnoreCase(vetor[menorNoIndex]) < 0) {
                    menorNoIndex = j;
                }
            }
            String temp = vetor[menorNoIndex];
            vetor[menorNoIndex] = vetor[i];
            vetor[i] = temp;
        }
    }
    
}
