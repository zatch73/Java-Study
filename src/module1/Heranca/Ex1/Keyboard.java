package Heranca.Ex1;

public class Keyboard extends Produto{
    public static final double IMPOSTO = 0.15;
    private Double height;

    public Keyboard(String nome, double preco, int quantidade, double height) {
        super(nome, preco, quantidade);
        this.height = height;
    }

    public Double getHeight() {
        return height;
    }

    @Override
    public double calcularTaxaEstoque() {
        return this.calcularPrecoEstoque() * IMPOSTO;
    }


}
