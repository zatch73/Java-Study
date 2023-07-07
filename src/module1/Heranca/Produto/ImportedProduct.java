package Heranca.Produto;

public final class ImportedProduct extends Product{
    private Double customsFree;
    @Override
    public String priceTag(){
        return "PRICE: "+totalPrice()+", Name: "+this.name + ", customs free: "+this.customsFree;
    }

    public Double totalPrice(){
        return price + customsFree;
    }
}
