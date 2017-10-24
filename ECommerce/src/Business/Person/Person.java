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
public class Person {
    
    String firstName;
    String lastName;
    String emailID;
private String ID;
static   int count = 0;
public Person ()
{
    StringBuffer buff = new StringBuffer();
       buff.append("Person");
       buff.append(count++);
       ID = buff.toString();
}


    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        return ID;
    }
    
}
