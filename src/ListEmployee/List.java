package ListaTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ListaTest.Employee;
public class Lista {
    public static void main(String[] args) {

        List<Employee> lista = new ArrayList<>();
        Scanner reader = new Scanner(System.in);
        System.out.print("How many employees will be registered? ");
        int numbers = reader.nextInt();
        for(int i = 0; i < numbers; i++){
            System.out.println("NAME: ");
            String name = reader.next();
            System.out.println("ID: ");
            Integer id = reader.nextInt();
            System.out.println("SAlARY: ");
            Float salary = reader.nextFloat();
            Employee employee = new Employee(id, name, salary);
            lista.add(employee);
        }
        System.out.println("Enter the employee id that will have salary increase: ");
        int id = reader.nextInt();

        for (Employee valor: lista){
            if(valor.getId() == id){
                System.out.println("Enter the porcentage: ");
                float porcentage = reader.nextFloat();
                valor.readJustment(porcentage);
            }
        }

        for (Employee valor: lista){
            System.out.println(valor.show());
        }




    }

}
