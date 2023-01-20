package common;

import java.util.Calendar;
import java.util.Random;

public class CommonMethods {
    public static Calendar generateDate() {
        Random r = new Random();
        Calendar c = java.util.Calendar.getInstance();
        c.set(java.util.Calendar.MONTH, Math.abs(r.nextInt()) % 12);
        c.set(java.util.Calendar.DAY_OF_MONTH, Math.abs(r.nextInt()) % 30);
        c.setLenient(true);
        return c;
    }
}
