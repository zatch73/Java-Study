package generics.test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Fruta> frutas = new ArrayList<Fruta>();
        frutas.add(new Laranja("Lanraja Cristal"));
        frutas.add(new Laranja("Lanraja Prata"));
        frutas.add(new Laranja("Lanraja Ouro"));
        frutas.add(new Goiaba("Goibada Ouro"));
        listar(frutas);

        List<Goiaba> listar = Arrays.asList(new Goiaba("DOURADA"), new Goiaba("VERDE"));
        listar(listar);
    }

    public static void listar(List<? extends Fruta> frutas) {
        for (Fruta frutasFOR : frutas) {
            frutasFOR.barulho();
        }
    }
}
