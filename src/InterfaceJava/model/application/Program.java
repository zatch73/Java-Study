package InterfaceJava.model.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import InterfaceJava.model.entities.Contract;
import InterfaceJava.model.entities.Installment;
import InterfaceJava.model.services.ProcessInstallment;

public class Program {
    public static void main(String[] args) {

        Scanner rd = new Scanner(System.in);
        System.out.println("How many contracts? ");
        int contractCount = rd.nextInt();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter number for contract: ");
        int number = rd.nextInt();
        System.out.println("Enter date dd/MM/yyyy: ");
        String date = rd.next();
        try {
            Date dateFormatted = formatter.parse(date);
            System.out.println("Enter value of contract: ");
            double value = rd.nextDouble();
            Contract contract = new Contract(number, dateFormatted, value);
            System.out.println("Enter numbers intallment: ");
            int installments = rd.nextInt();
            ProcessInstallment process = new ProcessInstallment(contract, installments);
            process.pay(2.0, 1.0);
        } catch (ParseException e) {
            System.out.println("ERROR: "+e.getMessage());
        }
    }
}
