
public class Main {

    public static void main(String[] args) {

        RiceCooker rc = new RiceCooker();
        ClassicElectricRiceCooker cerc = new ClassicElectricRiceCooker();
        GasRiceCooker grc = new GasRiceCooker();
        MicroComputerizedRiceCooker mcrc = new MicroComputerizedRiceCooker();


        //Overriding
        rc.cookPlainRice();
        System.out.println("--------------------------------------------------------------");
        cerc.cookPlainRice();
        //Inheritance
        cerc.heatRetention();
        //Encapsulation
        cerc.setCapacity("Medium");
        System.out.println("Capacity: " + cerc.getCapacity());

        System.out.println("Internal Pot: " + cerc.internalPot);
        System.out.println("Non-sticky cooker surface: " + cerc.nonStickySurface);
        System.out.println("--------------------------------------------------------------");

        //Overriding
        mcrc.cookPlainRice();
        //Encapsulation
        mcrc.setCapacity("Small");
        System.out.println("Capacity: " + mcrc.getCapacity());
        mcrc.adjustTimer(12);
        //Overloading
        mcrc.setFunction(1);
        System.out.println("Plain rice cooking function: " + mcrc.getFunction());
        mcrc.setFunction(3.2);
        System.out.println("Set other function: " + mcrc.getFunction());
        //Encapsulation
        mcrc.setMode("Stewing");
        System.out.println("Set other cooking mode: " + mcrc.getMode());

        System.out.println("--------------------------------------------------------------");

        //Overriding
        grc.cookPlainRice();
        //Encapsulation
        grc.setCapacity("Large");
        System.out.println("Capacity: " + grc.getCapacity());

        grc.heatSetting();
        grc.simmer();
        //Encapsulation
        grc.setMaterial("Propane");
        System.out.println("Using " + grc.getMaterial() + " as material");

    }
}
