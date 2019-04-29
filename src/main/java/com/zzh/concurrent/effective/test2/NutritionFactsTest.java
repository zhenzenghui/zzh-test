package src.main.java.com.zzh.concurrent.effective.test2;

/**
 * @author zzh
 * @date 2019/4/28
 */
public class NutritionFactsTest {

    public static void main(String[] args) {
        NutritionFacts cocacopla = new NutritionFacts.Builder(240,8).calories(100).carbohydrate(27).sodium(35).build();
        System.out.println(cocacopla.toString());
    }
}
