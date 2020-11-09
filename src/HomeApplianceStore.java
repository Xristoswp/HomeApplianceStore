/**
 * PUBLIC CLASS WITH MAIN
 */
public class HomeApplianceStore {
    /**
     * Main Fuction , We Create New Devices and we Insert Values to them.
     * We Display their Details and in the End how many Devices of different types we have.
     * @param args NO USE OF ARGS
     */
    public static void main(String[] args) {

    Fridge Fridge = new Fridge("Ikea" , "Legan" , "Fridge" , 179 , 64 , 70 , 294 , "White" , 4 , 794 , 1 , 64);
    Fridge Fridge2 = new Fridge("Ikea" , "Tinad" , "Fridge" , 179 , 92 , 72 , 310 , "Black" , 3 , 584 , 1 , 44);
    WashingMachine Machine = new WashingMachine("Bosch" , "Wan282K8GR" , "WashingMachine" , 59 , 84, 59 , 289 , "White" , 1400 , 8 , 44 , 33);
    Oven Oven = new Oven("Gamba" , "KH3T" , "Oven" , 48 , 33 , 31 , 120 , "Black" , 28 , 55 , 4 , 3);
    AirCondition Air = new AirCondition("Toyosima" , "TRN/TRG-856ZR" , "AirCondition" , 955 , 700 , 396 , 700 , "White" , 17743 , 14330 ,59 , 64);
    AirCondition Air2 = new AirCondition("Toyosima" , "TRN/TRG-100ZR" , "AirCondition" , 930 , 680 , 372 , 689 , "Black" , 17743 , 14330 ,60 , 34);

        System.out.println(Fridge.FridgeCounter());
        System.out.println(Machine.WashingMachineCounter());
        System.out.println(Oven.OvenCounter());
        System.out.println(Air.AirConditionCounter());
    }
}
