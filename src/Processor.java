class Processor extends Computer implements Upgradable{
    private int cores;
    private double clockSpeed;
    private String architecture;

    // Конструктор класса
    public Processor(String brand, String model, int year, double price, boolean isLaptop,
                     int cores, double clockSpeed, String architecture) {
       // super(brand, model, year, price, isLaptop);
        this.cores = cores;
        this.clockSpeed = clockSpeed;
        this.architecture = architecture;
    }


    @Override
    public void displayInfo() {
        System.out.println("Processor: " + getBrand() + " " + getModel() +
                ", Cores: " + cores + ", Clock Speed: " + clockSpeed + " GHz");
    }
    // Аксессоры (геттеры) для дополнительных полей
    public int getCores() {
        return cores;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }

    public String getArchitecture() {
        return architecture;
   }
    @Override
    public void upgrade() {
        System.out.println("Processor upgraded!");
    }
}
