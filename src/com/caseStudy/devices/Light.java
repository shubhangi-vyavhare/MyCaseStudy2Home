package com.caseStudy.devices;

import com.caseStudy.interfaces.*;

import java.util.Scanner;

public class Light extends Device implements KitchenDevice, WashRoomDevice, CorridorDevice, BedroomDevice, LivingRoomDevice {
    public Light(int id, boolean status) {
        super(id, "Light", status);
    }

    public Light() {

    }

    public Light(int i, String light, boolean b) {
    }

    @Override
    public void controlDevice(String action) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Light Control Options:");
            System.out.println("1. Turn ON Light");
            System.out.println("2. Turn OFF Light");
            System.out.println("3. Exit Light Control");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> turnOn();
                case 2 -> turnOff();
                case 3 -> {
                    System.out.println("Exiting Light Control...");
                    return;  // Loop exit
                }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
