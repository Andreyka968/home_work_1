package comm;

public class ComputerBuilder {
    private String brand;
    private String model;
    private int year;
    private double price;
    private boolean isLaptop;

    public ComputerBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }
    public ComputerBuilder setModel(String model) {
        this.model = model;
        return this;
    }
    public ComputerBuilder setYear(int year) {
        this.year = year;
        return this;
    }
    public ComputerBuilder setPrice(double price) {
        this.price = price;
        return this;
    }
    public ComputerBuilder setIsLaptop(boolean isLaptop) {
        this.isLaptop = isLaptop;
        return this;
    }
    public Computer createComputer() {
        return new Computer(brand, model, year, price, isLaptop) {
            @Override
            public void displayInfo() {
            }

            @Override
            public void upgrade() {

            }
        };}
    public String displayInfo1 (){
        StringBuilder df = new StringBuilder();
        df.append("Computer{");
        df.append("brand \"").append(brand).append("\"");
        df.append(";  ").append("year").append(" ").append(year);
        df.append(";  isLaptop ").append(isLaptop);
        df.append(";  model   ").append(model);
        df.append(";  price  ").append(price);
        df.append("}");
        return df.toString();
    }
}