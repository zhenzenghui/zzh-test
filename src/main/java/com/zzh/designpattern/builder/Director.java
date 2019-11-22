package src.main.java.com.zzh.designpattern.builder;

/**
 * 工程监理
 * @author zzh
 * @date 2019/11/21
 */
public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void setBuilder(Builder builder){
        this.builder = builder;
    }

    public Building direct(){
        System.out.println("工程项目启动。。。。");
        //第一步 地基
        builder.buildBasement();
        //第二步 墙体
        builder.buildWall();
        //第三步 屋顶
        builder.buildRoof();
        System.out.println("工程项目结束。。。。");

        return builder.getBuilding();
    }

}
