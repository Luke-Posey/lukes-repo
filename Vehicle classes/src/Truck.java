public class Truck extends Car {

    public Truck(String make, String model, int year) {
        super(make, model, year);
    }

    public void tow(){
        System.out.println("Truck towing");
    };

    @Override
    public void speed(){
        System.out.println("It's too slow...");
    }
}
