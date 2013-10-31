package moneycalculator;

import java.util.HashSet;

public class CurrencySet extends HashSet <CurrencySet> {
    private static CurrencySet instance;
    private HashSet <Currency>  currencies = new HashSet <>();
    
    private CurrencySet(){
        
    }
    
    public static CurrencySet getInstance(){
        if (CurrencySet.instance == null) instance = new CurrencySet();
        return instance;
    }
    
    public Currency search(Currency currency){
        for (Currency code: currencies){
            if(code.getCode().equals(currency.getCode()))
                return currency;
        }
            return null;
    }
    
}
