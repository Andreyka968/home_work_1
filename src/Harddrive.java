public class Harddrive extends Computer{
   private String type;
    private int capacityGB;
    private int rpm;
    private String formFactor;
    private boolean isSSD;

    public Harddrive(String brand, String model, int year, double price, boolean isLaptop,
                     String type,int capacityGB,int rpm,String formFactor,boolean isSSD){
        super(brand, model, year, price, isLaptop);
        this.type = type;
        this.capacityGB = capacityGB;
        this.rpm = rpm;
    }
    public String gettype(){
        return type;
    }
    public int getcapacityGB(){
        return capacityGB;
    }
    public int getrpm(){
        return rpm;
    }
    public String grt_formFactor(){
        return formFactor;
    }
    public boolean get_isSSD(){
        return isSSD;
    }
}
