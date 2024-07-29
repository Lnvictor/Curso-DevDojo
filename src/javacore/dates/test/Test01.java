package javacore.dates.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Test01 {
    public static void main(String[] args) {
        Date date = new Date();

        Calendar calendar = Calendar.getInstance();
        Calendar tomorrow = Calendar.getInstance();
        tomorrow.add(Calendar.DAY_OF_MONTH, 2);

        if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
            System.out.println("Hoje e sabado");
        }

        if (tomorrow.after(calendar)) {
            System.out.println("Amanha vem depois do hoje");
        }

        DateFormat[] formats = new DateFormat[5];

        Locale localePtBr = Locale.of("pt", "BR");
        Locale localeUS = Locale.US;
        Locale localeFr = Locale.FRANCE;

        formats[0] = DateFormat.getDateInstance(DateFormat.DEFAULT, localeUS); // default instance
        formats[1] = DateFormat.getDateInstance(DateFormat.SHORT, localeUS); // short instance
        formats[3] = DateFormat.getDateInstance(DateFormat.LONG, localeUS); // long instance
        formats[4] = DateFormat.getDateInstance(DateFormat.FULL, localeUS); // default instance
        formats[2] = DateFormat.getDateInstance(DateFormat.MEDIUM, localeUS); // medium instance


        for (DateFormat format : formats) {
            System.out.println(format.format(tomorrow.getTime()));
            System.out.println(format.format(tomorrow.getTime()));
            System.out.println(format.format(tomorrow.getTime()));
        }

        System.out.println(date);
    }
}
