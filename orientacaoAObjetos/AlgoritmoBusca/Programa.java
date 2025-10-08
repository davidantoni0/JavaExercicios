package orientacaoAObjetos.AlgoritmoBusca;

public class Programa {
    public static void main(String[] args) {
        int[] vetor = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int valorProcurado = 7;
        int indiceSequencial = BuscaSequencial.buscaSequencial(vetor, valorProcurado);

        if (indiceSequencial != -1) {
            System.out.println("Valor " + valorProcurado + " encontrado na posição (Busca Sequencial): " + indiceSequencial);
        } else {
            System.out.println("Valor " + valorProcurado + " não encontrado (Busca Sequencial)");
        }

        int indiceBinaria = BuscaBinaria.buscaBinaria(vetor, valorProcurado);
        if (indiceBinaria != -1) {
            System.out.println("Valor " + valorProcurado + " encontrado na posição (Busca Binária): " + indiceBinaria);
        } else {
            System.out.println("Valor " + valorProcurado + " não encontrado (Busca Binária)");
        }
    }
    
}
