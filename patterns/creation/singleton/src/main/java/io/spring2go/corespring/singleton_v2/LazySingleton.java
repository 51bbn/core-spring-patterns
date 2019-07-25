package io.spring2go.corespring.singleton_v2;

/**
 * 延迟初始化单例
 */
public class LazySingleton {
    private static LazySingleton INSTANCE;
    
    private LazySingleton(){}

    // 只有在访问的时候，才会初始化
    // 多线程下不安全
    public static LazySingleton getInstance(){
        // 延迟加载
        if(INSTANCE == null){
        	INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }
}
