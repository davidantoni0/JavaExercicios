import java.util.Scanner;

public class ListaDeCompras {
    public static void main(String[] args) {
        String[] listaDeCompras = new String[5];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < listaDeCompras.length; i++){
            System.out.println("Digite o item " + (i + 1) + " da lista de compras:");
            listaDeCompras[i] = scanner.nextLine();
        }
        System.out.println("Sua lista de compras:");
        for(String item : listaDeCompras){
            System.out.println("- " + item);
        }


        scanner.close();
    }
}
