public class CalculadoraAreaRetangulo {
    public static void main(String[] args) {
        double largura = 5.0;
        double altura = 10.0;
        double area = calcularAreaRetangulo(largura, altura);
        System.out.println("A área do retângulo é: " + area);
    }

    public static double calcularAreaRetangulo(double largura, double altura) {
        return largura * altura;
    }
}
