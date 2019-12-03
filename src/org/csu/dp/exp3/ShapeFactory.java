package org.csu.dp.exp3;

/**
 * Created by sun on 2019/11/26
 */
public class ShapeFactory {

    public static Shape createShape(String type) throws ClassNotFoundException {
        Shape shape = null;
        if (type.equals("Circle")) {
            shape = new Circle();
        } else if (type.equals("Triangle")) {
            shape = new Triangle();
        } else if (type.equals("Rectangle")) {
            shape = new Rectangle();
        } else {
            throw new ClassNotFoundException();
        }
        return shape;
    }

}
