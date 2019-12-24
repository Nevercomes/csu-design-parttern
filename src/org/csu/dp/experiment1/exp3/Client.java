package org.csu.dp.experiment1.exp3;

/**
 * Created by sun on 2019/11/26
 */
public class Client {

    public static void main(String[] args) {
        Shape shape = null;
        try {
            shape = ShapeFactory.createShape("Circle");
            shape.draw();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            shape = ShapeFactory.createShape("None");
            shape.draw();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
