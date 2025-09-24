public class VerificadorDiaDaSemana {
    public static void main(String[] args) {
        int diaDaSemana = 4;

        switch (diaDaSemana) {
            case 2, 3, 4, 5, 6:
                System.out.println("Dia útil");
                break;
            case 1, 7:
                System.out.println("Final de semana");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
    }
}
