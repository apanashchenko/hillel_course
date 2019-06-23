package lec_5;

public class Conversions {
    public static void main(String[] args) {

        // Convert temperature
        double fahrenheit  = 0.7;
        double celsius = -12.5;

        System.out.println("Convert temperature:");
        System.out.println(celsius + "C = " + convertCelsiusToFahrenheit(celsius) + "F");
        System.out.println(fahrenheit + "F = " + convertFahrenheitToCelsius(fahrenheit) + "C");
        System.out.println(celsius + "C = " + convertCelsiusToKelvin(celsius) + "K");
        System.out.println();


        // Convert length, weight, speed
        double metersForConvertion = 54.55;
        double inchesForConvertion = 114.55;

        double milesForConvertion = 43.4;
        double kilometresForConvertion = 1098.4;

        double kilogramsForConvertion =0.99;
        double poundsForConvertion = 78.01;

        double kmInHrForConvertion = 3.3;
        double miInHrForConvertion = 90034.3;




        double kilometresAfterConvertion = milesForConvertion/1.609;
        double milesAfterConvertion = kilometresForConvertion*1.609;

        double poundsAfterConvertion = kilogramsForConvertion/2.2046;
        double kilogramsAfterConvertion = poundsForConvertion*2.2046;

        double miInHrAfterConvertion = kmInHrForConvertion/0.6214;
        double kmInHrAfterConvertion = miInHrForConvertion*0.6214;

        // Result
        System.out.println("Convert length, weight, speed:");
        System.out.println(metersForConvertion + "m = " + convertMetersToInches(metersForConvertion) + "in");
        System.out.println(inchesForConvertion + "in = " + convertInchesToMeters(inchesForConvertion) + "m");

        System.out.println(milesForConvertion + "mi = " + kilometresAfterConvertion + "km");
        System.out.println(kilometresForConvertion + "km = " + milesAfterConvertion + "mi");

        System.out.println(poundsForConvertion + "lb = " + kilogramsAfterConvertion + "kg");
        System.out.println(kilogramsForConvertion + "kg = " + poundsAfterConvertion + "lb");

        System.out.println(kmInHrForConvertion + "km/hr = " + miInHrAfterConvertion + "mi/hr");
        System.out.println(miInHrForConvertion + "mi/hr = " + kmInHrAfterConvertion + "km/hr");
    }

    private static double convertCelsiusToFahrenheit(double celsius){
        double fahrenheit = celsius *9.0/5.0 +32;
        return fahrenheit;
    }

    private static double convertFahrenheitToCelsius(double fahrenheit){
        double celcius = (fahrenheit - 32)*5.0/9.0;
        return celcius;
    }

    private static double convertCelsiusToKelvin(double celsius){
        double kelvin = celsius + 273.16;
        return kelvin;
    }

    private static double convertMetersToInches(double metersForConvertion){
        return metersForConvertion/39.37;
    }

    private static double convertInchesToMeters(double inchesForConvertion){
        return inchesForConvertion*39.37;
    }

    private static double convertInchesToMeters(double inchesForConvertion){
        return inchesForConvertion*39.37;
    }
}
