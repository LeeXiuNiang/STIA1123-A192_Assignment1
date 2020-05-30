//Inheritance
public class MicroComputerizedRiceCooker extends RiceCooker{

    private int riceFunction;
    private double otherFunction;
    private String function, mode;

    //Overriding
    public static void cookPlainRice() {
        System.out.println("Start cooking plain rice using micro-computerized rice cooker.");
    }

    public static void adjustTimer(int duration){
        System.out.println(duration + " minutes is set for cooking process.");
    }

    //Overloading
    public void setFunction(int newRiceFunction){
        riceFunction = newRiceFunction;

        if (riceFunction==1)
            function="Expert Rice";
        else if(riceFunction==2)
            function="Quick Rice";
    }

    public void setFunction(double newOtherFunction){
        otherFunction = newOtherFunction;

        if (otherFunction==3.1)
            function="Cook Brown Rice";
        else if(otherFunction==3.2)
            function="Cook Porridge";
        else if(otherFunction==3.3)
            function="Bake Cake";
        else if(otherFunction==3.4)
            function="Cook Soup";
    }

    public String getFunction(){
        return function;
    }

    //Encapsulation
    public void setMode(String newMode){
        mode = newMode;
    }

    public String getMode(){
        return mode;
    }
}
