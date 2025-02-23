package com.caseStudy.home;

import com.caseStudy.devices.AC;
import com.caseStudy.devices.Device;

import java.util.ArrayList;
import java.util.List;

abstract public class Room {
    private int roomNo =0;
    public static int count = 1;
    private String name;
    private int noOfDevices;
    private int noOfONDevices;
    private int noOfOFFDevices;

private List<Device> devices;
    public Room() {
        roomNo = count++;
        this.name = name;
        this.devices = new ArrayList<>();
    }

    public int assignRoomNo(){
        return ++roomNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfDevices() {
        return noOfDevices;
    }

    public void setNoOfDevices(int noOfDevices) {
        this.noOfDevices = noOfDevices;
    }

    public int getNoOfONDevices() {
        return noOfONDevices;
    }

    public void setNoOfONDevices(int noOfONDevices) {
        this.noOfONDevices = noOfONDevices;
    }

    public int getNoOfOFFDevices() {
        return noOfOFFDevices;
    }

    public void setNoOfOFFDevices(int noOfOFFDevices) {
        this.noOfOFFDevices = noOfOFFDevices;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

//    abstract public void addDevice(Device device);

    public void addDevice(Device device) {
        devices.add(device);
    }


    public Device getDeviceByName(String deviceName) {
        for (Device device : devices) {
            if (device.getName().equalsIgnoreCase(deviceName)) {
                return device;
            }
        }
        return null;
    }

    public List<Device> getDevices() {
        return devices;
    }
    @Override
    public String toString() {

                StringBuilder sb = new StringBuilder("Room{" +
                "Room{" +
                "roomNo=" + roomNo +
                ", name='" + name + '\'' +
                ", noOfDevices=" + noOfDevices +
                ", noOfONDevices=" + noOfONDevices +
                ", noOfOFFDevices=" + noOfOFFDevices +
                '}' + "\n");
            sb.append("Devices: ");
        if (devices.isEmpty()) {
            sb.append("No devices added yet.");
        } else {
            for (Device device : devices) {
                sb.append(device.toString()).append(", ");
            }
            sb.setLength(sb.length() - 2); // Remove the last comma
        }

        return sb.toString();
    }
}



