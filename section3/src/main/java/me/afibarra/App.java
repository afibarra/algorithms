package me.afibarra;

import java.time.LocalTime;

/**
 * Simple main application
 */
public class App {

    public static void main(String[] args) {

        for (int j = 0; j < 3; j++) {
            long t1 = LocalTime.now().toNanoOfDay();

            long h = 0L;
            for (long i = 0; i < 20_000_000_000L; i++) {
                h++;
            }

            long t2 = LocalTime.now().toNanoOfDay();

            System.out.println(LocalTime.ofNanoOfDay(t2 - t1).toString());
        }
    }

}
