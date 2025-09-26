import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int maiorNumero = 0;
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite o número " + (i + 1) + ":");
            numeros[i] = scanner.nextInt();
            if(numeros[i] > maiorNumero){
                maiorNumero = numeros[i];
            }
        }
        System.out.println("O maior número é: " + maiorNumero);
        scanner.close();
    }
}
