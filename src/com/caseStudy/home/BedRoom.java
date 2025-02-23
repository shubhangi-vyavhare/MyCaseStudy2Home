package com.caseStudy.home;

import com.caseStudy.devices.AC;
import com.caseStudy.devices.Device;
import com.caseStudy.devices.Light;
import com.caseStudy.devices.TV;
import com.caseStudy.interfaces.BedroomDevice;
import com.caseStudy.interfaces.KitchenDevice;

import java.util.ArrayList;
import java.util.List;

public class BedRoom extends Room implements BedroomDevice {
    private List<Device> devices = new ArrayList<Device>();

    public BedRoom() {
        this.setName("Bedroom");
    }

    @Override
    public void addDevice(Device device) {
        if (device instanceof BedroomDevice) {
            getDevices().add(device);
        } else {
            System.out.println("Device mismatch error: " + device.getClass().getSimpleName() + " is not a BedroomDevice.");
        }
    }

    @Override
    public String toString() {
        return "BedRoom{" +
                "devices=" + devices +
                '}';
    }
}
