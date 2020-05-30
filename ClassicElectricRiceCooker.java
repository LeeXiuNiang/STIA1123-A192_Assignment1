//Inheritance
public class ClassicElectricRiceCooker extends RiceCooker{

    String internalPot="Removable";
    boolean nonStickySurface = true;

    //Overriding
    public static void cookPlainRice() {
        System.out.println("Start cooking plain rice using classic electric rice cooker.");
    }
}
