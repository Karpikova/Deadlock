package com.company;

public class Main {

    public static void main(String[] args) {
        Message msg = new Message(0);
        Message msg2 = new Message(0);

        EverySecond everySecond = new EverySecond(msg, msg2);
        Thread everySecondThread = new Thread(everySecond);
        everySecondThread.start();

        MessageNSec messageFiveSec = new MessageNSec(msg, msg2, 5, "Долгожданный message");
        Thread messageFiveSecThread = new Thread(messageFiveSec);
        messageFiveSecThread.start();

    }
}
