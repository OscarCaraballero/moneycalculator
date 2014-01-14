package moneycalculator;

public class Number {

    private long numerator;
    private long denominator;

    public Number(long numerator, long denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }
    
    public Number(long number){
        this(number, 1);
    }
    
    public Number (double number){
        numerator = (long) number;
        denominator = 1;
        while (numerator != denominator * number){
            denominator = denominator * 10;
            numerator = (long)(number * denominator);
        }
        simplify();
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }
    
    private void simplify(){
        PrimeCollection prime = new PrimeCollection();
        for (long value : prime) {
            while(isDivisible(value)){
            this.numerator = this.numerator / value;
            this.denominator = this.denominator / value;
            }
            if (value > 10000) break;
        }
        
    }

    private boolean isDivisible(long prime) {
        return ((numerator % prime) == 0) && ((denominator % prime) == 0);
    }
    
    
}
