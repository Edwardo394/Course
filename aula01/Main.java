package com.timbuchalka.aula01;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Car porsche = new Car();
        Car Holden = new Car();
        porsche.setModel("Carrera");
        System.out.println(porsche.getModel());
        Holden.setModel("Comodore");
        System.out.println(Holden.getModel());


    }
}