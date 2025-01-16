public class Bird extends Animal {

    private int speed;

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void addSpeed(int value) {
        speed += value;
    }
    public void subSpeed(int value) {
        speed -= value;
    }

    @Override
    public void makeSound() {
        System.out.println("bird chirps");
    }

    @Override
    public void move(){
        System.out.println("bird moves");
    }

    public void layEgg(){
        System.out.println("lay eggs");
    }
}
