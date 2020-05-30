
public class RiceCooker {

   private String capacity;

   //Overriding
    public static void cookPlainRice() {
        System.out.println("Start cooking plain rice.");
    }

    public static void heatRetention() {
        System.out.println("Heat retention started.");
    }

    //Encapsulation
    public void setCapacity(String newCapacity){
        capacity = newCapacity;
    }

    public String getCapacity(){
        return capacity;
    }
}
