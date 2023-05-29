package TryAndCatch;

public class Calculadora {
    public static Double dividir(Integer a, Integer b) {
        try {
            return (double) a / b;
        }
        catch (ArithmeticException error){
            System.out.println("error: "+ error.getMessage());
        }
        return null;
    }
}
