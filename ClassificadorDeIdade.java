public class ClassificadorDeIdade {
    public static void main(String[] args) {
        int idade = 25;

        do {
            if (idade < 0) {
                System.out.println("Idade inválida");
            }
            else if(idade <= 12){
                System.out.println("Criança");
            }
            else if(idade >= 13 && idade <= 19){
                System.out.println("Adolescente");
            }
            else if(idade >= 20 && idade <= 59){
                System.out.println("Adulto");
            }
            else{
                System.out.println("Idoso");
            }
            
        } while (idade < 0);
    }
}
