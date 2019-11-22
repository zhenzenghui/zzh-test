package src.main.java.com.zzh.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 建筑物
 * @author zzh
 * @date 2019/11/21
 */
public class Building {

    //模仿房子组件的堆叠
    List<String> buildingComponents = new ArrayList<>();

    //地基
    public void setBasement(String basement){
        this.buildingComponents.add(basement);
    }

    //墙体
    public void setWall(String wall){
        this.buildingComponents.add(wall);
    }

    //屋顶
    public void setRoof(String roof){
        this.buildingComponents.add(roof);
    }

    @Override
    public String toString() {
        String buildingStr = "";
        for (int i=buildingComponents.size()-1; i>=0; i--) {
            buildingStr += buildingComponents.get(i);
        }
        return buildingStr;
    }
}
