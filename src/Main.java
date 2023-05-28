// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.startEngine();
        car.stopEngine();

        car.setBrand("Audi");
        car.setModel("Q8");


        System.out.println("Марка автомобиля: " + car.getBrand());
        System.out.println("Модель автомобиля: " + car.getModel());

    }
}