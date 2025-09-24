public class PopulandoMatrizes {
    public static void main(String[] args) {
        int linhas = 3;
        int colunas = 3;
        int[][] matriz = new int[linhas][colunas];
        int valor = 0;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = valor;
                valor++;
            }
        }

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
