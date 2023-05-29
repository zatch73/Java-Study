package InterfaceJava.model.entities;
import InterfaceJava.model.entities.Contract;
import InterfaceJava.model.services.Payment;

public class Installment{
    private Contract contract;
    private Integer month;
    private Double installmentValue;


    public Installment(Contract contract, Double installmentValue, Integer month) {
        this.contract = contract;
        this.installmentValue = installmentValue;
    }
    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }


    public Double getInstallmentValue() {
        return installmentValue;
    }

    public void setInstallmentValue(Double installmentValue) {
        this.installmentValue = installmentValue;
    }

    public Integer getMonth() {
        return month;
    }


}
