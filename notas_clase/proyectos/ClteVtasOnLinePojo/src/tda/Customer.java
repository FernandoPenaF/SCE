/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tda;

/**
 *
 * @author sdist
 */
public class Customer 
{
   private String CustomerID = null;

    public String getCustomerID() {
        return CustomerID;
    }

    public String getCountry() {
        return Country;
    }
   private String Country    = null;

   Customer( String unCustomerID, String unCountry )
   {
       this.CustomerID = unCustomerID;
       this.Country    = unCountry;
   }
   
   
 
   @Override
   public String toString()
   {
        StringBuffer sb = new StringBuffer("Cliente: ").append(CustomerID).append(", Pais:").append(Country);
	   return new String(sb);
   }
   
}
