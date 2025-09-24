public class CalculadoraSalario {
    public static void main(String[] args) {
        String nome = "João";
        double salario = 2500.00;

        if(salario <= 1751.81){
            System.out.println("O funcionário " + nome + " tem um salário de R$ " + salario + " e terá descontado 8% da sua renda.");
        }
        else if(salario >= 1751.82 && salario <= 2919.72){
            System.out.println("O funcionário " + nome + " tem um salário de R$ " + salario + " e terá descontado 9% da sua renda.");
        }
        else if(salario >= 2919.73 && salario <= 5839.45){
            System.out.println("O funcionário " + nome + " tem um salário de R$ " + salario + " e terá descontado 10% da sua renda.");
        }
        else{
            System.out.println("O funcionário " + nome + " tem um salário de R$ " + salario + " e terá descontado 11% da sua renda.");
        }
    }
}
