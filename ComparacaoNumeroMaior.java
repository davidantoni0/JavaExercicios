public class ComparacaoNumeroMaior {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;

        if (numero1 > numero2) {
            System.out.println("O número maior é: " + numero1);
        } else if (numero1 < numero2) {
            System.out.println("O número maior é: " + numero2);
        } else {
            System.out.println("Os números são iguais.");
        }
    }
}