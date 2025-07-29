package studies.FLX.Fundamentos;

public class OOP {
    public static void main(String[] args) {
        Car myCar1 = new Car("Mercedes"); // method Car (Object do tipo Car) com parameter "Mercedes", .
        Car myCar2 = new Car("bmw");
        Car myCar3 = new Car("nissan");

        myCar1.acceleration();
        myCar2.acceleration();
        myCar3.acceleration();

    }
}

class Car {
    String model; //atributo

    public Car(String model){ // method que aguarda um paramater
        this.model = model;
    }

    public void acceleration(){ // method acceleration()
        System.out.println("Speeding up the " + this.model);
    }
}
