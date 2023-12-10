package com.comm.parts.hard_drive;

// com.comm.parts.hard_drive.HardDrive.java
public class HardDrive {
    private String type;
    private int capacityGB;
    private int rpm;
    private String formFactor;
    private boolean isSSD;

    public String gettype() {
        return type;
    }

    public int getcapacityGB() {
        return capacityGB;
    }

    public int getrpm() {
        return rpm;
    }

    public String getformFactor() {
        return formFactor;
    }
    public boolean getisSSD() {
        return isSSD;
    }

    public HardDrive() {
    }

    public static Builder newBuilder() {
        // Создание объекта класса Car и вложенного объекта класса Builder
        return new HardDrive().new Builder();
    }

    // Вложенный класс
    public final class Builder {
        private String type;
        private int capacityGB;
        private int rpm;
        private String formFactor;
        private boolean isSSD;

        private Builder() {

        }

        public Builder settype(String type) {
            this.type = type;
            return this;
        }

        public Builder setcapacity(int capacityGB) {
            this.capacityGB = capacityGB;
            return this;
        }

        public Builder setrpm(int rpm) {
            this.rpm = rpm;
            return this;
        }

        public Builder setformFactor(String formFactor) {
            this.formFactor = formFactor;
            return this;
        }
        public Builder setisSSD(String isSSD) {
            this.isSSD = Boolean.parseBoolean(isSSD);
            return this;
        }
        // Метод, заполняющий поля объекта Car и возвращающий этот объект
        public HardDrive build() {
            HardDrive.this.isSSD = isSSD;
            HardDrive.this.formFactor = this.formFactor;
            HardDrive.this.rpm = this.rpm;
            HardDrive.this.capacityGB = this.capacityGB;
            HardDrive.this.type = type;
            return HardDrive.this;
        }
    }
    @Override
    public String toString() {
//        final StringBuilder sb = new StringBuilder("Hard Drive{");
//        sb.append("type='").append(type).append('\'');
//        sb.append(", capacityGB=").append(capacityGB);
//        sb.append(", rpm=").append(rpm);
//        sb.append(", formFactor=").append(formFactor);
//        sb.append(", C=").append(isSSD);
//        sb.append('}');
//        return sb.toString();
        return String.format("(String.Format) HardDrive {type='%s', capacityGB='%d', rpm='%d', formFactor='%s', isSSD='%s' }",type,capacityGB,rpm,formFactor,isSSD);
    }

}
