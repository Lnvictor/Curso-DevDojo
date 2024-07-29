package javacore.dates.test;

import java.text.NumberFormat;
import java.util.Locale;

public class Test02 {
    public static void main(String[] args) {
        Locale locale = Locale.US;
        NumberFormat nf = NumberFormat.getInstance(locale);
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);


        System.out.println(currencyFormat.getCurrency().getSymbol(locale));
        System.out.println(nf.format(1_000.23));
        System.out.println(currencyFormat.format(2_000.0));
    }
}
