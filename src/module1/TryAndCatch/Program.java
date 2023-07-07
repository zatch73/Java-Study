package TryAndCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number: ");
        try {
        Integer number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Not is number");
        }


    }
}
