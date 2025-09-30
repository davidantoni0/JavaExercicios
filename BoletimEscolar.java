import javax.swing.JOptionPane;

public class BoletimEscolar {
    public static void main(String[] args) {
        final int NUMERO_DE_ALUNOS = 3;
        final int NUMERO_DE_NOTAS = 4;
        double notasAlunos[][] = new double[NUMERO_DE_ALUNOS][NUMERO_DE_NOTAS];
        double soma = 0;
        double[] media = new double[NUMERO_DE_ALUNOS];

        for(int i = 0; i < NUMERO_DE_ALUNOS; i++){
            for(int j = 0; j < NUMERO_DE_NOTAS; j++){
                notasAlunos[i][j] =     Double.parseDouble(JOptionPane.showInputDialog("Digite a nota " + (j + 1) + " do aluno " + (i + 1) + ":"));
                soma += notasAlunos[i][j];
            }
            media[i] = soma / NUMERO_DE_NOTAS;
            soma = 0;
        }
        String mensagem = "Notas dos alunos:\n";
        for (int i = 0; i < NUMERO_DE_ALUNOS; i++) {
            mensagem += "Aluno " + (i + 1) + " - Notas: ";
            for (int j = 0; j < NUMERO_DE_NOTAS; j++) {
                mensagem += notasAlunos[i][j] + " ";
            }
            mensagem += "- Média: " + media[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, mensagem);
    }


}

