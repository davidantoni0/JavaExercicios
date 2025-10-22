package Encapsulamento.Icms;

public class Produto {
    private String descricao;
    private double valor;
    private double quantidade;    

    public Produto(String descricao, double valor, double quantidade) {
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;
    }    
    public String getDescricao() {
        return descricao;
    }    
    public double getValor() {
        return valor;
    }    
    public double getQuantidade() {
        return quantidade;
    }
    void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
    void setValor(double valor) {
        this.valor = valor;
    }

}
