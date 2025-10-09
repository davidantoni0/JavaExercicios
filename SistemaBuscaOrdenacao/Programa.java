package SistemaBuscaOrdenacao;

public class Programa {
    public static void main(String[] args) {
        Item[] itens = {
            new Item("Banana", 5),
            new Item("Maçã", 3),
            new Item("Laranja", 8),
            new Item("Uva", 2)
        };

        String[] nomes = new String[itens.length];
        for (int i = 0; i < itens.length; i++) {
            nomes[i] = itens[i].nome;
        }

        SelectionSortcomString.selectionSort(nomes);
        System.out.println("Itens e quantidades ordenados por nome:");
        for (String nome : nomes) {
            for (Item item : itens) {
                if (item.nome.equals(nome)) {
                    System.out.println("Nome: " + item.nome + ", Quantidade: " + item.quantidade);
                    break;
                }
            }
        }

        BuscaBinariaComString.buscaBinaria(nomes, "Uva");
        if(BuscaBinariaComString.buscaBinaria(nomes, "Uva") != -1) {
            System.out.println("Item 'Uva' encontrado na posição: " + BuscaBinariaComString.buscaBinaria(nomes, "Uva"));
        } else {
            System.out.println("Item 'Uva' não encontrado.");
        }


    }
}
