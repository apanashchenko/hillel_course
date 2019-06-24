package lec_5;

public class TemperatureConversions{
    public static void main(String[] args) {
        double fahrenheit  = 0.7;
        double celsius = -12.5;

        System.out.println(celsius + "C = " + convertCelsiusToFahrenheit(celsius) + "F");
        System.out.println(fahrenheit + "F = " + convertFahrenheitToCelsius(fahrenheit) + "C");
        System.out.println(celsius + "C = " + convertCelsiusToKelvin(celsius) + "K");
        System.out.println();
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
}