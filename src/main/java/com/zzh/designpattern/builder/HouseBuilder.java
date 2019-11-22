package src.main.java.com.zzh.designpattern.builder;

/**
 * 高端别墅施工方
 * @author zzh
 * @date 2019/11/21
 */
public class HouseBuilder implements Builder {

    private Building house;

    public HouseBuilder(){
        house = new Building();
    }

    @Override
    public void buildBasement() {
        System.out.println("高端别墅，建造地基，搭建围墙、花园");
        house.setBasement("╬╬╬╬╬╬╬╬╬╬╬\n");
    }

    @Override
    public void buildWall() {
        System.out.println("高端别墅，搭建墙体，粉刷，装饰");
        house.setWall("｜田｜田 田|\n");
    }

    @Override
    public void buildRoof() {
        System.out.println("高端别墅，搭建屋顶，粉刷，装阁楼");
        house.setRoof(" ╱◥███████◣\n");
    }

    @Override
    public Building getBuilding() {
        return house;
    }
}
