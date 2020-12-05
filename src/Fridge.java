import java.io.Serializable;
public class Fridge implements Serializable{

    public String Designer;
    public String DeviceName;
    public String Type;
    public int Length;
    public int Height;
    public int Depth;
    public int Consume;

    public static int counter = 0;
    // Constructor
    public Fridge(String Designer , String DeviceName , String Type , int Length , int Height , int Depth , int Consume){

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
        return "Fridges: " + counter;
    }
}