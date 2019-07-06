package lec_7;

public class FractionNumbers {
        private double numerator;
        private double denominator;

        public FractionNumbers(double numerator, double denominator){
            this.numerator = numerator;
            this.denominator = denominator;
        }

    public double sumFractionNumbers(FractionNumbers fractionNumbers){
      return (this.numerator * fractionNumbers.denominator + fractionNumbers.numerator * this.denominator) / (this.denominator * fractionNumbers.denominator);
    }

    public double minusFractionNumbers(FractionNumbers fractionNumbers){
        return (this.numerator * fractionNumbers.denominator - fractionNumbers.numerator * this.denominator) / (this.denominator * fractionNumbers.denominator);
    }

    public double multiplyFractionNumbers(FractionNumbers fractionNumbers){
        return (this.numerator * fractionNumbers.numerator) / (this.denominator * fractionNumbers.denominator);
    }

    public double devideFractionNumbers(FractionNumbers fractionNumbers){
        return (this.numerator * fractionNumbers.denominator) / (this.denominator * fractionNumbers.numerator);
    }

    @Override
    public String toString() {
        return "FractionNumbers{ numerator = " + numerator + ", denominator = " + denominator + " }";
    }
}

