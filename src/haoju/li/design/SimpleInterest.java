package haoju.li.design;

/**
 * 单利模式学习
 */
public class SimpleInterest {

    private static SimpleInterest simpleInterest = new SimpleInterest();

    private SimpleInterest() {

    }

    private Integer i;

    public static SimpleInterest getSimpleInterest() {
        return simpleInterest;
    }

    public void add() {
        if(null == i) {
            i = 0;
        }
        i++;
    }

    public Integer getI() {
        return null == i ? 0 : i;
    }

    public static void main(String[] args) {
        SimpleInterest simpleInterest1 = SimpleInterest.getSimpleInterest();
        System.out.println(simpleInterest1.getI());
        simpleInterest1.add();
        System.out.println(simpleInterest1.getI());
        SimpleInterest simpleInterest2 = SimpleInterest.getSimpleInterest();
        System.out.println(simpleInterest2.getI());
        simpleInterest2.add();
        System.out.println(simpleInterest2.getI());
        System.out.println(simpleInterest2 == simpleInterest1);
    }
}
