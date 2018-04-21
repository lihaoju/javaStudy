package haoju.li.design.factory;

import haoju.li.common.PrintUtils;

public class AirConditionerHaier implements AirConditioner {

    @Override
    public void work() {
        PrintUtils.printLn("海尔空调");
    }
}
