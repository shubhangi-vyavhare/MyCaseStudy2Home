package com.caseStudy.devices;


import com.caseStudy.interfaces.BedroomDevice;
import com.caseStudy.interfaces.LivingRoomDevice;

import java.util.Scanner;

public class TV extends Device implements BedroomDevice, LivingRoomDevice {
    private int volume;
    private int channel;
    private static final int MAX_VOLUME = 100;

    public TV(int id, boolean status) {
        super(id, "TV", status);
        this.volume = 10; // Default volume
        this.channel = 1;
    }

    public TV() {

    }

    public void changeChannel(int newChannel) {
        if (newChannel > 0) {
            this.channel = newChannel;
            System.out.println(getName() + " channel changed to: " + channel);
        } else {
            System.out.println("Invalid channel number.");
        }
    }

    public void increaseVolume() {
        if (volume < MAX_VOLUME) {
            volume++;
            System.out.println(getName() + " volume increased to: " + volume);
        } else {
            System.out.println("Your volume is at the highest level.");
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
            System.out.println(getName() + " volume decreased to: " + volume);
        } else {
            System.out.println(getName() + " volume is already at the lowest level.");
        }
    }
    @Override
    public void controlDevice(String action) {
        switch (action.toLowerCase()) {
            case "on":
                turnOn();
                break;
            case "off":
                turnOff();
                break;
            case "increase volume":
                increaseVolume();
                break;
            case "decrease volume":
                decreaseVolume();
                break;
            case "change channel":
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter new channel number: ");
                int newChannel = sc.nextInt();
                changeChannel(newChannel);
                break;
            default:
                System.out.println("Invalid action for " + getName());
        }
    }

}
