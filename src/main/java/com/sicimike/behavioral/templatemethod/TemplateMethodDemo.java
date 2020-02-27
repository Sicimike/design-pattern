package com.sicimike.behavioral.templatemethod;

/**
 * @author sicimike
 * @create 2020-02-27 21:41
 */
public class TemplateMethodDemo {

    public static void main(String[] args) {
        Travel travel = new AirplaneTravel();
        travel.travel();

        travel = new CarTravel();
        travel.travel();
    }
}
