public class CalculadoraSalario {
    public static void main(String[] args) {
        String nome = "João";
        double salario = 1600.74;
        double desconto;

        if(salario <= 1751.81){
            desconto = salario * 0.08;

            System.out.println("O funcionário " + nome + " tem um salário de R$ " + salario + " e terá descontado " +desconto+ " da sua renda, ficando com um salário final de R$ " + (salario - desconto));
        }
        else if(salario >= 1751.82 && salario <= 2919.72){
            desconto = salario * 0.09;
            System.out.println("O funcionário " + nome + " tem um salário de R$ " + salario + " e terá descontado " +desconto+ " da sua renda, ficando com um salário final de R$ " + (salario - desconto));
        }
        else if(salario >= 2919.73 && salario <= 5839.45){
            desconto = salario * 0.10;
            System.out.println("O funcionário " + nome + " tem um salário de R$ " + salario + " e terá descontado " +desconto+ " da sua renda, ficando com um salário final de R$ " + (salario - desconto));
        }
        else{
            desconto = salario * 0.11;
            System.out.println("O funcionário " + nome + " tem um salário de R$ " + salario + " e terá descontado " +desconto+ " da sua renda, ficando com um salário final de R$ " + (salario - desconto));
        }
    }
}
