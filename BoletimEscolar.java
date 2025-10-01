import javax.swing.JOptionPane;

public class BoletimEscolar {
    public static void main(String[] args) {

        double notasAlunos[][] = new double[3][4];
        double soma = 0;
        double[] media = new double[3];

        for(int i = 0; i < notasAlunos.length; i++){
            for(int j = 0; j < notasAlunos[i].length; j++){
                notasAlunos[i][j] =     Double.parseDouble(JOptionPane.showInputDialog("Digite a nota " + (j + 1) + " do aluno " + (i + 1) + ":"));
                soma += notasAlunos[i][j];
            }
            media[i] = soma / notasAlunos[i].length;
            soma = 0;
        }
        String mensagem = "Notas dos alunos:\n";
        for (int i = 0; i < notasAlunos.length; i++) {
            mensagem += "Aluno " + (i + 1) + " - Notas: ";
            for (int j = 0; j < notasAlunos[i].length; j++) {
                mensagem += notasAlunos[i][j] + " ";
            }
            mensagem += "- Média: " + String.format("%.2f", media[i]) + "\n";
        }

        JOptionPane.showMessageDialog(null, mensagem);
    }


}

