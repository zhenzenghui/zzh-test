package src.main.java.com.zzh.concurrent.effective.test1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zzh
 * @date 2019/4/28
 */
public class Services {

    private Services(){

    }

    private static final Map<String, Provider> providers = new ConcurrentHashMap<>();

    private static final String DEFALT_PROVIDER_NAME = "<def>";

    //Provider registeration API
    public static void registerDefaultProvider(Provider provider){
        registerProvider(DEFALT_PROVIDER_NAME, provider);
    }

    public static void registerProvider(String name, Provider provider){
        providers.put(name, provider);
    }

    //Aervice access API
    public static Service newInstance(){
        return newInstance(DEFALT_PROVIDER_NAME);
    }

    public static Service newInstance(String name){
        Provider provider = providers.get("name");
        if (provider == null){
            throw new IllegalArgumentException("No provider regidtered witgh name: " + name);
        }
        return provider.newService();

    }

}
