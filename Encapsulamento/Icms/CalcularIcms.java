package Encapsulamento.Icms;

public class CalcularIcms {
    public static double calcularIcms(Produto produto) {
        double valorTotal = produto.getValor() * produto.getQuantidade();
        double icms = valorTotal * 0.12;
        return icms;
    }
    
}
