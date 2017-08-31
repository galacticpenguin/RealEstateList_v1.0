/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realestatelist;

/*
* Ian Medina
* icm27@drexel.edu
* CS338:GUI, Assignment #1
*
*/

public class House {
    
    private String Address;
    private String City;
    private String numBeds;
    private String numBaths;
    private String sqFeet;
    private String Year;
    private String Price;
   
    
    
    void setAddress(String address) {
        Address = address;
    }
    
    void setCity(String city) {
        City = city;
    }
    
    void setNumBeds(String beds) {
        numBeds = beds;
    }
    
    void setNumBaths(String baths) {
        numBaths = baths;
    }
    
    void setSqFeet(String squareFeet) {
        sqFeet = squareFeet;
    }
    
    void setYear(String year) {
        Year = year;
    }
    
    void setPrice(String price) {
        Price = price;
    }
    
    String getAddress() {
        return Address;
    }
    
    String getCity() {
        return City;
    }
    
    String getNumBeds() {
        return numBeds;
    }
    
    String getNumBaths() {
        return numBaths;
    }
    
    String getSqFeet() {
        return sqFeet;
    }
    
    String getYear() {
        return Year;
    }
    
    String getPrice() {
        return Price;
    }
    
}
