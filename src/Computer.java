public abstract class Computer implements DisplayAble,Upgradable{
    private String brand;
    private String model;
    private int year;
    private double price;
    private boolean isLaptop;

    public Computer() {
    }

    // Абстрактный метод, который должны реализовать подклассы
    public abstract void displayInfo();
    public abstract void upgrade();

    // Конструктор класса
    public void Computer(String brand, String model, int year, double price, boolean isLaptop) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.isLaptop = isLaptop;
    }
    public void Computor(String brand, String model, int year, double price, boolean isLaptop) {
    }
    public void setBrand(String brand) {
        this.brand = brand;
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
