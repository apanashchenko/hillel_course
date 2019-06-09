package lec_2;

public class GeneralTask {
    public static void main(String[] args) {

        // Convert temperature
        double fahrenheit  = 0.7;
        double celsius = -12.5;

        System.out.println("Convert temperature:");
        System.out.println(celsius + "C = " + ConvertCelsiusToFahrenheit(celsius) + "F");
        System.out.println(fahrenheit + "F = " + ConvertFahrenheitToCelsius(fahrenheit) + "C");
        System.out.println(celsius + "C = " + ConvertCelsiusToKelvin(celsius) + "K");
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

        // Formulas
        double inchesAfterConvertion = metersForConvertion/39.37;
        double metersAfterConvertion = inchesForConvertion*39.37;

        double kilometresAfterConvertion = milesForConvertion/1.609;
        double milesAfterConvertion = kilometresForConvertion*1.609;

        double poundsAfterConvertion = kilogramsForConvertion/2.2046;
        double kilogramsAfterConvertion = poundsForConvertion*2.2046;

        double miInHrAfterConvertion = kmInHrForConvertion/0.6214;
        double kmInHrAfterConvertion = miInHrForConvertion*0.6214;

        // Result
        System.out.println("Convert length, weight, speed:");
        System.out.println(metersForConvertion + "m = " + inchesAfterConvertion + "in");
        System.out.println(inchesForConvertion + "in = " + metersAfterConvertion + "m");

        System.out.println(milesForConvertion + "mi = " + kilometresAfterConvertion + "km");
        System.out.println(kilometresForConvertion + "km = " + milesAfterConvertion + "mi");

        System.out.println(poundsForConvertion + "lb = " + kilogramsAfterConvertion + "kg");
        System.out.println(kilogramsForConvertion + "kg = " + poundsAfterConvertion + "lb");

        System.out.println(kmInHrForConvertion + "km/hr = " + miInHrAfterConvertion + "mi/hr");
        System.out.println(miInHrForConvertion + "mi/hr = " + kmInHrAfterConvertion + "km/hr");
    }

    private static double ConvertCelsiusToFahrenheit(double celsius){
        double fahrenheit = celsius *9/5 +32;
        return fahrenheit;
    }

    private static double ConvertFahrenheitToCelsius(double fahrenheit){
        double celcius = (fahrenheit - 32)*5/9;
        return celcius;
    }

    private static double ConvertCelsiusToKelvin(double celsius){
        double kelvin = celsius + 273.16;
        return kelvin;
    }
}
