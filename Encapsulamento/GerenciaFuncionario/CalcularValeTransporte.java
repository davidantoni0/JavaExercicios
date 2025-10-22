package Encapsulamento.GerenciaFuncionario;

public class CalcularValeTransporte {
    public static double calcularValeTransporte(Funcionario funcionario) {
        double salario = funcionario.getSalario();
        double valeTransporte = salario * 0.06;
        return valeTransporte;
    }
    
}
