package Matriz;
import java.util.Random;
import java.util.Scanner;
public class Matriz_2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter N value: ");
        Integer n = reader.nextInt();
        System.out.print("Enter M value: ");
        Integer m = reader.nextInt();

        Integer[][] array = new Integer[n][m];
        for (int i=0; i < n; i++){
            for(int j=0;j < m; j++){
                Random randomValue = new Random();
                array[i][j] = randomValue.nextInt(-20, 20);
            }
        }
        System.out.println("ARRAY VALUES");
        for (int i=0; i < m; i++){
            for(int j=0;j < n; j++){
                System.out.print(array[j][i] + " ");
            }
            System.out.println(" ");
        }

        System.out.print("Enter number search: ");
        Integer value = reader.nextInt();

        for (int i=0; i < n; i++){
            for(int j=0;j < m; j++){
                if(array[i][j] == value){
                    System.out.println("Position: Column = "+i+", Line = "+j);
                    if(j > 0){
                        System.out.println("Top = " + array[i][j - 1]);
                    }
                    if(i > 0){
                        System.out.println("Left = " + array[i - 1][j]);
                    }
                    if(j + 1 < m){
                        System.out.println("Bottom = " + array[i][j + 1]);
                    }
                    if(i + 1 < n){
                        System.out.println("Right = " + array[i + 1][j]);
                    }
                }
            }
        }


    }
}
