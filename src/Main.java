public class Main {
    public static void main(String[] args) {
        Sedan car = new Sedan("Mersedes", "grey", 220);
        Sedan sedan = new Sedan("BMV", "black", 250);
        Minivan minivan = new Minivan("Honda-Odyssey", "white", 280);
        Car[] cars = {(Car) car, (Car) sedan, (Car) minivan};
        for (Car c : cars) {
            c.brake();
            c.gas();
        }
    }
}