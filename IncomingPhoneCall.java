/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ice.task.pkg3;

/**
 *
 * @author 27817
 */
public class IncomingPhoneCall extends PhoneCall {
    
     public IncomingPhoneCall(String phoneNumber) {
        super(phoneNumber);
        setPrice(0.02);
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void display() {
        System.out.println("Incoming Phone Call Details:");
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Rate per Call: " + getPrice());
        System.out.println("Price of Call: " + getPrice());
    }
}


