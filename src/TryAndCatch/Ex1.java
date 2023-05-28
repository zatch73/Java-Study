package TryAndCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        //Crie um programa Java que solicite ao usuário um número
        // inteiro e divida 10 por esse número. Lide com a exceção caso o número seja zero.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        try {
            int number = scanner.nextInt();
            number /= number;
            System.out.println(number);
        } catch (InputMismatchException e){
            System.out.println("error: "+e.getMessage());
        } catch (ArithmeticException e){
            System.out.println("error: " + e.getMessage());
        }

    }
}
