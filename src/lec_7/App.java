package lec_7;

public class App {
    public static void main(String[] args) {
        FractionNumbers fractionNumber1 = new FractionNumbers(4,5);
        FractionNumbers fractionNumber2 = new FractionNumbers(3,4);

        System.out.println(fractionNumber1.sumFractionNumbers(fractionNumber2));
        System.out.println(fractionNumber1.minusFractionNumbers(fractionNumber2));
        System.out.println(fractionNumber1.multiplyFractionNumbers(fractionNumber2));
        System.out.println(fractionNumber1.devideFractionNumbers(fractionNumber2));

        System.out.println(fractionNumber1.toString());
        System.out.println(fractionNumber2.toString());
    }
}
