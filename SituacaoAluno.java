import java.util.Scanner;
public class SituacaoAluno {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        double media = (nota1 + nota2) / 2;
        
        if (media >= 10) {
            System.out.println("Aprovado parabéns!");  
        }else if (media >= 7.0) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado");
        }
        scanner.close();
    }
    
}
