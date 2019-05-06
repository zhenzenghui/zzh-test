package src.main.java.com.zzh.test.enumTest;

/**
 * @author zzh
 * @date 2019/4/28
 */
public class Test3 {

    public static void main(String[] args) {

        double surfaceWeight = Planet.EARTH.getSurfaceWeight(Planet.EARTH.getMass());
        System.out.println(surfaceWeight);

        Planet[] values = Planet.values();
        for (int i=0; i<values.length; i++){
            System.out.println(values[i]);
        }
    }




}

enum Planet{

    MERCURY(3.302, 2.439),
    VENUS(3.302, 2.439),
    EARTH(3.302, 2.439),
    MARS(3.302, 2.439);

    private final double mass;
    private final double radius;
    private final double surfaceGravity;

    private static final double G = 6.673;

    Planet(double mass, double radius){
        this.mass = mass;
        this.radius = radius;
        surfaceGravity = G * mass / (radius*radius);
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public double getSurfaceGravity() {
        return surfaceGravity;
    }

    public double getSurfaceWeight(double mass){
        return mass * surfaceGravity;
     }
}