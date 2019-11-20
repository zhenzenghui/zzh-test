package src.main.java.com.zzh.concurrent.collection_pool_example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.util.concurrent.TimeUnit;

/**
 * @author zzh
 * @date 2019/7/5
 */

/**
 * 由于java.sql.Connection 是一个接口，最终的实现是由数据库驱动提供方式实现的，
 * 考虑到只做一个示例，通过动态代理构造了一个Connection，该Connection的代理实现仅仅是在
 * commit() 方法调用的时候休眠 100ms
 */
public class ConnectionDriver {
    static class ConnectionHandler implements InvocationHandler{

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            if (method.getName().equals("commit")){
                TimeUnit.MILLISECONDS.sleep(100);
            }
            return null;
        }
    }

    //创建一个Connection代理， 在commit的时候休眠100ms  ？？？为什么一直返回 "null"
    public static final Connection createConnection(){
        return (Connection) Proxy.newProxyInstance(ConnectionDriver.class.getClassLoader(), new Class[]{Connection.class}, new ConnectionHandler());
    }

}
