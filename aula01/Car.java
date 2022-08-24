package com.timbuchalka.aula01;

public class Car {
//public means unrestricted access to the class

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    //method to be allowed to modify the model
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("comodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel(){
        return this.model;
    }
}
