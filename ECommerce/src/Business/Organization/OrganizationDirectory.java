/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author Praneet
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;
    
    public OrganizationDirectory()
    {
        organizationList = new ArrayList<Organization>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }
    
    public Organization createOrganization(Organization.Type type)
    {
        Organization organization = null;
        
        if(type.getValue().equals((Organization.Type.Supplier.getValue())))
        {
                    organization = new SupplierOrganization() {};
organizationList.add(organization);
        }
if(type.getValue().equals((Organization.Type.Customer.getValue())))
{
     organization = new CustomerOrganization() {};
organizationList.add(organization);
}

if(type.getValue().equals((Organization.Type.Shipping.getValue())))
{
     organization = new ShippingOrganization() {};
organizationList.add(organization);
}
if(type.getValue().equals((Organization.Type.Sales.getValue())))
{
     organization = new SalesOrganization() {};
organizationList.add(organization);
}
return organization;
        
        
    }
}
