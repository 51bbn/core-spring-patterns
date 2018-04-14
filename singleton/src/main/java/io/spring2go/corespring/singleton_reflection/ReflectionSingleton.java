package io.spring2go.corespring.singleton_reflection;

public class ReflectionSingleton {
	private static ReflectionSingleton INSTANCE;

    private ReflectionSingleton() {
    	//throw new InstantiationError("����ͨ�����䴴������");
    }
    
	public static synchronized ReflectionSingleton getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new ReflectionSingleton();
		}
		return INSTANCE;
	}
}