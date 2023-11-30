public class Main {
    public static void main(String[]args){
        ExtendedProcessor ext = new ExtendedProcessor("String brand", "String model",2020,400,true,
        4,4000," String architecture",
        4," String socketType",true);
        System.out.println(ext.getCacheSizeKB());

        }
    }


