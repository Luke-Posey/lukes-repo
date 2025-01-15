public class Mammal extends Animal {
    @Override

    public void makeSound() {
        System.out.println("Mammal Makes Sound");
    }
    @Override

    public void move(){
        System.out.println("Mammal Moves");
    }

    public void growFur(){
        System.out.println("Mammal Grows Fur");
    }

}
