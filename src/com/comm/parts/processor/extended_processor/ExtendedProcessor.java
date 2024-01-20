package com.comm.parts.processor.extended_processor;

import com.comm.parts.processor.Processor;

public class ExtendedProcessor extends Processor {
    private int cacheSizeKB;
    private String socketType;
    private boolean overclockable;

    // Конструктор класса
    public ExtendedProcessor(String brand, String model, int year, double price, boolean isLaptop,
                             int cores, double clockSpeed, String architecture,
                             int cacheSizeKB, String socketType, boolean overclockable) {
        super(brand, model, year, price, isLaptop, cores, clockSpeed, architecture);
        this.cacheSizeKB = cacheSizeKB;
        this.socketType = socketType;
        this.overclockable = overclockable;
    }

    // Аксессоры (геттеры) для дополнительных полей
    public int getCacheSizeKB() {
        return cacheSizeKB;
    }

    public String getSocketType() {
        return socketType;
    }

    public boolean isOverclockable() {
        return overclockable;
    }

    @Override
    public void displayInfo() {
        System.out.println("Extended com.comm.parts.processor.Processor: " + getBrand() + " " + getModel() +
                ", Cores: " + getCores() + ", Clock Speed: " + getClockSpeed() + " GHz" +
                ", Cache Size: " + cacheSizeKB + " KB, Socket Type: " + socketType +
                ", Overclockable: " + overclockable);
    }
}
