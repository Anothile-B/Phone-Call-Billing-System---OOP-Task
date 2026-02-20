Phone Call Billing System - Java OOP Project


Project Description
-This project demonstrates inheritance, abstraction, and polymorphism in Java through a phone call billing system:
-PhoneCall is an abstract superclass representing any phone call.
-IncomingPhoneCall and OutgoingPhoneCall are subclasses that inherit from PhoneCall.
-Each subclass implements its own behavior for displaying call details and calculating pricing.
-The project highlights how abstract classes enforce structure, and how subclasses extend or customize behavior.

Classes Overview
1️. PhoneCall (Abstract Class)
-The PhoneCall class defines a generic phone call:

Attributes:
phoneNumber (String) – The number called or received from
price (double) – Cost of the phone call

Methods:
setPrice(double) – Sets the price of the call
getPhoneNumber() – Abstract method, implemented in subclasses
getPrice() – Abstract method, implemented in subclasses
display() – Abstract method, implemented in subclasses
Purpose:
Provides a template for all types of phone calls
Ensures subclasses implement key methods


2️. IncomingPhoneCall (Subclass)

-Represents a phone call received by the user.

Behaviour:
-Sets a fixed price per incoming call (0.02)
-Overrides abstract methods from PhoneCall

Example Usage:

IncomingPhoneCall call = new IncomingPhoneCall("0123456789");
call.display();


Sample Output:

Incoming Phone Call Details:
Phone Number: 0123456789
Rate per Call: 0.02
Price of Call: 0.02


3️. OutgoingPhoneCall (Subclass)
-Represents a phone call made by the user.

Behaviour:
-Accepts minutes as an argument
-Calculates price as 0.04 * minutes
-Overrides abstract methods from PhoneCall
-Displays full details of the outgoing call

Example Usage:

OutgoingPhoneCall call = new OutgoingPhoneCall("0123456789", 10);
call.display();


Sample Output:

Outgoing Phone Call Details:
Phone Number: 0123456789
Rate per Minute: 0.04
Minutes: 10
Total Price: 0.4


Key Concepts Demonstrated
-Abstraction: PhoneCall defines a contract for subclasses
-Inheritance: IncomingPhoneCall and OutgoingPhoneCall inherit common attributes
-Polymorphism: Each subclass implements its own display() and getPrice()
-Encapsulation: Attributes are protected and accessed via getters/setters



Usage
-Create a Java project in an IDE like NetBeans 
-Create separate .java files for each class:
 PhoneCall.java
 IncomingPhoneCall.java
 OutgoingPhoneCall.java
-Instantiate calls in a Main class and call display() to show details.
-Compile and run the project to see billing output for incoming and outgoing calls.

