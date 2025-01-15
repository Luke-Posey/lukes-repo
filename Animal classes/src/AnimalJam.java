import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AnimalJam {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        Dog dog1 = new Dog();
        Eagle eagle1 = new Eagle();
        Snake snake1 = new Snake();
        animals.add(dog1);
        animals.add(eagle1);
        animals.add(snake1);

        for (Animal animal : animals) {
            animal.eat();
            animal.makeSound();
            animal.move();

            if (animal instanceof Mammal){
                ((Dog) animal).growFur();
            }

            if (animal instanceof Snake){
                ((Reptile) animal).baskInSun();
            }
        }




    }
}