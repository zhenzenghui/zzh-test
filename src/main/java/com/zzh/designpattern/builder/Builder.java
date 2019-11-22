package src.main.java.com.zzh.designpattern.builder;

/**
 * 施工方接口
 * @author zzh
 * @date 2019/11/21
 */
public interface Builder {

    void buildBasement();

    void buildWall();

    void buildRoof();

    Building getBuilding();

}
