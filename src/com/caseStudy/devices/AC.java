package com.caseStudy.devices;

import com.caseStudy.interfaces.BedroomDevice;
import com.caseStudy.interfaces.CorridorDevice;
import com.caseStudy.interfaces.KitchenDevice;
import com.caseStudy.interfaces.LivingRoomDevice;

import java.util.Scanner;

public class AC extends Device implements BedroomDevice, CorridorDevice, LivingRoomDevice, KitchenDevice{
    private float temperature;
    private boolean coolingMode;
    private int fanSpeed;

    public AC(int id, boolean status) {
        super(id, "AC", status);
        this.temperature = 24.0f; // Default temperature
        this.coolingMode = false;
        this.fanSpeed = 1;
    }

    public AC(int id, String name, boolean status, float temperature) {
        super(id, name, status);
        this.temperature = temperature;
        this.coolingMode = false;
        this.fanSpeed = 1;
    }

    public AC() {

    }

    public AC(int i, String ac, boolean b) {
    }

    @Override
    public void controlDevice(String Action) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nAC Control Options:");
            System.out.println("1. Turn ON");
            System.out.println("2. Turn OFF");
            System.out.println("3. Set Temperature");
            System.out.println("4. Toggle Cooling Mode");
            System.out.println("5. Toggle Fan Speed");
            System.out.println("6. Exit AC Control");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> turnOn();
                case 2 -> turnOff();
                case 3 -> setTemperature(sc);
                case 4 -> toggleCoolingMode();
                case 5 -> toggleFanSpeed();
                case 6 -> {
                    System.out.println("Exiting AC Control...");
                    return; // Exits the loop properly
                }
                default -> System.out.println("Invalid choice! Please enter a number between 1 and 6.");
            }
        }
    }

//    protected void setTemperature(Scanner sc) {
//        System.out.print("Enter new temperature (°C): ");
//        float temp = sc.nextFloat(); // Use nextFloat() for float value
//        if (temp < 16 || temp > 30) {
//            System.out.println("Invalid temperature! Please set between 16°C and 30°C.");
//        } else {
//            this.temperature = temp;
//            System.out.println("AC temperature set to " + temperature + "°C.");
//        }
//    }

    private void toggleCoolingMode() {
        coolingMode = !coolingMode;
        System.out.println("Cooling Mode is now " + (coolingMode ? "ON" : "OFF") + ".");
    }

    private void toggleFanSpeed() {
        fanSpeed = (fanSpeed % 3) + 1; // Cycles through 1 → 2 → 3 → 1
        System.out.println("Fan speed set to Level " + fanSpeed);
    }
}
