package Heranca.Ex1;

public abstract class Produto implements Taxavel{
    public static final double IMPOSTO = 1;
    protected String nome;
    protected Double preco;
    protected int quantidade;

    public Produto(String nome, Double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularPrecoEstoque(){
        return this.preco * this.quantidade;
    };

    @Override
    public double calcularTaxaEstoque() {
        return this.calcularPrecoEstoque() * IMPOSTO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


}
