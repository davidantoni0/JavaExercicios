public class DivisaoComResto {
    public static void main(String[] args) {
        int totaldeItens = 17;
        int capacidadedaCaixa = 5;
        int numeroDeCaixas = totaldeItens / capacidadedaCaixa;
        int itensRestantes = totaldeItens % capacidadedaCaixa;
        System.out.println("Serão preenchidas " + numeroDeCaixas + " caixas.");
        System.out.println("Sobrarão " + itensRestantes + " itens.");
    }
}
