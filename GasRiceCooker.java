//Inheritance
public class GasRiceCooker extends RiceCooker{

    private String material;

    //Overriding
    public static void cookPlainRice() {
        System.out.println("Start cooking plain rice using gas rice cooker.");
    }

    public static void heatSetting(){
        System.out.println("Heat Setting: Automatic two-stage burner.");
    }

    public static void simmer(){
        System.out.println("Automatically turn on simmer.");
    }

    //Encapsulation
    public void setMaterial(String newMaterial){
        material = newMaterial;
    }

    public String getMaterial(){
        return material;
    }
}
