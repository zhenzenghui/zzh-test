package src.main.java.com.zzh.designpattern.builder;

/**
 * 公寓施工方
 * @author zzh
 * @date 2019/11/21
 */
public class ApartmentBuilder implements Builder {

    private Building apartment;

    public ApartmentBuilder(){
        apartment = new Building();
    }

    @Override
    public void buildBasement() {
        System.out.println("实用公寓，修建地基");
        apartment.setBasement("╚═════════╝\n");
    }

    @Override
    public void buildWall() {
        System.out.println("实用公寓，修建墙体");
        for (int i = 0; i< 8; i++ ){
            apartment.setWall("║ □ □ □ □ ║\n");
        }
    }

    @Override
    public void buildRoof() {
        System.out.println("实用公寓，修建屋顶");
        apartment.setRoof("╔═════════╗\n");
    }

    @Override
    public Building getBuilding() {
        return apartment;
    }
}
