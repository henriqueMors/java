package enumeradores.aplicacao;

import java.sql.Date;

import enumeradores.entities.Order;
import enumeradores.entities_enums.OrderStatus;

public class Programa {
    public static void main(String[] args) {
        
        Order order = new Order(1080, new Date(0), OrderStatus.PENDING_PAYMENT);
    
        System.out.println(order);
    }
}
