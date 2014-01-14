package moneycalculator;

import java.util.Date;

public class ExchangeRate {

    private final Date date;
    private final Currency fromCurrency;
    private final Currency toCurrency;
    private final Number rate;

    public ExchangeRate(Date date, Currency inputCurrency, Currency outputCurrency, Number rate) {
        this.date = date;
        this.fromCurrency = inputCurrency;
        this.toCurrency = outputCurrency;
        this.rate = rate;
    }

    public ExchangeRate(Currency inputCurrency, Currency outputCurrency, Number rate) {
        this.date = new Date();
        this.fromCurrency = inputCurrency;
        this.toCurrency = outputCurrency;
        this.rate = rate;
    }

    public Date getDate() {
        return date;
    }

    public Currency getInputCurrency() {
        return fromCurrency;
    }

    public Currency getOutputCurrency() {
        return toCurrency;
    }

    public Number getRate() {
        return rate;
    }
    
    
    
    
    
    
}
