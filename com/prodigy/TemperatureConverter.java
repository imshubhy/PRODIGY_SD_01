package com.prodigy;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

              System.out.print("Enter the original unit of measurement (C/F/K): ");
        String unit = scanner.next().toUpperCase();

        switch (unit) {
            case "C":
                convertFromCelsius(temperature);
                break;
            case "F":
                convertFromFahrenheit(temperature);
                break;
            case "K":
                convertFromKelvin(temperature);
                break;
            default:
                System.out.println("Invalid unit of measurement. Please enter C, F, or K.");
        }

        scanner.close();
    }

    private static void convertFromCelsius(double celsius) {
        double fahrenheit = celsiusToFahrenheit(celsius);
        double kelvin = celsiusToKelvin(celsius);
        System.out.printf("%.2f °C is equivalent to %.2f °F and %.2f K%n", celsius, fahrenheit, kelvin);
    }

    private static void convertFromFahrenheit(double fahrenheit) {
        double celsius = fahrenheitToCelsius(fahrenheit);
        double kelvin = fahrenheitToKelvin(fahrenheit);
        System.out.printf("%.2f °F is equivalent to %.2f °C and %.2f K%n", fahrenheit, celsius, kelvin);
    }

    private static void convertFromKelvin(double kelvin) {
        double celsius = kelvinToCelsius(kelvin);
        double fahrenheit = kelvinToFahrenheit(kelvin);
        System.out.printf("%.2f K is equivalent to %.2f °C and %.2f °F%n", kelvin, celsius, fahrenheit);
    }

    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    private static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    private static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    private static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    private static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }
}
