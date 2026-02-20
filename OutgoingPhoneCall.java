/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ice.task.pkg3;

/**
 *
 * @author 27817
 */
public class OutgoingPhoneCall extends PhoneCall  {
     protected int minutes;

    public OutgoingPhoneCall(String phoneNumber, int minutes) {
        super(phoneNumber);
        this.minutes = minutes;
        setPrice(0.04 * minutes);
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
        System.out.println("Outgoing Phone Call Details:");
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Rate per Minute: " + 0.04);
        System.out.println("Minutes: " + minutes);
        System.out.println("Total Price: " + getPrice());
    }
    
}


