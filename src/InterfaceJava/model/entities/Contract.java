package InterfaceJava.model.entities;

import java.util.Date;

public class Contract {
    private Integer number;
    private Date contractDate;
    private Double value;

    public Contract(Integer number, Date contractDate, Double value) {
        this.number = number;
        this.contractDate = contractDate;
        this.value = value;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getContractDate() {
        return contractDate;
    }

    public void setContractDate(Date contractDate) {
        this.contractDate = contractDate;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
