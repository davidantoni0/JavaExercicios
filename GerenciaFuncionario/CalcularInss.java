package GerenciaFuncionario;

public class CalcularInss {
    public static double calcularInss(Funcionario funcionario) {
        double salario = funcionario.getSalario();
        double inss;

        if (salario <= 1518.00) {
            inss = salario * 0.075;
        } else if (salario <= 2793.88) {
            inss = salario * 0.09;
        } else if (salario <= 4190.83) {
            inss = salario * 0.11;
        } else if (salario <= 8157.41) {
            inss = salario * 0.14;
        } else {
            inss = 8157.41 * 0.14;
        }

        return inss;

    }
    
}
