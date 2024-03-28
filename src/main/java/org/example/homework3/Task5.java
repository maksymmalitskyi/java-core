package org.example.homework3;

public class Task5 {
    public static void main(String[] args) {

        double fahrenheit;
        float celsius;
        double kelvin;
        celsius = 55;
        fahrenheit = ((celsius * 9) / 5) + 32; //Т (° F) = Т (° C) × 9/5 + 32
        System.out.println("Temperature in fahrenheit is: " + fahrenheit);


        kelvin = celsius + 273.15; //T (K) = T (° C) + 273,15
        System.out.println("Temperature in kelvin is: " + kelvin);
    }
}
