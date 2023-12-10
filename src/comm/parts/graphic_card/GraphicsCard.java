package comm.parts.graphic_card;

import comm.Computer;

public class GraphicsCard extends Computer {
    private int vramGB;
    private int clockSpeed;
    private String architecture;
    public GraphicsCard(String brand, String model, int year, double price, boolean isLaptop,
                         double clockSpeed, String architecture,int vramGB) {
        super();
        //super(brand, model, year, price, isLaptop);
        this.architecture = architecture;
        this.clockSpeed = (int)clockSpeed;
        this.vramGB = vramGB;
    }

    public GraphicsCard() {
    }

    public int getvramGB() {return vramGB;}
    public int getclockSpeed() {
        return clockSpeed;
    }
    public String getArchitecture(){
        return architecture;
    }

    @Override
    public void displayInfo() {
System.out.println("graphics");
    }
    @Override
    public void upgrade() {
    }
}
