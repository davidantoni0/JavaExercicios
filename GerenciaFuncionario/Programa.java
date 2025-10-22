package GerenciaFuncionario;
import javax.swing.JOptionPane;

public class Programa {
    public static void main(String[] args) {
        //Usando JOptionPane para exibir os resultados
        JOptionPane.showMessageDialog(null, "Gerenciamento de Funcionários");
        // Declare the variable without calling an undefined constructor
        Funcionario funcionario = null;
        String nome = JOptionPane.showInputDialog("Digite o nome do funcionário:");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário:"));
        funcionario = new Funcionario(nome, salario);
        double inss = CalcularInss.calcularInss(funcionario);
        double valeTransporte = CalcularValeTransporte.calcularValeTransporte(funcionario);
        String resultado = "Funcionário: " + funcionario.getNome() + "\n" +
                            "Salário: R$ " + String.format("%.2f", funcionario.getSalario()) + "\n" +
                            "INSS: R$ " + String.format("%.2f", inss) + "\n" +
                            "Vale Transporte: R$ " + String.format("%.2f", valeTransporte) + "\n" +
                            "Salário Líquido: R$ " + String.format("%.2f", (funcionario.getSalario() - inss - valeTransporte));
        JOptionPane.showMessageDialog(null, resultado);
        
        
    }
    
}
