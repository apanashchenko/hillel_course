package lec_7;

public class FractionNumbers {
        private double numerator;
        private double denominator;

        public FractionNumbers(double numerator, double denominator){
            this.numerator = numerator;
            this.denominator = denominator;
        }

    public double sumFractionNumbers(FractionNumbers fractionNumber){
      return (this.numerator * fractionNumber.denominator + fractionNumber.numerator * this.denominator) / (this.denominator * fractionNumber.denominator);
    }

    public double minusFractionNumbers(FractionNumbers fractionNumber){
        return (this.numerator * fractionNumber.denominator - fractionNumber.numerator * this.denominator) / (this.denominator * fractionNumber.denominator);
    }

    public double multiplyFractionNumbers(FractionNumbers fractionNumber){
        return (this.numerator * fractionNumber.numerator) / (this.denominator * fractionNumber.denominator);
    }

    public double devideFractionNumbers(FractionNumbers fractionNumber){
        return (this.numerator * fractionNumber.denominator) / (this.denominator * fractionNumber.numerator);
    }

    @Override
    public String toString() {
        return "FractionNumbers{ numerator = " + numerator + ", denominator = " + denominator + " }";
    }
}

