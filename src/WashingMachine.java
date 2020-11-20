public class WashingMachine extends Device{

    // Constructor
    public WashingMachine(String Designer , String DeviceName , String Type , int Length , int Height , int Depth , int Consume){

        SetValues(Designer , DeviceName , Type , Length , Height , Depth , Consume ); // Sending Variables to Setters.

        DisplayDetails();
    } // End of Constructor

    // Use of Setters.
    private void SetValues(String Designer , String DeviceName , String Type , int Length , int Height , int Depth , int Consume){
        SetDesigner(Designer);
        SetDeviceName(DeviceName);
        SetType(Type);
        SetLength(Length);
        SetHeight(Height);
        SetDepth(Depth);
        SetConsume(Consume);
    }

    // Power (On - Off)
    public void PowerOn() {
        status = true;
    }
    public void PowerOff(){
        status = false;
    }
    public boolean Status() {
        return status;
    }

    // Setters
    public void SetDesigner(String Designer){this.Designer = Designer;}
    public void SetDeviceName(String DeviceName){this.DeviceName = DeviceName;}
    public void SetType(String Type){this.Type = Type;}
    public void SetLength(int Length){this.Length = Length;}
    public void SetHeight(int Height){this.Height = Height;}
    public void SetDepth(int Depth){this.Depth = Depth;}
    public void SetConsume(int Consume){this.Consume = Consume;}
    // Getters
    public String GetDesigner(){
        return Designer;
    }
    public String GetDeviceName(){
        return DeviceName;
    }
    public String GetType(){
        return Type;
    }
    public int GetLength(){
        return Length;
    }
    public int GetHeight(){
        return Height;
    }
    public int GetDepth(){
        return Depth;
    }
    public int GetConsume()  {
        return Consume;
    }

    public void DisplayDetails() {
        System.out.printf("%s: %s Length: %dcm Height: %dcm Depth: %dcm Consumption: %dkWh/h\n"  , GetType() , GetDeviceName() , GetLength() , GetHeight() , GetDepth() , GetConsume());
        System.out.printf("Designer: %s\n" , GetDesigner());


    }

    public int PeriodicMantainance() {
        return 0;
    } // No use.
}
