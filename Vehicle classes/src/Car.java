public class Car extends Vehicle{

    public Car(String make, String model, int year){
        super(make, model, year);

    }
    public void speed(){
        System.out.println("Speeding");
        accelerate();
        accelerate();
        accelerate();
        System.out.println("WERE GETTING PULLED OVER");
        stop();
    }
    public void stop(){
        System.out.println("Stopping");
        brake();
        brake();
        brake();
        System.out.println("Stopped");
    }

}
