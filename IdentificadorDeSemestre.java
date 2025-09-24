public class IdentificadorDeSemestre {
    public static void main(String[] args) {
        int numeroDoMes = 8;

        switch (numeroDoMes) {
            case 1, 2, 3, 4, 5, 6:
                System.out.println("Primeiro semestre");
                break;
            case 7, 8, 9, 10, 11, 12:
                System.out.println("Segundo semestre");
                break;
            default:
                System.out.println("Mês inválido");
                break;
        }
    }
}
