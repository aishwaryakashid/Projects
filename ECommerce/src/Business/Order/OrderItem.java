/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Product.Product;
import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author Praneet
 */
public class OrderItem {
    private Product product;
    private int quantity;
    private int salesPrice;
    
       Date date = new Date();
    Timestamp timeStamp = new Timestamp(date.getTime());

    public Timestamp getTimeStamp() {
        return timeStamp;
    }
    
   
    
    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }
    
    public OrderItem()
    {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(int salesPrice) {
        this.salesPrice = salesPrice;
    }
    
    
    @Override
    public String toString()
    {
        return product.getProdName();
    }
    
         
}
