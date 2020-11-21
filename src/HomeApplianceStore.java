
interface DeviceBasic{

    void PowerOn();
    void PowerOff();
    int PeriodicMantainance();
    boolean Status();

    // Signature
    void SetDesigner(String Designer);
    void SetDeviceName(String DeviceName);
    void SetType(String Type);
    void SetLength(int Length);
    void SetHeight(int Height);
    void SetDepth(int Depth);
    void SetConsume(int Consume);
    String GetDesigner();
    String GetDeviceName();
    String GetType();
    int GetLength();
    int GetHeight();
    int GetDepth();
    int GetConsume();

    void DisplayDetails();
}

abstract class Device implements DeviceBasic{

    // Common Variables in other Classes.
    public static String Designer;
    public static String DeviceName;
    public static String Type;
    public static  int Length;
    public static  int Height;
    public static int Depth;
    public static int Consume;


    // Common Methods Between Classes
    // Basic Setters - Getters.
    public abstract void SetDesigner(String Designer);
    public abstract void SetDeviceName(String DeviceName);
    public abstract void SetType(String Type);
    public abstract void SetLength(int Length);
    public abstract void SetHeight(int Height);
    public abstract void SetDepth(int Depth);
    public abstract void SetConsume(int Consume);
    // Getters
    public abstract String GetDesigner();
    public abstract String GetDeviceName();
    public abstract String GetType();
    public abstract int GetLength();
    public abstract int GetHeight();
    public abstract int GetDepth();
    public abstract int GetConsume();

    // Controls Status of Device.
    public static boolean status;


    public abstract void DisplayDetails(); // Display Details of Device
}


public class HomeApplianceStore{
    public static void main(String[] args) {
        DeviceStatus();
    }

    public static void DeviceStatus() {

        // Creating Device.
        Device div = new Fridge("Bosch", "HT/52", "Fridge", 223, 332, 234, 523);

        // Casting Objects
        // Upcast not Used.

        // Downcast:
        if (div instanceof Fridge) {

            Fridge fridge = (Fridge) div; // Downcasting

            // Device Status:
            System.out.printf("Device is Currenly: ");
            if(((Device) fridge).Status() == true) System.out.printf("Online");
            else System.out.printf("Offline");

            /*To Turn(On) Device Add: fridge.PowerOn() below Downcasting. */
            }
        }
}

