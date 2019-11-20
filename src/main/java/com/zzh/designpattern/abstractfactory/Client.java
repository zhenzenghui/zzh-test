package src.main.java.com.zzh.designpattern.abstractfactory;

/**
 * 抽象工厂（AbstractFactory）模式的定义：是一种为访问类提供一个创建一组相关或相互依赖对象的接口，且访问类无须指定所要产品的具体类就能得到同族的不同等级的产品的模式结构。
 * 抽象工厂模式是工厂方法模式的升级版本，工厂方法模式只生产一个等级的产品，而抽象工厂模式可生产多个等级的产品。
 *
 * 使用抽象工厂模式一般要满足以下条件。
 * 系统中有多个产品族，每个具体工厂创建同一族但属于不同等级结构的产品。
 * 系统一次只可能消费其中某一族产品，即同族的产品一起使用。
 *
 * 抽象工厂模式除了具有工厂方法模式的优点外，其他主要优点如下。
 * 可以在类的内部对产品族中相关联的多等级产品共同管理，而不必专门引入多个新的类来进行管理。
 * 当增加一个新的产品族时不需要修改原代码，满足开闭原则。
 *
 * 其缺点是：当产品族中需要增加一个新的产品时，所有的工厂类都需要进行修改。
 *
 * 模式的结构与实现
 * 抽象工厂模式同工厂方法模式一样，也是由抽象工厂、具体工厂、抽象产品和具体产品等 4 个要素构成，但抽象工厂中方法个数不同，抽象产品的个数也不同。
 * 模式的结构
 * 抽象工厂模式的主要角色如下。
 * 抽象工厂（Abstract Factory）：提供了创建产品的接口，它包含多个创建产品的方法 newProduct()，可以创建多个不同等级的产品。
 * 具体工厂（Concrete Factory）：主要是实现抽象工厂中的多个抽象方法，完成具体产品的创建。
 * 抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能，抽象工厂模式有多个抽象产品。
 * 具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它 同具体工厂之间是多对一的关系。
 *
 * @author zzh
 * @date 2019/11/20
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("游戏开始");
        System.out.println();

        System.out.println("双方挖矿攒钱");
        System.out.println();

        //第一位玩家选择了人类
        System.out.println("创建人类工厂");
        AbstractFactory factory = new HumanFactory(10,10);

        Unit marines = factory.createLowClass();
        marines.show();

        Unit tank = factory.createMidClass();
        tank.show();

        Unit battlesship = factory.createHighClass();
        battlesship.show();

        System.out.println();
        //第二位玩家选择了外星异族
        System.out.println("创建外星工厂");
        factory = new AlienFactory(20,20);

        Unit roach = factory.createLowClass();
        roach.show();

        Unit spitter = factory.createMidClass();
        spitter.show();

        Unit mammoth = factory.createHighClass();
        mammoth.show();

        System.out.println();
        System.out.println("两族开战。。。");
        System.out.println();

        marines.attack();
        roach.attack();
        spitter.attack();
        tank.attack();
        mammoth.attack();
        battlesship.attack();

    }

}
