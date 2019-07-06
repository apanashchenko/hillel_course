package lec_7;

public class FractionNumbers {
        private double numerator;
        private double denominator;

        public FractionNumbers(double numerator, double denominator){
            this.numerator = numerator;
            this.denominator = denominator;
        }

    public double getDenominator() {
        return denominator;
    }

    public double getNumerator() {
        return numerator;
    }

    public void setDenominator(double denominator) {
        this.denominator = denominator;
    }

    public void setNumerator(double numerator) {
        this.numerator = numerator;
    }

    public double sumFractionNumbers(FractionNumbers fractionNumbers){
      return (this.getNumerator() * fractionNumbers.getDenominator() + fractionNumbers.getNumerator() * this.getDenominator()) / (this.getDenominator() * fractionNumbers.getDenominator());
    }

    public double minusFractionNumbers(FractionNumbers fractionNumbers){
        return (this.getNumerator() * fractionNumbers.getDenominator() - fractionNumbers.getNumerator() * this.getDenominator()) / (this.getDenominator() * fractionNumbers.getDenominator());
    }

    public double multiplyFractionNumbers(FractionNumbers fractionNumbers){
        return (this.getNumerator() * fractionNumbers.getNumerator()) / (this.getDenominator() * fractionNumbers.getDenominator());
    }

    public double devideFractionNumbers(FractionNumbers fractionNumbers){
        return (this.getNumerator() * fractionNumbers.getDenominator()) / (this.getDenominator() * fractionNumbers.getNumerator());
    }

    @Override
    public String toString() {
        return "FractionNumbers{ numerator = " + numerator + ", denominator = " + denominator + " }";
    }
}

