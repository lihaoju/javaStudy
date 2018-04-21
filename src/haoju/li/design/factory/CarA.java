package haoju.li.design.factory;

public class CarA implements CarFactory {
    @Override
    public Engine createEngine() {
        return new EngineImport();
    }

    @Override
    public AirConditioner createAirConditioner() {
        return new AirConditionerHaier();
    }
}
