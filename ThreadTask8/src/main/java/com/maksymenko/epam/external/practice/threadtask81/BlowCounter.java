package com.maksymenko.epam.external.practice.threadtask81;

public class BlowCounter extends Thread{
    public void run() {
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
    }
}
