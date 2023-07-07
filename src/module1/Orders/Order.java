package Orders;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date momment;
    private OrderStatus orderStatus;
    private List<OrderItem> listOrders = new ArrayList<>();
    private Client client;

    private void addItem(OrderItem item){
        this.listOrders.add(item);
    }
    private void removeItem(OrderItem item){
        this.listOrders.remove(item);
    }

}
