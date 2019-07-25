package io.spring2go.corespring.singleton_v2_1;

/**
 * 线程安全单例
 */
public class ThreadSafeSingleton {
	private static ThreadSafeSingleton INSTANCE;

	private ThreadSafeSingleton(){}

	// synchronized 性能问题
	public static synchronized ThreadSafeSingleton getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new ThreadSafeSingleton();
		}
		return INSTANCE;
	}
}
