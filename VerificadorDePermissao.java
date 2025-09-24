public class VerificadorDePermissao {
    public static void main(String[] args) {
        double altura = 1.50;
        boolean estaAcompanhado = false;

        if (altura >= 1.60 || estaAcompanhado) {
                System.out.println("Acesso permitido.");
        } else {
            System.out.println("Acesso negado.");
        }
    }
}

