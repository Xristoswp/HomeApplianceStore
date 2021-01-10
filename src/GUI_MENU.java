import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class GUI_MENU extends JFrame {

    private JButton reg;

    private JLabel I1;
    private JLabel I2;
    private JLabel I3;
    private JLabel I4;
    private JTextField ITEM1; //FRIDGES
    private JTextField ITEM2; //WASHINGMACHINES
    private JTextField ITEM3; //OVENS
    private JTextField ITEM4; //AIRCONDITIONS


    public GUI_MENU(){
        super("HomeApplianceStore Application"); // TITTLE
        setLayout(new FlowLayout(FlowLayout.LEFT,10,10));

        // Labels
        I1 = new JLabel("Fridges: ");
        I2 = new JLabel("WashingMachines: ");
        I3 = new JLabel("Ovens: ");
        I4 = new JLabel("AirConditions: ");

        // Text Fields
        ITEM1 = new JTextField(5);
        ITEM2 = new JTextField(5);
        ITEM3 = new JTextField(5);
        ITEM4 = new JTextField(5);

        // Adding
        add(I1);
        add(ITEM1);
        add(I2);
        add(ITEM2);
        add(I3);
        add(ITEM3);
        add(I4);
        add(ITEM4);
        // Buttons Handler
        reg = new JButton("Create Devices");
        add(reg);

        // Action Listen Object
        thehandler handler = new thehandler();
        ITEM1.addActionListener(handler);
        ITEM2.addActionListener(handler);
        ITEM3.addActionListener(handler);
        ITEM4.addActionListener(handler);
        reg.addActionListener(handler);
    }

    // Class that Handle the Events.
    private class thehandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            String string = "";
            String msg = "";

            int Fridges = 0;
            int WashingMachines = 0;
            int Ovens = 0;
            int AirConditions = 0;

            // Storing Amount of Devices in Variables from jTextField
            string = ITEM1.getText();
            Fridges = Integer.parseInt(string);
            string = ITEM2.getText();
            WashingMachines = Integer.parseInt(string);
            string = ITEM3.getText();
            Ovens = Integer.parseInt(string);
            string = ITEM4.getText();
            AirConditions = Integer.parseInt(string);

            // Creating Object Arrays
            Fridge FridgeArray[] = new Fridge[Fridges];
            Oven OvenArray[] = new Oven[Ovens];
            WashingMachine WashingMachineArray[] = new WashingMachine[WashingMachines];
            AirCondition AirConditionArray[] = new AirCondition[AirConditions];


            if(event.getSource() == reg){
                msg = String.format("DEVICES CREATED SUCCESSFULLY!\n\nFridges: %d\nWashingMachines: %d\nOvens: %d\nAirCondition: %d" , Fridges , WashingMachines , Ovens , AirConditions);
                JOptionPane.showMessageDialog(null , msg);

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

                System.out.println("Devices Created and Saved to Arrays Successfully!");


            }

            JFrame f = new JFrame("Devices Created");
            JTextArea area = new JTextArea(Fridge.Devices() + "\n" + WashingMachine.Devices() + "\n" + Oven.Devices() + "\n" + AirCondition.Devices());
            area.setBounds(10 , 30 , 200 , 200);
            f.add(area);
            f.setSize(300 , 300);
            f.setLayout(null);
            f.setVisible(true);


        }

    }
}
