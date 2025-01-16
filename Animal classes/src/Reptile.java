public class Reptile extends Animal {
    private boolean hungry;

    public boolean isHungry() {
        return hungry;
    }

    public void toggleHungry() {
        hungry = !hungry;
    }
    @Override
    public void makeSound() {
        System.out.println("Reptile hisses");
    }

    @Override
    public void move(){
        System.out.println("Reptile moves");
    }

    public void baskInSun(){
        System.out.println("Bask In Sun");
    }


}
