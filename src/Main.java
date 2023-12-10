import comm.parts.graphic_card.GraphicsCard;
import comm.ComputerBuilder;
import comm.parts.graphic_card.GraphicsCardBuilder;
import comm.parts.processor.Processor;
import comm.parts.processor.extended_processor.ExtendedProcessor;
import comm.parts.hard_drive.HardDrive;
import comm.parts.ram.RAM;

public class Main {
    public static void main(String[]args){
        ExtendedProcessor ext = new ExtendedProcessor("String brand", "String model",2020,400,true,
        4,4000," String architecture",
        4," String socketType",true);
        System.out.println(ext.getClockSpeed());
        HardDrive hd = HardDrive.newBuilder()
                .settype("type")
                .setcapacity(5)
                .setrpm(4)
                .setformFactor("Desctop")
                .setisSSD(String.valueOf(true))
                .build();
        System.out.println(hd);
        Processor p = new Processor("Apple",
                "A52",
                1002,
                444.44,
                true,
                4,
                44,
                "ARM");
        System.out.println(p);
        RAM vam = RAM.newBuilder()
                .setfrequency(2700)
                .setsizeGB(8)
                .setisECC(true)
                .setType("DDR")
                .build();
        System.out.println(vam);
        GraphicsCardBuilder gcb = new GraphicsCardBuilder()
                .setBrand("nVidea")
                .setPrice(3000)
                .setYear(2023)
                .setModel("rtx3080")
                .build();
                System.out.println(gcb);
        ComputerBuilder cp = new ComputerBuilder()
                .setBrand("sony")
                .setIsLaptop(false)
                .setPrice(7000)
                .setModel("A200")
                .setYear(2022);
        System.out.println(cp.displayInfo1());
        }
    }

