public abstract class Animal {
//    public String name;
//    public int age;
//    public Animal(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public Animal() {
//        this.name = "Animal";
//        this.age = 0;
//    }

    public abstract void makeSound();

    public abstract void move();

    public void eat() {
        System.out.println("eating");
    }
}
