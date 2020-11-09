import java.rmi.server.ExportException;
/**
 * In this Class we are Going to Insert , Display and Check for Different kind of errors.
 * We are going to Create a Washing_Machine with Specific Details.
 */
public class WashingMachine {
    private String Designer;
    private String DeviceName;
    private String Type;
    private int Length;
    private int Height;
    private int Depth;
    private int Consume;
    /*NEW*/
    private String Color;
    private int MaxSpin;
    private int Capacity; // In Kilos
    private int WashingNoiseLevel; // db
    private int SpinningNoiseLevel; // db

    // Setters
    /**
     *  The Following Function sets the Value of the Selected Variable.
     * @param Designer The Name of the Designer
     */
    public void SetCreatorName(String Designer){
        this.Designer = Designer;
    }

    /**
     *  The Following Function sets the Value of the Selected Variable.
     * @param Name The Name of Our Device
     */
    public void SetName(String Name){
        this.DeviceName = Name;
    }

    /**
     *  The Following Function sets the Value of the Selected Variable.
     * @param Type The Type of Our Device.
     */
    public void SetType(String Type){
        this.Type = Type;
    }

    /**
     *  The Following Function sets the Value of the Selected Variable.
     * @param length The Length of our Device
     */
    public void SetLength(int length){
        this.Length = length;
    }

    /**
     *  The Following Function sets the Value of the Selected Variable.
     * @param Height The Height of our Device
     */
    public void SetHeight(int Height){
        this.Height = Height;
    }

    /**
     *  The Following Function sets the Value of the Selected Variable.
     * @param Depth The Depth of our Device.
     */
    public void SetDepth(int Depth){
        this.Depth = Depth;
    }

    /**
     *  The Following Function sets the Value of the Selected Variable.
     * @param Consume kWh/h
     */
    public void SetConsume(int Consume){
        this.Consume = Consume;
    }

    /**
     *  The Following Function sets the Value of the Selected Variable.
     * @param Color The Color of our Device.
     */
    public void SetColor(String Color){
        this.Color = Color;
    }

    /**
     *  The Following Function sets the Value of the Selected Variable.
     * @param MaxSpin The Max Spins Per Minute.
     */
    public void SetMaxSpin(int MaxSpin){
        this.MaxSpin = MaxSpin;
    }

    /**
     *  The Following Function sets the Value of the Selected Variable.
     * @param Capacity The Capacity in lt.
     */
    public void SetCapacity(int Capacity){
        this.Capacity = Capacity;
    }

    /**
     * The Following Function sets the Value of the Selected Variable.
     * @param WashingNoiseLevel Washing Noise Level in db.
     */
    public void SetWashingNoiseLevel(int WashingNoiseLevel){
        this.WashingNoiseLevel = WashingNoiseLevel;
    }

    /**
     *  The Following Function sets the Value of the Selected Variable.
     * @param SpinningNoiseLevel Spinning Noise Level in db.
     */
    public void SetSpinningNoiseLevel(int SpinningNoiseLevel){
        this.SpinningNoiseLevel = SpinningNoiseLevel;
    }

    // Getters
    /**
     * The Following Function Returns the Value of the Selected Variable.
     * @return Returns the Name of our Designer.
     */
    public String GetCreatorName(){
        return Designer;
    }

    /**
     * The Following Function Returns the Value of the Selected Variable.
     * @return Returns the Name of our Device.
     */
    public String GetDeviceName(){
        return DeviceName;
    }

    /**
     * The Following Function Returns the Value of the Selected Variable.
     * @return Returns the Type of our Device.
     */
    public String GetType(){
        return Type;
    }

    /**
     * The Following Function Returns the Value of the Selected Variable.
     * @return Returns the Length in cm of our Device.
     */
    public int GetLength(){
        return Length;
    }

    /**
     * The Following Function Returns the Value of the Selected Variable.
     * @return Returns the Height in cm of our device.
     */
    public int GetHeight(){
        return Height;
    }

    /**
     * The Following Function Returns the Value of the Selected Variable.
     * @return Returns the Depth in cm of our device
     */
    public int GetDepth(){
        return Depth;
    }
    /**
     * The Following Function Returns the Value of the Selected Variable.
     * @return Returns the kWh/h
     */
    public int GetConsume(){
        return Consume;
    }

    /**
     * The Following Function Returns the Value of the Selected Variable.
     * @return Returns what color is our Device.
     */
    public String GetColor(){
        return Color;
    }
    /**
     * The Following Function Returns the Value of the Selected Variable.
     * @return Returns The Max Spins we get per minute of our device.
     */
    public int GetMaxSpin(){
        return MaxSpin;
    }
    /**
     * The Following Function Returns the Value of the Selected Variable.
     * @return Returns the Capacity of our device in Kilos.
     */
    public int GetCapacity(){
        return Capacity;
    }
    /**
     * The Following Function Returns the Value of the Selected Variable.
     * @return Returns the Noice while the device is on Washing Mode in db.
     */
    public int GetWashingNoiseLevel(){
        return WashingNoiseLevel;
    }
    /**
     * The Following Function Returns the Value of the Selected Variable.
     * @return Returns the Noice while the device is on Spinning Mode in db.
     */
    public int GetSpinningNoiseLevel(){
        return SpinningNoiseLevel;
    }

    static int WashingMachineCounter = 0;
    /**
     * The Following Function Returns the Value of the Selected Variable.
     * @return Returns the Sum of our Devices with the Same type.
     */
    public int WashingMachineCounter(){
        System.out.printf("\nWashing Machines: ");
        return WashingMachineCounter;
    }

    // Constructor
    WashingMachine(String CreatorName , String DeviceName , String Type , int Length , int Height , int Depth , int Consume , String Color , int MaxSpin , int Capacity , int WashingNoiseLevel , int SpinningNoiseLevel){
        try{
            SetCreatorName(CreatorName);
            SetName(DeviceName);
            SetType(Type);
            SetLength(Length);
            SetHeight(Height);
            SetDepth(Depth);
            SetConsume(Consume);
            SetColor(Color);
            SetMaxSpin(MaxSpin);
            SetCapacity(Capacity);
            SetWashingNoiseLevel(WashingNoiseLevel);
            SetSpinningNoiseLevel(SpinningNoiseLevel);
        }
        catch (Exception e){
            System.out.println("ERR: Can't Instert Values to Variables");
            return;
        }
        WashingMachineCounter = WashingMachineCounter + 1;
        WashingMachineDetails();
    }

    /**
     * The Following Function Displays the Details of our Device.
     */
    public void WashingMachineDetails(){
        try{
            System.out.printf("%s: %s Length: %dcm Height: %dcm Depth: %dcm Consumption: %dkWh/h\n"  , GetType() , GetDeviceName() , GetLength() , GetHeight() , GetDepth() , GetConsume());
            System.out.printf("Washing_Noise: %ddb Spinning_Noise: %ddb Capacity: %d Kilos Max_Spins: %d\n" , GetWashingNoiseLevel() , GetSpinningNoiseLevel() , GetCapacity() , GetMaxSpin());
            System.out.printf("Designer: %s\n\n" , GetCreatorName());
        }
        catch (Exception e){
            System.out.println("ERR: Details Can't be Displayed.");
            return;
        }
    }


    private void PeriodicMentaintance(){
        // null
    }
}
