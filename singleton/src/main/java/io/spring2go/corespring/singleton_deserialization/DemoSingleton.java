package io.spring2go.corespring.singleton_deserialization;

import java.io.Serializable;

public class DemoSingleton implements Serializable {
	private static final long serialVersionUID = -7604766932017737115L;
    
    private static class LazyHolder{
        private static final DemoSingleton INSTANCE = new DemoSingleton();
    }
    
    public static DemoSingleton getInstance(){
        return LazyHolder.INSTANCE;
    }

    // ȷ�������л�����
    protected Object readResolve() {
    	return getInstance();
    }
}