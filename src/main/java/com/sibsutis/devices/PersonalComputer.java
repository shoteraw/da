package com.sibsutis.devices;

public class PersonalComputer extends Device {

    public PersonalComputer(int id, int price) {
        super(id, price, null);
    }

    public PersonalComputer(int id, int price, String ip) {
        super(id, price, ip);
    }

    @Override
    public String getDeviceType() {
        return "PersonalComputer";
    }
}
