package io.spring2go.corespring.singleton_v2_2;

/**
 * 双重检查锁定单例
 */
public class DoubleCheckLockingSingleton {

	// 注意 volatile 关键字
	private static volatile DoubleCheckLockingSingleton INSTANCE;

	// 私有构造函数，避免被客户端代码使用
	private DoubleCheckLockingSingleton() {}

	// 解决性能问题
	public static DoubleCheckLockingSingleton getInstance() {
		if (INSTANCE == null) {
			synchronized (DoubleCheckLockingSingleton.class) {
				// 双重检查
				if (INSTANCE == null) {
					INSTANCE = new DoubleCheckLockingSingleton();
				}
			}
		}
		return INSTANCE;
	}
}
