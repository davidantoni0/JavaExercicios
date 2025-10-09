package SistemaBuscaOrdenacao;

public class BuscaBinariaComString {
    public static int buscaBinaria(String[] vetor, String valorProcurado) {
        int inicio = 0;
        int fim = vetor.length - 1;
        
        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;
            int comparacao = vetor[meio].compareToIgnoreCase(valorProcurado);

            if (comparacao == 0) {
                return meio;
            }
            if (comparacao < 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }
    
}
