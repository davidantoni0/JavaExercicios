package orientacaoAObjetos.SistemaEscolar;
import java.util.Scanner;

public class SistemaEscolar {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno[] turma = new Aluno[3];

        for (int i = 0; i < turma.length; i++) {
            turma[i] = new Aluno();
            System.out.println("Digite o nome do aluno " + (i + 1) + ":");
            turma[i].nome = scanner.next(); // se usar NextLine() aqui, pulará a entrada, sendo necessário um scanner.nextLine() extra no final do loop
            System.out.println("Digite a matrícula do aluno " + (i + 1) + ":");
            turma[i].matricula = scanner.nextInt();
            System.out.println("Digite a nota final do aluno " + (i + 1) + ":");
            turma[i].notaFinal = scanner.nextDouble();            

        }
        for (int i = 0; i < turma.length; i++) {
            turma[i].apresentarDados(i+1);
            turma[i].verificarAprovacao();
        }

        scanner.close();
    }

}
