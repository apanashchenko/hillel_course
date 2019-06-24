package lec_5;

public class LengthWeightSpeedConversions {
    public static void main(String[] args) {
        double metersForConvertion = 54.55;
        double inchesForConvertion = 114.55;

        double milesForConvertion = 43.4;
        double kilometresForConvertion = 1098.4;

        double kilogramsForConvertion =0.99;
        double poundsForConvertion = 78.01;

        double kmInHrForConvertion = 3.3;
        double miInHrForConvertion = 90034.3;

        // Result
        System.out.println(metersForConvertion + "m = " + convertMetersToInches(metersForConvertion) + "in");
        System.out.println(inchesForConvertion + "in = " + convertInchesToMeters(inchesForConvertion) + "m");

        System.out.println(milesForConvertion + "mi = " + convertMilesToKilometres(milesForConvertion) + "km");
        System.out.println(kilometresForConvertion + "km = " + convertKilometresToMiles(kilometresForConvertion) + "mi");

        System.out.println(poundsForConvertion + "lb = " + convertPoundsToKilograms(poundsForConvertion) + "kg");
        System.out.println(kilogramsForConvertion + "kg = " + convertKilogramsToPounds(kilogramsForConvertion) + "lb");

        System.out.println(kmInHrForConvertion + "km/hr = " + convertKmInHrToMiInHr(kmInHrForConvertion) + "mi/hr");
        System.out.println(miInHrForConvertion + "mi/hr = " + convertMiInHrToKmInHr(miInHrForConvertion) + "km/hr");
    }

    private static double convertMetersToInches(double metersForConvertion){
        return metersForConvertion / 39.37;
    }

    private static double convertInchesToMeters(double inchesForConvertion){
        return inchesForConvertion * 39.37;
    }

    private static double convertMilesToKilometres(double milesForConvertion) {
        return milesForConvertion / 1.609;
    }

    private static double convertKilometresToMiles(double kilometresForConvertion) {
            return kilometresForConvertion * 1.609;
    }

    private static double convertKilogramsToPounds(double kilogramsForConvertion) {
        return kilogramsForConvertion / 2.2046;
    }

    private static double convertPoundsToKilograms(double poundsForConvertion) {
        return poundsForConvertion * 2.2046;
    }

    private static double convertMiInHrToKmInHr(double miInHrForConvertion) {
        return miInHrForConvertion * 0.6214;
    }

    private static double convertKmInHrToMiInHr(double kmInHrForConvertion) {
        return kmInHrForConvertion / 0.6214;
    }
}