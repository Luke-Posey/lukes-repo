//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Truck lukesCar = new Truck("Dodge", "Ram", 1998);
        lukesCar.accelerate();
        lukesCar.honk();
        lukesCar.speed();
        lukesCar.accelerate();
        lukesCar.tow();
        System.out.printf("%s %d %s %s", "Luke's truck is a", lukesCar.year, lukesCar.make, lukesCar.model);
    }
}