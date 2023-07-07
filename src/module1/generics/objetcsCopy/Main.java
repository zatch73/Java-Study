package generics.objetcsCopy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> myListInteger = Arrays.asList(1 , 3, 4, 10);
        List<Double> myListDouble = Arrays.asList(0.4 , 3.4, 5.10);
        List<Object> myObjects = new ArrayList<>();
        copyList(myListInteger, myObjects);
        showList(myObjects);
        copyList(myListDouble, myObjects);
        showList(myObjects);
    }

    public static void copyList(List<? extends Number> list1, List<? super Number> list2){
        for(Number n : list1){
            list2.add(n);
        }
    }
    public static void showList(List<? extends Object> list){
        for(Object o : list){
            System.out.print(o + " ");
        }
        System.out.println("\n ---");
    }
}
