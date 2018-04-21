package haoju.li.design.factory;

import haoju.li.common.PrintUtils;

public class AirConditionerGree implements AirConditioner {
    @Override
    public void work() {
        PrintUtils.printLn("格力空调");
    }
}
