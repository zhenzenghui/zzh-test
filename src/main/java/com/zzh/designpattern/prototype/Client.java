package src.main.java.com.zzh.designpattern.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 原型（Prototype）模式的定义如下：用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型相同或相似的新对象。在这里，原型实例指定了要创建的对象的种类。用这种方式创建对象非常高效，根本无须知道对象创建的细节。例如，Windows 操作系统的安装通常较耗时，如果复制就快了很多.
 * @author zzh
 * @date 2019/11/19
 */
public class Client {

    public static void main(String[] args) {
        List<EnemyPlane> enemyPlanes = new ArrayList<>();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i<300; i++){
            //EnemyPlane enemyPlane = new EnemyPlane(new Random().nextInt(200));
            EnemyPlane enemyPlane = EnemyPlaneFactory.getInstance(new Random().nextInt(200));
            enemyPlanes.add(enemyPlane);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("总共用时time=" + (endTime-startTime));
    }

}
