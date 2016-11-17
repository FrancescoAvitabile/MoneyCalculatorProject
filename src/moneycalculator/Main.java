
package moneycalculator;

import moneycalculator.model.Currency;
import moneycalculator.model.Money;

public class Main {

    
    public static void main(String[] args) {
        Currency dolar = new Currency("USD", "Dolar" , "$");
        Money money = new Money(300 , dolar);
        new MainFrame().getMoneyDisplay().display(money);
      
    }
    
}
