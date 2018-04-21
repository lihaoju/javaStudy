package haoju.li.design.factory;

public class AbstractFactory {

    public static void main(String[] args) {
        CarFactory carA = new CarA();
        CarFactory carB = new CarB();

        carA.createEngine().work();
        carA.createAirConditioner().work();

        carB.createEngine().work();
        carB.createAirConditioner().work();
    }
}
