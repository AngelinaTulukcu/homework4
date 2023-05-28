public class Car {
    private String brand;
    private String model;

    public void startEngine() {
        System.out.println("Двигатель автомобиля запущен.");
    }

    public void stopEngine() {
        System.out.println("Двигатель автомобиля остановлен.");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

}