package orientacaoAObjetos.SistemaEscolar;

public class Aluno {
    String nome;
    int matricula;
    double notaFinal;

    void verificarAprovacao() {
        if (notaFinal >= 7) {
            System.out.println(nome +" está aprovado!");
        } else {
            System.out.println(nome + " está em recuperação!");
        }
    }
    
    void apresentarDados(int num) {
        System.out.println("Aluno "+ num +": Nome: " + nome + ", Matrícula: " + matricula + ", Nota Final: " + notaFinal);
    }
    
}
