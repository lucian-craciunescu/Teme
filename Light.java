package org.example;

public class Light {
    private boolean isOn;
    private int brightness;

    public Light() {
        isOn = false;
        brightness = 0;
    }
    public void turnOn() {
        isOn = true;
        brightness = 50;
        System.out.println("Light is ON");
    }
    public void turnOff() {
        isOn = false;
        brightness = 0;
        System.out.println("Light is OFF");
    }
    public void dim() {
        if (isOn) {
            brightness -= 10;
            if(brightness < 0) brightness = 0;
            System.out.println("Light is dim to " + brightness + "%,");
        } else {
            System.out.println("Cant't dim - light is off.");
            }
        }
        public void brighten() {
        if (isOn) {
            brightness += 10;
            if(brightness > 100) brightness = 100;
            System.out.println("Light is brighten to " + brightness + "%,");
        } else {
            System.out.println("Cant't brighten - light is off.");
        }
        }
        public static void main(String[] args) {
        Light light = new Light();
        light.turnOn();
        light.brighten();
        light.dim();
        light.turnOff();
        }
}
