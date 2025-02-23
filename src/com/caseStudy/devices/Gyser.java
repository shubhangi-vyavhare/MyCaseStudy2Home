package com.caseStudy.devices;

import com.caseStudy.interfaces.WashRoomDevice;

import java.util.Scanner;

public class Gyser extends Device implements WashRoomDevice {

     private int temperature;

    public Gyser(int id, boolean status) {
        super(id, "Gyser", status);
        this.temperature = 50; // Default temperature
    }

    public Gyser() {

    }

    public Gyser(int i, String gyser, boolean b) {
    }

    @Override
    public void controlDevice(String action) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nGyser Control Options:");
            System.out.println("1. Turn ON Gyser");
            System.out.println("2. Turn OFF Gyser");

            System.out.println("3. Exit Gyser Control");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> turnOn();
                case 2 -> turnOff();
                case 3 -> setTemperature(sc);
                case 4 -> {
                    System.out.println("Exiting Gyser Control...");
                    return; // Exits the loop properly
                }
                default -> System.out.println("Invalid choice! Please enter a number between 1 and 4.");
            }
        }
    }



}
