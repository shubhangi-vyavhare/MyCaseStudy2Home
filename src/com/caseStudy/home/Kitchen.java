package com.caseStudy.home;

import com.caseStudy.devices.Device;
import com.caseStudy.devices.Gyser;
import com.caseStudy.devices.Refrigerator;
import com.caseStudy.interfaces.KitchenDevice;

import java.util.ArrayList;
import java.util.List;

public class Kitchen extends Room implements KitchenDevice {
    private List<Device> devices = new ArrayList<>();

    public Kitchen() {
        this.setName("Kitchen");
    }

    @Override
    public void addDevice(Device device) {
        if (device instanceof KitchenDevice) {
            getDevices().add(device);
        } else {
            System.out.println("Device mismatch error: " + device.getClass().getSimpleName() + " is not a BedroomDevice.");
        }
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "devices=" + devices +
                '}';
    }
}
