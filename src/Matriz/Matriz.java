package Matriz;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
public class Matriz {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Input the length of Matriz: ");
        int value = reader.nextInt();
        int[][] array = new int[value][value];
        int negativesNumbers = 0;
        int[] mainDiagonal = new int[value];
        for(int i = 0; i < value; i++){
            for(int j = 0; j < value; j++){
                Random randomValue = new Random();
                array[i][j] = randomValue.nextInt(-17, 20);
                if(array[i][j] < 0){
                    negativesNumbers++;
                }

                if(i == j){
                    mainDiagonal[i] = array[i][j];
                }
            }
        } for(int i = 0; i < value; i++){
            for(int j = 0; j < value; j++){
                System.out.print(array[i][j] + " | ");
            }
            System.out.println(" ");
        }

        System.out.println("Main Diagonal: ");
        for(int mainValue: mainDiagonal){
            System.out.print(mainValue+", ");
        }
        System.out.println("Negative numbers = "+negativesNumbers);
    }
}
