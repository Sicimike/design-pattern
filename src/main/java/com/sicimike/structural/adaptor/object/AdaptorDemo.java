package com.sicimike.structural.adaptor.object;

/**
 * @author sicimike
 * @create 2020-02-25 21:56
 */
public class AdaptorDemo {

    public static void main(String[] args) {
        Target target = new TargetAdaptor();
        target.especialDisplay();
    }

}
