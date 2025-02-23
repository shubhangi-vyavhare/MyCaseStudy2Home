package com.caseStudy.devices;

import java.util.Scanner;

public abstract class Device {
    static Scanner sc = new Scanner(System.in);
    private int id;
    private String name;
    private boolean status;
  private static int counter = 1;
    public Device(int id, String name, boolean status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public Device() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public abstract void controlDevice(String action);

    void turnOn() {
        System.out.println(name + " is turned ON.");
    }

    // Common method to turn OFF the device
    void turnOff() {
        System.out.println(name + " is turned OFF.");
    }

    // Common method to set temperature
    void setTemperature(Scanner temperature) {
        System.out.println(name + " temperature set to " + temperature + "°C.");
    }


    public static Device selectDevice(){
        System.out.println("Press 1 to add AC");
        System.out.println("Press 2 to add Gyser");
        System.out.println("Press 3 to add Light");
        System.out.println("Press 4 to add MusicPlayer");
        System.out.println("Press 5 to add Refrigerator");
        System.out.println("Press 6 to add TV");

        int deviceChoice = sc.nextInt();
        switch (deviceChoice){
            case 1 -> {
                return new AC(1, false);
            }
            case 2 -> {
                return new Gyser(1, false);
            }
            case 3 -> {
                return new Light(1, false);
            }
            case 4 -> {
                return new MusicPlayer(1, false);
            }
            case 5 -> {
                return new Refrigerator(1, false);
            }
            case 6 -> {
                return new TV(1, false);
            }
        }
        return new Light(1, false);
    }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }


}
