package org.javaturk.oopj.objectdila;

public class Vehicle implements Engine {
    int numberOfSeats;
    int numberOfWheehls;

    public void start(){
        System.out.println("Araç çalışıyor...");

    }
    public void  stop(){
        System.out.println("Araç durdu....");
    }

}
