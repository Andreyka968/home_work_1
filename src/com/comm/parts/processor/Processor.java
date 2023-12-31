package com.comm.parts.processor;

import com.comm.Computer;
import com.comm.features.Upgradable;

import java.util.StringJoiner;

public class Processor extends Computer implements Upgradable {
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
        System.out.println("com.comm.parts.processor.Processor: " + getBrand() + " " + getModel() +
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
        System.out.println("com.comm.parts.processor.Processor upgraded!");
    }
    @Override
    public String toString(){
//        final StringBuilder sb = new StringBuilder("Processor{");
//        sb.append("Core # '").append(cores).append('\'');
//        sb.append(", Clock speed '").append(clockSpeed).append('\'');
//        sb.append(", Architecture '").append(architecture).append('\'');
//        sb.append('}');
  //      return sb.toString();
        return new StringJoiner(",  ","(StringJoiner) Processor {","}")
                .add("Core # '"+cores+'\'')
                .add(", Clock speed '"+clockSpeed+'\'')
                .add(", Architecture '"+architecture+'\'')
               // .add("}")
                .toString();
    }
}
