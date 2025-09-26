import java.util.Scanner;

public class CalculadorDeMediaVetor {
    public static void main(String[] args) {
        double[] notas = new double[4];
        double soma = 0;
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < notas.length; i++){
            System.out.println("Digite a nota " + (i + 1) + ":");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }
        System.out.println("A média das notas é: " + (soma / notas.length));
        scanner.close();

    }
}
