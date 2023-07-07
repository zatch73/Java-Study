package Orders;

import java.text.SimpleDateFormat;

public class OrderItem {
    private Product product;
    private Integer quantity;
    private Double price;

    public OrderItem(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
        this.price = product.getPrice();
    }

    public Double subTotal(){
        return this.quantity*this.price;
    }
}
