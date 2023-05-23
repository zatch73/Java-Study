package ListEmployee;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {

        java.util.List<Employee> lista = new ArrayList<>();
        Scanner reader = new Scanner(System.in);
        System.out.print("How many employees will be registered? ");
        int numbers = reader.nextInt();
        for(int i = 1; i <= numbers; i++){
            System.out.println("Id: ");
            Integer id = reader.nextInt();
            System.out.println("Employoee #"+i+":");
            System.out.println("Name: ");
            String name = reader.next();
            System.out.println("Salary: ");
            Float salary = reader.nextFloat();
            Employee employee = new Employee(id, name, salary);
            lista.add(employee);
            System.out.println(" ");
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
        System.out.println("List of employees");
        for (Employee valor: lista){
            System.out.println(valor.show());
        }




    }

}
