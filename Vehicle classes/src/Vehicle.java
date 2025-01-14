public class Vehicle {

    public String make;
    public String model;
    public int year;
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void honk(){
        System.out.println("Honking");
    }

    public void accelerate(){
        System.out.println("Accelerating");
    }

    public void brake(){
        System.out.println("Braking");
    }

    public void steer(){
        System.out.println("Steering");
    }



}
