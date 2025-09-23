public class ConversordeMoeda {
    public static void main(String[] args) {
        double valorEmDolar = 50.0;
        double taxaDeCambio = 5.25; // Exemplo de taxa de câmbio
        double valorEmReal = converterDolarParaReal(valorEmDolar, taxaDeCambio);
        System.out.println("Valor em Real: " + valorEmReal);
    }
    public static double converterDolarParaReal(double valorEmDolar, double taxaDeCambio) {
        return valorEmDolar * taxaDeCambio;
    }
}
