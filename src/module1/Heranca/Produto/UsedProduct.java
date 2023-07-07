package Heranca.Produto;
import java.util.Date;
public final class UsedProduct extends Product{
    private Date manufactureDate;

    public String priceTag(){
        return "name: "+ this.name+
                ",price: "+this.price+
                ", (Manufacture date)"+this.manufactureDate;
    }
}
