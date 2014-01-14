package moneycalculator;

import java.util.Iterator;

public class PrimeCollection implements Iterable<Long> {

    private long number = 1;
    
    @Override
    public Iterator<Long> iterator() {
        
        return new Iterator<Long>(){

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Long next() {
                return calculateNextPrime(number);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            private Long calculateNextPrime(long number) {
                while (true){
                    number++;
                    if (isPrime(number)) return number;
                }
            }

            private boolean isPrime(long number) {
                for (long i = 2; i < number; i++) {
                    if (number % i == 0 ) return false; 
                    
                }
                return true;
            }
            
        };
        
    }
    

}
