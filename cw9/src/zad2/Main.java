package zad2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ElectronicDevice> electronicDevices = new ArrayList<>();
        electronicDevices.add(new Smartphone("Samsung", "Galaxy S23", 2023));
        electronicDevices.add(new Laptop("ASUS", "Vivobook S15", 2021));
        electronicDevices.add(new Television("TLC", "UE550041", 2022));
        electronicDevices.add(new Laptop("Apple", "Macbook M1", 2020));
        electronicDevices.add(new Smartphone("Apple", "iPhone 15 Pro", 2023));

        for (int i = 0; i < electronicDevices.size(); i++) {
            electronicDevices.get(i).turnOn();
            electronicDevices.get(i).turnOn();
        }
    }
}