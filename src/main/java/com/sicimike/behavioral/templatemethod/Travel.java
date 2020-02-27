package com.sicimike.behavioral.templatemethod;

/**
 * @author sicimike
 * @create 2020-02-27 21:34
 */
public abstract class Travel {

    protected final void travel() {
        planTrip();
        if (needBuyTicket()) {
            buyTicket();
        }
        leave();
    }

    final void planTrip() {
        System.out.println("规划行程...");
    }

    final void buyTicket() {
        System.out.println("买票...");
    }

    final void leave() {
        System.out.println("出发...");
    }

    protected boolean needBuyTicket() {
        return true;
    }

}
