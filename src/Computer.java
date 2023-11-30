public class Computer {
    private String brand;
    private String model;
    private int year;
    private double price;
    private boolean isLaptop;

    // Конструктор класса
    public Computer(String brand, String model, int year, double price, boolean isLaptop) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.isLaptop = isLaptop;
    }

    // Аксессоры (геттеры)
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public boolean isLaptop() {
        return isLaptop;
    }
}
