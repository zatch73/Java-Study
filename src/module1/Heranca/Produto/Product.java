package Heranca.Produto;

public class Product {
    protected String name;
    protected Double price;

    public Product(){}
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    public String priceTag(){
        return "Name: "+this.name+
                ", Price: "+this.price;
    }
}
