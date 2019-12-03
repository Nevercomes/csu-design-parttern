package org.csu.dp.exp8;

/**
 * Created by sun on 2019/12/2
 */
public enum TrafficLight {

    GREEN(40) {
        public void lightOn() {
            String out = "Green light on " + getOnTime() + "s";
            System.out.println(out);
        }
    },
    RED {
        public void lightOn() {
            String out = "Red light on " + getOnTime() + "s";
            System.out.println(out);
        }
    },
    YELLOW(5) {
        public void lightOn() {
            String out = "Green light on " + getOnTime() + "s";
            System.out.println(out);
        }
    };

    private int onTime = 25;

    TrafficLight() {
    }

    TrafficLight(int onTime) {
        this.onTime = onTime;
    }

    public abstract void lightOn();

    public int getOnTime() {
        return this.onTime;
    }

}
