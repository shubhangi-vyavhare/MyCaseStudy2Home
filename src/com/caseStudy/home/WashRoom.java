package com.caseStudy.home;

import com.caseStudy.devices.Device;
import com.caseStudy.interfaces.WashRoomDevice;

import java.util.ArrayList;
import java.util.List;

public class WashRoom extends Room{
    private List<Device> devices = new ArrayList<Device>();

    public WashRoom() {
        this.setName("Washroom");
    }

    @Override
    public void addDevice(Device device) {
        if (device instanceof WashRoomDevice) {
            getDevices().add(device);
        } else {
            System.out.println("Device mismatch error: " + device.getClass().getSimpleName() + " is not a BedroomDevice.");
        }
    }

    @Override
    public String toString() {
        return "WashRoom{" +
                "devices=" + devices +
                '}';
    }
}
