package moneycalculator;

public class Number {

    private long numerator;
    private long denominator;

    public Number(long numerator, long denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }
    
    
}
