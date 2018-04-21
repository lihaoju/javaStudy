package haoju.li.design.factory;

import haoju.li.common.PrintUtils;

public class Circle implements Shape {
    @Override
    public void draw() {
        PrintUtils.printLn("Circle");
    }
}
