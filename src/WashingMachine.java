import java.io.Serializable;
public class WashingMachine implements Serializable {

    public static String Designer;
    public static String DeviceName;
    public static String Type;
    public static  int Length;
    public static  int Height;
    public static int Depth;
    public static int Consume;

    public static int counter = 0;
    // Constructor
    public WashingMachine(String Designer , String DeviceName , String Type , int Length , int Height , int Depth , int Consume){

        this.Designer = Designer;
        this.DeviceName = DeviceName;
        this.Type = Type;
        this.Length = Length;
        this.Height = Height;
        this.Depth = Depth;
        this.Consume = Consume;

        counter++;
    } // End of Constructor

    public static String Devices(){
        return "WashingMachines: " + counter;
    }
}