/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

/**
 *
 * @author Praneet
 */
public class ShippingPerson extends Person{
        static int count = 0;
  
   private String ID;

    public String getShipID() {
        return ID;
    }

    public void setShipID(String ID) {
        this.ID = ID;
    }
   
    
    public ShippingPerson()
    {
     
      
       StringBuffer buff = new StringBuffer();
       buff.append("Ship");
       buff.append(count++);
       ID = buff.toString();
       
    }

  

  @Override
    public String toString() {
        return ID;
    }
    
}
