package org.csu.dp.experiment1.exp8;

/**
 * Created by sun on 2019/12/2
 */
public class Client {

    public static void main(String[] args) {
        TrafficLight red = TrafficLight.RED;
        red.lightOn();
        TrafficLight red1 = TrafficLight.RED;
        System.out.println(red == red1);
        TrafficLight yellow = TrafficLight.YELLOW;
        yellow.lightOn();
        TrafficLight green = TrafficLight.GREEN;
        green.lightOn();
    }

}
