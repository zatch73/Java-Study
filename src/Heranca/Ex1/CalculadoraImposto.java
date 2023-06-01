package Heranca.Ex1;

public class CalculadoraImposto {
    public static double impostoProduto(Produto produto){
        System.out.println("iniciando os cálculos do imposto:");
        System.out.println("VALOR COM IMPOSTO: ");
        if(produto instanceof Keyboard){
            Keyboard keyboard = (Keyboard) produto;
            System.out.println(keyboard.getHeight());
        }
        return produto.calcularPrecoEstoque() - produto.calcularTaxaEstoque();
    }
}
