package com.company;/*
 * ${Classname}
 * 
 * Version 1.0 
 * 
 * 06.04.2017
 * 
 * Karpikova
 */

import java.util.Date;

public class EverySecond implements Runnable {

    private Message messageToAnotherThread;
    private Message messageToAnotherThread2;

    public EverySecond(Message msg, Message msg2) {

        this.messageToAnotherThread = msg;
        this.messageToAnotherThread2 = msg2;
    }

    @Override
    public void run() {
        while (true){
            synchronized (messageToAnotherThread) {
                System.out.println("EverySec has the 1st object");
                synchronized (messageToAnotherThread2)
                {
                    System.out.println("EverySec has the 2nd object");
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
