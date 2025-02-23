package com.caseStudy.home;

import java.util.ArrayList;

public class House {
    private ArrayList<Room> rooms = new ArrayList<>();

    public House() {
        rooms.add(new Kitchen());
        rooms.add(new BedRoom());
        rooms.add(new WashRoom());
        rooms.add(new LivingRoom());
        rooms.add(new Corridor());
    }

    public void addRoom(Room room) {
        for (Room r : rooms) {
            if (r.getName().equalsIgnoreCase(room.getName())) {
                System.out.println("Room already exists!");
                return;
            }
        }
        rooms.add(room);
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    @Override
    public String toString() {
        return "House{" +
                "rooms=" + rooms +
                '}';
    }
}