package javacore.dates.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Test03 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        LocalDate localDate = LocalDate.now();


        try {
            Date date = sdf.parse("14/12/1999");
            Date date2 = sdf2.parse("1999-12-14");

            System.out.println(date);
            System.out.println(date2);
            System.out.println(localDate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
