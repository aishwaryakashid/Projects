/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Person;

import Business.Product.ProductCatalog;


/**
 *
 * @author Praneet
 */
public class Supplier extends Person{
    
 static   int count = 0;
    String supplierID;
    private ProductCatalog productCatalog;
    
    public Supplier() {
        productCatalog = new ProductCatalog();
        StringBuffer buff = new StringBuffer();
       buff.append("Supl");
       buff.append(count++);
       supplierID = buff.toString();
    }

    public String getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(String supplierID) {
        this.supplierID = supplierID;
    }

   

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }
    
    @Override
    public String toString() {
        return supplierID;
    }
    
}
