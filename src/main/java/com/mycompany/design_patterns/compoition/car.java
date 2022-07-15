/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.design_patterns.compoition;

/**
 *
 * @author hp
 */
public class car {
    private String color;
    private int maxSpeed;
  

    public String carDetails() {
        return "car{" + "color=" + color + ", maxSpeed=" + maxSpeed + '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    
     
}
