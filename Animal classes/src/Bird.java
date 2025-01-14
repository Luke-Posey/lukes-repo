public class Bird extends Animal {
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
