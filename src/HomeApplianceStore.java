import java.io.*;


public class HomeApplianceStore{
    public static void main(String[] args) {
    // Filename Devices.txt
        String filename = "Devices.txt";
    /*--------------------------------*/
    // Creating Array of Objects
    Fridge FridgeArray[] = new Fridge[readFile(filename , "Fridge")];
    Oven OvenArray[] = new Oven[readFile(filename , "Oven")];
    WashingMachine WashingMachineArray[] = new WashingMachine[readFile(filename , "WashingMachine")];
    AirCondition AirConditionArray[] = new AirCondition[readFile(filename , "AirCondition")];

    // Saving Objects to Array.
    for(int i=0; i<FridgeArray.length; i++){
        FridgeArray[i] = new Fridge("Test" , "Test" , "Fridge" , 5 , 5, 5, 5);
    }
    for(int i=0; i<OvenArray.length; i++){
            OvenArray[i] = new Oven("Test" , "Test" , "Oven" , 5 , 5, 5, 5);
    }
    for(int i=0; i<WashingMachineArray.length; i++){
            WashingMachineArray[i] = new WashingMachine("Test" , "Test" , "WashingMachine" , 5 , 5, 5, 5);
    }
    for(int i=0; i<AirConditionArray.length; i++){
            AirConditionArray[i] = new AirCondition("Test" , "Test" , "AirCondition" , 5 , 5, 5, 5);
    }

    // Display Number of Devices
    System.out.println(Fridge.Devices());
    System.out.println(Oven.Devices());
    System.out.println(WashingMachine.Devices());
    System.out.println(AirCondition.Devices());

    //Write Object To File.
    WriteObjectsToFile(FridgeArray , OvenArray , WashingMachineArray , AirConditionArray );
}

    static int readFile(String Filename , String Device){

        String s;
           try {
               BufferedReader br = new BufferedReader(new FileReader(Filename));
               while ((s = br.readLine()) != null) { // While the EOF
                   String[] st = s.split(" "); // Array for Holding each Word per Block. Split Words with ' '.
                   String Div = st[0]; // Type of Device.
                   String id = st[1]; // Numbers of Device.
                   // Finding Our Device.
                    if(Div.equals(Device)){
                        return Integer.parseInt(st[1]);
                    }
               }
           }
        catch(Exception e){
            System.out.println("Error Corrupted.");
        }

        System.out.println("Device: " + Device + " Was not Found\n");
        return 0;
    }

    public static void WriteObjectsToFile(Object FridgeArray[] , Object OvenArray[] , Object WashingMachineArray[] , Object AirConditionArray[] ){

        // Serialization
        try{
            FileOutputStream fileOut = new FileOutputStream("Objects.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            // Writting Object to File
            out.writeObject(FridgeArray);
            out.writeObject(OvenArray);
            out.writeObject(WashingMachineArray);
            out.writeObject(AirConditionArray);
            out.close();

        }
        catch (IOException ex){
            System.out.println("IOException is caught");
        }
    }
}

