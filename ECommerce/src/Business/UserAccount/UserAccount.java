/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Person.Person;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;
import sun.security.util.Password;

/**
 *
 * @author Praneet
 */
public class UserAccount {
    
  

    private String username;
    private String password;
    Role role;
    String status;
    Person person;
    private WorkQueue workQueue;

    public UserAccount() {
        workQueue = new WorkQueue();
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    
    
    public String getUsername() {
       
        return username;
        
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    @Override
    public String toString() {
        return  username ;
    
    }
}
