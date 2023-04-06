//Make the Currency converter program where Nepali rupees are converted to the USD.
//Take the currency difference as 1 USD = 135.03 for conversation.

package CurrencyConverter;
public class Converter {
    public void convertUSD(double npr){
        double rate =  135.03;
        double currency = npr / rate;
        System.out.printf("%.2f US Dollar is equivalent to %.2f Nepali Rupees", currency, npr);
    }
}
