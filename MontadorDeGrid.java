import java.util.Scanner;

public class MontadorDeGrid {

    public static void main(String[] args) {
        int linhas = 10;
        int colunas = 10;
        int[][] matriz = new int[linhas][colunas];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.println("Digite o valor para a posição [" + i + "][" + j + "]:");
                matriz[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " \t");
            }
            System.out.println();
        }
        scanner.close();
    }
}