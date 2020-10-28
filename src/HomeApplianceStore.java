public class HomeApplianceStore {

    static String CompanyName;
    static String Address;
    static int Employers;

    public static void main(String[] args) {
        // Setters
        try{
            setName(args[0]);
            setAddress(args[1]);
            setEmployers(Integer.parseInt(args[2]));
        }
        catch(Exception e){
            System.out.println("ERR: Configure Arguments");
            return;
        }

       // Display Arguments
       try{
           System.out.println(getName() + " " + getAddress() + " " + getEmployers());
       }
       catch(Exception e){
           System.out.println("ERR: Failure on Arguments");
       }
    }
    // Setters
    public static void setName(String Name){
        CompanyName = Name;
    }
    public static void setAddress(String Addr){
        Address = Addr;
    }
    public static void setEmployers(int Emp){
        Employers = Emp;
    }
    // Getters
    public static String getName(){
        return CompanyName;
    }
    public static String getAddress(){
        return Address;
    }
    public  static int getEmployers(){
        return Employers;
    }
}
