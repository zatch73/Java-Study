package InterfaceJava.model.services;

import InterfaceJava.model.entities.Contract;

public class ProcessInstallment implements Payment{
    private Contract contract;
    private Integer numberInstallment;
    private Double[] list;

    public ProcessInstallment(Contract contract, Integer numberInstallment) {
        this.contract = contract;
        this.numberInstallment = numberInstallment;
    }
    @Override
    public Double pay(Double tax, Double simpleInterest) {
        tax /= 100;
        simpleInterest /= 100;
        list = new Double[numberInstallment];
        for(int i = 1; i <= numberInstallment; i++){
            double value = (( contract.getValue() / numberInstallment ) * simpleInterest * i ) + contract.getValue() / numberInstallment;
            value += (value * tax);
            list[i - 1] = value;
        }
        for (double a: list){
            System.out.println(a);
        }
        return null;
    }
}
