public class DivisaoComResto {
    public static void main(String[] args) {
        int totaldeItens = 17;
        int capacidadedaCaixa = 5;
        int numeroDeCaixas = calcularNumeroDeCaixas(totaldeItens, capacidadedaCaixa);
        int itensRestantes = calcularItensRestantes(totaldeItens, capacidadedaCaixa);
        System.out.println("Serão preenchidas " + numeroDeCaixas + " caixas.");
        System.out.println("Sobrarão " + itensRestantes + " itens.");
    }
    public static int calcularNumeroDeCaixas(int totaldeItens, int capacidadedaCaixa) {
        return totaldeItens / capacidadedaCaixa;
    }
    public static int calcularItensRestantes(int totaldeItens, int capacidadedaCaixa) {
        return totaldeItens % capacidadedaCaixa;
    }
}
