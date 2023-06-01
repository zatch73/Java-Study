package Heranca.Ex1.test;

import Heranca.Ex1.CalculadoraImposto;
import Heranca.Ex1.Keyboard;
import Heranca.Ex1.Produto;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto keyboard = new Keyboard("K617", 100.0, 10, 30.0);
        System.out.println(CalculadoraImposto.impostoProduto(keyboard));
    }
}
