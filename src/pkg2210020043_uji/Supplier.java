/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2210020043_uji;

/**
 *
 * @author LENOVO
 */
public class Supplier {
    
    private String supplierId;
    private String companyName;
    private String contactInfo;

    // Constructor
    public Supplier(String supplierId, String companyName, String contactInfo) {
        this.supplierId = supplierId;
        this.companyName = companyName;
        this.contactInfo = contactInfo;
    }

    // Getters and Setters
    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    // Method to display supplier information
    public void displaySupplierInfo() {
        System.out.println("Supplier ID: " + supplierId);
        System.out.println("Company Name: " + companyName);
        System.out.println("Contact Info: " + contactInfo);
    }
}
