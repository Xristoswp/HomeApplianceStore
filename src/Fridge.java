import java.rmi.server.ExportException;

/**
 * In this Class we are going to Create a New Fridge with Specific Details.
 */
public class Fridge {
    private static String Designer;
    private static String DeviceName;
    private static String Type;
    private static  int Length;
    private static  int Height;
    private static int Depth;
    private static  int Consume;
    /*NEW*/
    private static  String Color;
    private static  int Shelves;
    private static  int Capacity; // Capacity in lt.
    private static  int Moters;
    private static  int NoiseLevel;

    // Setters

    /**
     *  The Following Function sets the Value of the Selected Variable.
     * @param CreatorName The Disigner's Name.
     */
    public void SetCreatorName(String CreatorName){
        this.Designer = CreatorName;
    }

    /**
     * The Following Function sets the Value of the Selected Variable.
     * @param Name The name of our Device
     */
    public void SetName(String Name){
        this.DeviceName = Name;
    }

    /**
     *  The Following Function sets the Value of the Selected Variable.
     * @param Type What type we have: Fridge.
     */
    public void SetType(String Type){
        this.Type = Type;
    }

    /**
     *  The Following Function sets the Value of the Selected Variable.
     * @param length The Length of our Fridge
     */
    public void SetLength(int length){
        this.Length = length;
    }

    /**
     *  The Following Function sets the Value of the Selected Variable.
     * @param Height The Height of our Fridge
     */
    public void SetHeight(int Height){
        this.Height = Height;
    }

    /**
     *  The Following Function sets the Value of the Selected Variable.
     * @param Depth The Depth of Our Fridge
     */
    public void SetDepth(int Depth){
        this.Depth = Depth;
    }

    /**
     *  The Following Function sets the Value of the Selected Variable.
     * @param Consume How much kWh/h we consume.
     */
    public void SetConsume(int Consume){
        this.Consume = Consume;
    }

    /**
     *  The Following Function sets the Value of the Selected Variable.
     * @param Color What Color is our Fridge
     */
    public void SetColor(String Color){
        this.Color = Color;
    }

    /**
     *  The Following Function sets the Value of the Selected Variable.
     * @param Shelves How many Shelves we have on our Fridge
     */
    public void SetShelves(int Shelves){
        this.Shelves = Shelves;
    }

    /**
     *  The Following Function sets the Value of the Selected Variable.
     * @param Capacity The Capacity of Our Fridge in lt.
     */
    public void SetCapacity(int Capacity){
        this.Capacity = Capacity;
    }

    /**
     *  The Following Function sets the Value of the Selected Variable.
     * @param Moters The Sum of how many Moters we have in our Fridge
     */
    public void SetMoters(int Moters){
        this.Moters = Moters;
    }

    /**
     *  The Following Function sets the Value of the Selected Variable.
     * @param NoiseLevel How much Noise does it make in db.
     */
    public void SetNoiseLevel(int NoiseLevel){
        this.NoiseLevel = NoiseLevel;
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
     * @return Returns the value of how many shelves we have.
     */
    public int GetShelves(){
        return Shelves;
    }

    /**
     * The Following Function Returns the Value of the Selected Variable.
     * @return Returns the Value of our Moters
     */
    public int GetMoters(){
        return Moters;
    }

    /**
     * The Following Function Returns the Value of the Selected Variable.
     * @return Returns the Noise in db.
     */
    public int GetNoiseLevel(){
        return NoiseLevel;
    }

    /**
     * The Following Function Returns the Value of the Selected Variable.
     * @return Returns the Capacity of our device in lt.
     */
    public int GetCapacity(){
        return Capacity;
    }


    static int FridgeCounter = 0;

    /**
     *
     * @return Returns How many Devices in the same type we have.
     */
    public int FridgeCounter(){
        System.out.printf("\nFridges: ");
        return FridgeCounter;
    }

    // Constructops
    Fridge(String CreatorName , String DeviceName , String Type , int Length , int Height , int Depth , int Consume , String Color , int Shelves , int Capacity , int Moters , int NoiseLevel){
        try{
            // Setting Values.
            SetCreatorName(CreatorName);
            SetName(DeviceName);
            SetType(Type);
            SetLength(Length);
            SetHeight(Height);
            SetDepth(Depth);
            SetConsume(Consume);
            SetColor(Color);
            SetShelves(Shelves);
            SetCapacity(Capacity);
            SetMoters(Moters);
            SetNoiseLevel(NoiseLevel);
        }
        catch (Exception e){
            System.out.println("ERR: Can't Insert Values to Variables.");
            return;
        }
        FridgeCounter = FridgeCounter + 1;
        FridgeDetails();
    }


    /**
     * The Following Function Displays The Details of our Device.
     */
    public void FridgeDetails(){
        try{
            System.out.printf("%s: %s Length: %dcm Height: %dcm Depth: %dcm Consumption: %dkWh/h\n"  , GetType() , GetDeviceName() , GetLength() , GetHeight() , GetDepth() , GetConsume());
            System.out.printf("Noise: %ddb Capacity: %dlt Color: %s Shelves: %d Moters: %d\nDesigner: %s\n\n" , GetNoiseLevel() , GetCapacity() , GetColor() , GetShelves() , GetMoters() , GetCreatorName());
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
