package com.caseStudy.devices;

import com.caseStudy.interfaces.BedroomDevice;
import com.caseStudy.interfaces.LivingRoomDevice;

import java.util.Scanner;

public class MusicPlayer extends Device implements BedroomDevice, LivingRoomDevice {
    private int volume;
    private static final int MAX_VOLUME = 100;

    public MusicPlayer(int id, boolean status) {
        super(id, "MusicPlayer", status);
        this.volume = 10;
    }

    public MusicPlayer() {
        super();
    }

    public void increaseVolume() {
        if (volume < MAX_VOLUME) {
            volume++;
            System.out.println(getName() + " volume increased to: " + volume);
        } else {
            System.out.println(getName() + " is at the highest volume.");
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
            System.out.println(getName() + " volume decreased to: " + volume);
        } else {
            System.out.println(getName() + " is already at the lowest volume.");
        }
    }

    @Override
    public void controlDevice(String action) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMusic Player Control Options:");
            System.out.println("1. Turn ON Music Player");
            System.out.println("2. Turn OFF Music Player");
            System.out.println("3. Increase Volume");
            System.out.println("4. Decrease Volume");
            System.out.println("5. Exit Music Player Control");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> turnOn();
                case 2 -> turnOff();
                case 3 -> increaseVolume();
                case 4 -> decreaseVolume();
                case 5 -> {
                    System.out.println("Exiting Music Player Control...");
                    return;
                }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
