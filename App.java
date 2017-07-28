

import java.util.*;
import java.io.IOException;
import java.math.*;

public class App
{
    public static void main(String[] args) throws Exception
    {
        ExchangeRates exchange = new ExchangeRates();
    	for(int i = 0; i< 10; i++) {
    	    try {
    			// get the ticker map
    	        Map<String, Currency> ticker = exchange.getTicker();
    	        BigDecimal BTCUSDsell = ticker.get("USD").getSell();

    	        // convert 5362 EUR to BTC
    	        BigDecimal EURToBTC = exchange.toBTC("EUR", new BigDecimal(53620));

    	        // convert 100,000,000 satoshi to USD
    	        BigDecimal BTCToUSD = exchange.toFiat("USD", new BigDecimal(1));
    	        System.out.println(BTCUSDsell + " " + EURToBTC + " " + BTCToUSD);
    	        
    	        
    	        //sending the actual Thread of execution to sleep X milliseconds
    	        Thread.sleep(3000);
    	    } catch(InterruptedException ie) {}

    	}

    }
}