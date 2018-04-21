package haoju.li.design.factory;


import static haoju.li.common.PrintUtils.printLn;

public class EngineImport implements Engine {
    @Override
    public void work() {
        printLn("进口发动机");
    }
}
