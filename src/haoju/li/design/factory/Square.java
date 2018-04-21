package haoju.li.design.factory;

import haoju.li.common.PrintUtils;

public class Square implements Shape {
    @Override
    public void draw() {
        PrintUtils.printLn("Square");
    }
}
