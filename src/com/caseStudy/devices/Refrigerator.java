package com.caseStudy.devices;

import com.caseStudy.interfaces.KitchenDevice;
import java.util.Scanner;

public class Refrigerator extends Device implements KitchenDevice {
    private int temperature;
    private boolean coolingMode;
    private boolean powerSavingMode;

    public Refrigerator(int id, boolean status) {
        super(id, "Refrigerator", status);
        this.temperature = 5; // Default temperature
        this.coolingMode = false;
        this.powerSavingMode = false;
    }

    public Refrigerator() {

    }

    @Override
    public void controlDevice(String Action) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nRefrigerator Control Options:");
            System.out.println("1. Turn ON Refrigerator");
            System.out.println("2. Turn OFF Refrigerator");
            System.out.println("3. Set Temperature");
            System.out.println("4. Toggle Cooling Mode");
            System.out.println("5. Toggle Power Saving Mode");
            System.out.println("6. Exit Refrigerator Control");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> turnOn();
                case 2 -> turnOff();
                case 3 -> setTemperature(sc);
                case 4 -> toggleCoolingMode();
                case 5 -> togglePowerSavingMode();
                case 6 -> {
                    System.out.println("Exiting Refrigerator Control...");
                    return;
                }
                default -> System.out.println("Invalid choice! Please enter a number between 1 and 6.");
            }
        }
    }

//    private void setTemperature(Scanner sc) {
//        System.out.print("Enter new temperature (°C) [-10 to 10]: ");
//        int temp = sc.nextInt();
//        if (temp < -10 || temp > 10) {
//            System.out.println("Invalid temperature! Please set between -10°C and 10°C.");
//        } else {
//            this.temperature = temp;
//            System.out.println("Refrigerator temperature set to " + temperature + "°C.");
//        }
//    }

    private void toggleCoolingMode() {
        coolingMode = !coolingMode;
        System.out.println("Cooling mode is now " + (coolingMode ? "ON" : "OFF") + ".");
    }

    private void togglePowerSavingMode() {
        powerSavingMode = !powerSavingMode;
        System.out.println("Power Saving Mode is now " + (powerSavingMode ? "ON" : "OFF") + ".");
    }


}
