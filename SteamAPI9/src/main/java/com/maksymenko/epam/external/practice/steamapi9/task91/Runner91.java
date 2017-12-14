package com.maksymenko.epam.external.practice.steamapi9.task91;

import static java.lang.Thread.sleep;

public class Runner91 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for(int i = 10; i >= 0; i--) {
                System.out.println(i);
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("****||||****");
            System.out.println("<---Bomb--->");
            System.out.println("****||||****");
        };


        Thread thread = new Thread(runnable);
        thread.run();
    }
}
