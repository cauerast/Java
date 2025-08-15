package studies.FLX.Main.ObjectOrientedPrograming.Inheritance;

public class Main {
    public static void main(String[] args) {
        // Inheritance = One class inherits the attributes and methods from another class
        // Child <- Parent <- grandparents // using extends keyword

        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        Plant plant1 = new Plant();

        System.out.println(dog1.isAlive);
        System.out.println(cat1.isAlive);
        System.out.println(plant1.isAlive);

        dog1.eat();
        cat1.eat();
        plant1.photosynthesize();

        System.out.println(dog1.lives);
        System.out.println(cat1.lives);

        dog1.speak();
        cat1.speak();


    }
}
