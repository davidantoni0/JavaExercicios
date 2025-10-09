package orientacaoAObjetos.AlgoritmoBusca.AlgoritmoOrdenacao;

public class Programa {
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        
        System.out.println("Array original:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        

        InsertionSort.insertionSort(array);

        System.out.println("Array ordenado:");
        for (int num : array) {
            System.out.print(num + " ");
        }

    }


}
