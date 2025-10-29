package com.sibsutis.devices;

import com.sibsutis.Printable;
import java.util.Objects;

public abstract class Device implements Printable {
    private int id;          // уникальный идентификатор устройства
    private int price;       // стоимость устройства
    private String ip;       // ip адрес устройства (может быть null)

    public Device(int id, int price, String ip) {
        this.id = id;
        this.price = price;
        this.ip = ip;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getIp() {
        return ip;
    }

    @Override
    public String print() {
        return String.format("Device{id=%d, price=%d, ip='%s', type=%s}",
                id, price, ip, getDeviceType());
    }

    // Абстрактный метод для возврата типа устройства
    public abstract String getDeviceType();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Device)) return false;
        Device device = (Device) o;
        return id == device.id && price == device.price &&
                Objects.equals(ip, device.ip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, ip);
    }
}
