package com.comm.parts.graphic_card;

public class GraphicsCardBuilder {
    private String brand;
    private String model;
    private int year;
    private double price;
    private boolean isLaptop;
    private double clockSpeed;
    private String architecture;
    private int vramGB;

    public GraphicsCardBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public GraphicsCardBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public GraphicsCardBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    public GraphicsCardBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public GraphicsCardBuilder setIsLaptop(boolean isLaptop) {
        this.isLaptop = isLaptop;
        return this;
    }

    public GraphicsCardBuilder setClockSpeed(double clockSpeed) {
        this.clockSpeed = clockSpeed;
        return this;
    }

    public GraphicsCardBuilder setArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    public GraphicsCardBuilder setVramGB(int vramGB) {
        this.vramGB = vramGB;
        return this;
    }
    // Метод, заполняющий поля объекта Car и возвращающий этот объект
    public GraphicsCardBuilder build() {
        GraphicsCardBuilder.this.brand = this.brand;
        GraphicsCardBuilder.this.model = this.model;
        GraphicsCardBuilder.this.year = this.year;
        GraphicsCardBuilder.this.price = price;
        return GraphicsCardBuilder.this;
    }

    public GraphicsCard createGraphicsCard() {
        return new GraphicsCard(brand, model, year, price, isLaptop, clockSpeed, architecture, vramGB);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("(StringBuffer)  GraphicsCardBuilder{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", year=").append(year);
        sb.append(", price=").append(price);
        sb.append(", isLaptop=").append(isLaptop);
        sb.append(", clockSpeed=").append(clockSpeed);
        sb.append(", architecture='").append(architecture).append('\'');
        sb.append(", vramGB=").append(vramGB);
        sb.append('}');
        return sb.toString();
    }
}