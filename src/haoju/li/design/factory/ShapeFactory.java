package haoju.li.design.factory;

import haoju.li.common.PrintUtils;

/**
 * 工厂模式
 */
public class ShapeFactory {

    public Shape createFactory(Integer type) {
        if(null == type) {
            return null;
        }
        if(type == 1) {
            return new Square();
        } else if(type == 2) {
            return new Circle();
        }
        return null;
    }

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.createFactory(1);
        PrintUtils.printLn(shape1.getClass());
        shape1.draw();

        Shape shape2 = shapeFactory.createFactory(2);
        PrintUtils.printLn(shape2.getClass());
        shape2.draw();
    }
}
