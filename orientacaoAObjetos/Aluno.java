package orientacaoAObjetos;
import java.util.Scanner;
public class Aluno {
    String nome;
    int matricula;
    double notaFinal;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno[] alunos = new Aluno[3];

        for (int i = 0; i < alunos.length; i++) {
            alunos[i] = new Aluno();
            System.out.println("Digite o nome do aluno " + (i + 1) + ":");
            alunos[i].nome = scanner.next(); // se usar NextLine() aqui, pulará a entrada, sendo necessário um scanner.nextLine() extra no final do loop
            System.out.println("Digite a matrícula do aluno " + (i + 1) + ":");
            alunos[i].matricula = scanner.nextInt();
            System.out.println("Digite a nota final do aluno " + (i + 1) + ":");
            alunos[i].notaFinal = scanner.nextDouble();            

        }
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Aluno: " + alunos[i].nome + ", Matrícula: " + alunos[i].matricula + ", Nota Final: " + alunos[i].notaFinal);
        }

        scanner.close();
    }

}
