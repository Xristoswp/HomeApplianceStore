import java.rmi.server.ExportException;
/**
 * In This Class we are Going to Create a New AirCondition with Specific Details.
 */
public class AirCondition {
    private String Designer;
    private String DeviceName;
    private String Type;
    private int Length;
    private int Height;
    private int Depth;
    private int Consume;
    /*NEW*/
    private String Color;
    private int CoolingPower;
    private int HeatingPower;
    private int NoiseInside;
    private int NoiseOutside;

    // Setters
    /**
     * The Following Function sets the Value of the Selected Variable.
     * @param Designer The Name of the Designer.
     *
     */
    public void SetCreatorName(String Designer){
        this.Designer = Designer;
    }
    /**
     * The Following Function sets the Value to the Selected Variable.
     * @param DeviceName The name of Our Device.
     */
    public void SetName(String DeviceName){
        this.DeviceName = DeviceName;
    }
    /**
     * The Following Function sets the Value to the Selected Variable.
     * @param Type What type is our Device.
     */
    public void SetType(String Type){
        this.Type = Type;
    }
    /**
     * The Following Function sets the Value to the Selected Variable.
     * @param length The Length of our Device.
     */
    public void SetLength(int length){
        this.Length = length;
    }
    /**
     * The Following Function sets the Value to the Selected Variable.
     * @param Height The Height of our Device.
     */
    public void SetHeight(int Height){
        this.Height = Height;
    }
    /**
     * The Following Function sets the Value to the Selected Variable.
     * @param Depth The Depth of our Device
     */
    public void SetDepth(int Depth){
        this.Depth = Depth;
    }
    /**
     * The Following Function sets the Value to the Selected Variable.
     * @param Consume How much kW/h Consumes.
     */
    public void SetConsume(int Consume){
        this.Consume = Consume;
    }
    /**
     * The Following Function sets the Value to the Selected Variable.
     * @param Color What Color is our Device
     */
    public void SetColor(String Color){
        this.Color = Color;
    }
    /**
     * The Following Function sets the Value to the Selected Variable.
     * @param CoolingPower in BTU
     */
    public void SetCoolingPower(int CoolingPower){
        this.CoolingPower = CoolingPower;
    }
    /**
     * The Following Function sets the Value to the Selected Variable.
     * @param HeatingPower in BTU
     */
    public void SetHeatingPower(int HeatingPower){
        this.HeatingPower = HeatingPower;
    }
    /**
     * The Following Function sets the Value to the Selected Variable.
     * @param NoiseInside Noise Inside in db.
     */
    public void SetNoiseInside(int NoiseInside){
        this.NoiseInside = NoiseInside;
    }
    /**
     * The Following Function sets the Value to the Selected Variable.
     * @param NoiseOutside Noise Outside in db.
     */
    public void SetNoiseOutside(int NoiseOutside){
        this.NoiseOutside = NoiseOutside;
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
     * @return Returns the Cooling Power in BTU
     */
    public int GetCoolingPower(){
        return CoolingPower;
    }
    /**
     * The Following Function Returns the Value of the Selected Variable.
     * @return Returns the Heating Power in BTU
     */
    public int GetHeatingPower(){
        return HeatingPower = HeatingPower;
    }
    /**
     * The Following Function Returns the Value of the Selected Variable.
     * @return Returns the Inside Noise in db.
     */
    public int GetNoiseInside(){
        return NoiseInside;
    }
    /**
     * The Following Function Returns the Value of the Selected Variable.
     * @return Returns the Outside Noise in db.
     */
    public int GetNoiseOutside(){
        return NoiseOutside;
    }


    static int AirConditionCounter = 0;
    /**
     * The Following Function Returns the Value of the Selected Variable.
     * @return Returns the Sum of our Devices.
     */
    public int AirConditionCounter(){
        System.out.printf("\nAirConditions: ");
        return AirConditionCounter;
    }

    // Constructor
    AirCondition(String CreatorName , String DeviceName , String Type , int Length , int Height , int Depth , int Consume , String Color , int CoolingPower  , int HeatingPower , int NoiseInside , int NoiseOutside){
        try{
            SetCreatorName(CreatorName);
            SetName(DeviceName);
            SetType(Type);
            SetLength(Length);
            SetHeight(Height);
            SetDepth(Depth);
            SetConsume(Consume);
            SetColor(Color);
            SetCoolingPower(CoolingPower);
            SetHeatingPower(HeatingPower);
            SetNoiseInside(NoiseInside);
            SetNoiseOutside(NoiseOutside);
        }
        catch (Exception e){
            System.out.println("ERR: Can't Instert Values to Variables");
            return;
        }
        AirConditionCounter = AirConditionCounter + 1;
        AirConditionDetails();
    }

    /**
     * The Following Function Displays the Details of our Device.
     */
    public void AirConditionDetails(){
        try{
            System.out.printf("%s: %s Length: %dcm Height: %dcm Depth: %dcm Consumption: %dkWh/h\n"  , GetType() , GetDeviceName() , GetLength() , GetHeight() , GetDepth() , GetConsume());
            System.out.printf("Inside_Noise: %ddb Outside_Noise: %d CoolingPower: %d HeatingPower: %d Color: %s\n" , GetNoiseInside() , GetNoiseOutside() , GetCoolingPower() , GetHeatingPower() ,GetColor());
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
