package com.company;/*
 * ${Classname}
 * 
 * Version 1.0 
 * 
 * 06.04.2017
 * 
 * Karpikova
 */


public class MessageNSec implements Runnable {

    private Message messageFromAnotherThread;
    private Message messageFromAnotherThread2;

    public MessageNSec(Message m, Message m2, int countSec, String messageToTell){
        this.messageFromAnotherThread = m;
        this.messageFromAnotherThread2 = m2;

    }

    @Override
    public void run() {
        while (true)
        {
            synchronized (messageFromAnotherThread2) {
                System.out.println("MessageNSec has th 2nd object");
                synchronized (messageFromAnotherThread){
                    System.out.println("MessageNSec has th 1st object");
                }
            }
            System.out.println("Done");
        }
    }
}
