 /*Write a Java program to create a class called Vehicle with a method called drive(). 
 Create a subclass called Car that overrides the drive() method to print "Repairing a car".*/

class Vehicle
{
    public void drive()
    {
        System.out.println("Repairing a Vehicle.");
    }
} 

class Car extends Vehicle
{
    public void drive()
    {
            System.out.println("Repairing a car.023");
    }
} 

class Inheritence
 {
    public static void main(String A[])
    {
        Vehicle vobj = new Vehicle();
        
        Car cobj = new Car();

        vobj.drive();

        cobj.drive();
    }
 }
