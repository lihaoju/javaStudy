package haoju.li.design.factory;

import static haoju.li.common.PrintUtils.printLn;

public class EngineDomestic implements Engine {
    @Override
    public void work() {
        printLn("国产发动机");
    }
}
