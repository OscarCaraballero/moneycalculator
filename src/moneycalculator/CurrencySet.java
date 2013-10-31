package moneycalculator;

import java.util.HashSet;

public class CurrencySet extends HashSet <CurrencySet> {
    private static CurrencySet instance;
    
    private CurrencySet(){
        
    }
    
    public static CurrencySet getInstance(){
        if (CurrencySet.instance == null) instance = new CurrencySet();
        return instance;
    }
}
