public class IdentificadorDeSemestre {
    public static void main(String[] args) {
        int numeroDoMes = 8;

        System.out.println(numeroDoMes >= 1 && numeroDoMes <= 6 ? "Primeiro semestre" : 
                           numeroDoMes >= 7 && numeroDoMes <= 12 ? "Segundo semestre" : 
                           "Mês inválido");
    }
}
