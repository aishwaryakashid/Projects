/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Product.Product;
import Business.Person.Customer;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Praneet
 */
public class Order {
    
    private static int count = 0;
    private ArrayList<OrderItem> orderItemList;
    private int orderNumber;
    private Timestamp timeStamp;
    private Customer customer;

    

    
    public Timestamp getTimeStamp() {
        return timeStamp;
        
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public Order()
    {
        count++;
        orderItemList = new ArrayList<OrderItem>();
                orderNumber = count;
                customer = new Customer();
    }
    

     

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
    
    public void removeOrderItem(OrderItem orderItem)
    {
        orderItemList.remove(orderItem);
    
    }
    
    
    public OrderItem addOrderItem(Product product, int quantity, int price, Timestamp timestamp)
            
    {
        
        OrderItem orderItem = new OrderItem();
        orderItem.setProduct(product);
        orderItem.setQuantity(quantity);
        orderItem.setSalesPrice(price);
        orderItem.setTimeStamp(timestamp);
        orderItemList.add(orderItem);
        return orderItem;
    }

    @Override
    public String toString() {
        return  String.valueOf(orderNumber);
    }
    
}
