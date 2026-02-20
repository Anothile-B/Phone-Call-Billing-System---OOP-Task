/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ice.task.pkg3;

/**
 *
 * @author 27817
 */
public abstract class PhoneCall {
     // create data types
    protected String phoneNumber;
    protected double price;
    
    public PhoneCall(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.price = 0.0;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract String getPhoneNumber();

    public abstract double getPrice();

    public abstract void display(); 
}


