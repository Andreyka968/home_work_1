package comm.parts.ram;

// Класс для представления оперативной памяти компьютера
public class RAM {
    String type;
    int sizeGB;
    int frequency;
    String manufacturer;
    boolean isECC;

    public RAM() {
        this.type = type;
        this.sizeGB = sizeGB;
        this.frequency = frequency;
        this.manufacturer = manufacturer;
        this.isECC = isECC;
    }
    public static Builder newBuilder() {
        // Создание объекта класса Car и вложенного объекта класса Builder
        return new RAM().new Builder();
    }
    // Вложенный класс
    public final class Builder {
        private String type;
        private int sizeGB;
        private int frequency;
        private String manufacturer;
        private boolean isECC;

        private Builder() {
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setsizeGB(int sizeGB) {
            this.sizeGB = sizeGB;
            return this;
        }

        public Builder setfrequency(double frequency) {
            this.frequency = (int) frequency;
            return this;
        }

        public Builder setisECC(boolean isECC) {
            this.isECC = isECC;
            return this;
        }

        public String setmanufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this.toString();
        }
    // Метод, заполняющий поля объекта RAM и возвращающий этот объект
    public RAM build() {
        RAM.this.type = type;
        RAM.this.sizeGB = this.sizeGB;
        RAM.this.frequency = this.frequency;
        RAM.this.isECC = this.isECC;
        RAM.this.manufacturer = manufacturer;
        return RAM.this;
   }}
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RAM{");
        sb.append("type='").append(type).append('\'');
        sb.append(", sizeGB=").append(sizeGB);
        sb.append(", frequency=").append(frequency);
        sb.append(", isECC=").append(isECC);
        sb.append(", manufacturer=").append(manufacturer);
        sb.append('}');
        return sb.toString();
    }
}
