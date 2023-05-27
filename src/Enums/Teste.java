package Enums;

import java.util.Date;

public class Teste {
    public static void main(String[] args) {
        Order order = new Order(400, new Date(), OrderStatus.PAGAMENTO_PENDENTE);
        System.out.println(order);
    }
}
