import java.rmi.server.ExportException;
/**
 *  In This Class we are going to Insert , Display Details and check for different kind of Errors.
 *  We are going to create an Oven with Specific Details.
 */
public class Oven {
    private String Designer;
    private String DeviceName;
    private String Type;
    private int Length;
    private int Height;
    private int Depth;
    private int Consume;
    /*NEW*/
    private String Color;
    private int Capacity; // lt
    private int MaxTemperature;
    private int GrillOptions;
    private int Switches; // How many Switches we have.

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
     * The Following Function sets the Value of the Selected Variable.
     * @param Capacity The Capacity in lt.
     */
    public void SetCapacity(int Capacity){
        this.Capacity = Capacity;
    }
    /**
     * The Following Function sets the Value of the Selected Variable.
     * @param MaxTemperature The Max Temperature of our Device.
     */
    public void SetMaxTemperature(int MaxTemperature){
        this.MaxTemperature = MaxTemperature;
    }
    /**
     * The Following Function sets the Value of the Selected Variable.
     * @param GrillOptions The Grill Options we have.
     */
    public void SetGrillOptions(int GrillOptions){
        this.GrillOptions = GrillOptions;
    }
    /**
     * The Following Function sets the Value of the Selected Variable.
     * @param Switches The Switches in our Device.
     */
    public void SetSwitches(int Switches){
        this.Switches = Switches;
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
     * @return Returns the Capacity in lt.
     */
    public int GetCapacity(){
        return Capacity;
    }
    /**
     * The Following Function Returns the Value of the Selected Variable.
     * @return Returns the Max Temperature in Celsius.
     */
    public int GetMaxTemperature(){
        return MaxTemperature;
    }
    /**
     * The Following Function Returns the Value of the Selected Variable.
     * @return Returns How Many Grill Options we have.
     */
    public int GetGrillOptions(){
        return GrillOptions;
    }
    /**
     * The Following Function Returns the Value of the Selected Variable.
     * @return Returns How many Switches our Device have.
     */
    public int GetSwitches(){
        return Switches;
    }

    static int OvenCounter = 0;
    /**
     * The Following Function Returns the Value of the Selected Variable.
     * @return Returns the sum of our Devices
     */
    public int OvenCounter(){
        System.out.printf("\nOvens: ");
        return OvenCounter;
    }

    // Constructor
    Oven(String CreatorName , String DeviceName , String Type , int Length , int Height , int Depth , int Consume , String Color , int Capacity , int MaxTemperature , int GrillOptions , int Switches){
        try{
            SetCreatorName(CreatorName);
            SetName(DeviceName);
            SetType(Type);
            SetLength(Length);
            SetHeight(Height);
            SetDepth(Depth);
            SetConsume(Consume);
            SetColor(Color);
            SetCapacity(Capacity);
            SetMaxTemperature(MaxTemperature);
            SetGrillOptions(GrillOptions);
            SetSwitches(Switches);
        }
        catch (Exception e){
            System.out.println("ERR: Can't Instert Values to Variables");
            return;
        }
        OvenCounter = OvenCounter + 1;
        OvenDetails();
    }

    /**
     * The Following Function Displays The Details of our Device
     */
    public void OvenDetails(){
        try{
            System.out.printf("%s: %s Length: %dcm Height: %dcm Depth: %dcm Consumption: %dkWh/h\n"  , GetType() , GetDeviceName() , GetLength() , GetHeight() , GetDepth() , GetConsume());
            System.out.printf("Color: %s Capacity: %dlt Max_Temperature: %d Grill_Options: %d Switches: %d\n" , GetColor() , GetCapacity() , GetMaxTemperature() , GetGrillOptions() , GetSwitches());
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
