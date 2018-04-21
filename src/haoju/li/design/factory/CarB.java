package haoju.li.design.factory;

public class CarB implements CarFactory {
    @Override
    public Engine createEngine() {
        return new EngineDomestic();
    }

    @Override
    public AirConditioner createAirConditioner() {
        return new AirConditionerGree();
    }
}
