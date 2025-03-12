public class Vehicle 
{
public void start()
{
System.out.println("Start from vehile");
}
}

class Car extends Vehicle
{
public void start()
{
System.out.println("start the car");
super.start();
}
}

class Bike extends Vehicle
{
public void start()
{
System.out.println("Start the bike");
super.start();
}
}
public class vehicle
{
public static void main(String args[])
{
Car C = new Car();
C.start();
Bike B = new Bike();
B.start();
}
}

