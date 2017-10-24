/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Person.Person;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Praneet
 */
public class UserAccountDirectory {
    
     ArrayList<UserAccount> userAccountList;

    
     public UserAccountDirectory()
    {
        userAccountList = new ArrayList<UserAccount>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public void setUserAccountList(ArrayList<UserAccount> userAccountList) {
        this.userAccountList = userAccountList;
    }
    
    
     public UserAccount authenticate(String userName, String password)
    {
        for(UserAccount userAccount : userAccountList)
        {
            if(userAccount.getUsername().equals(userName) && userAccount.getPassword().equals(password))
            {
                return userAccount;
            }
            
        }
        return null;
    }
   
    public UserAccount createUserAccount(String username, String password, Person p, Role role, String status){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setPerson(p);
        userAccount.setRole(role);
        userAccount.setStatus(status);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
}
