package io.spring2go.corespring.singleton_v1;

/**
 * 提前初始化单例
 */
public class EagerSingleton {
	// 静态提前加载
	private static final EagerSingleton INSTANCE = new EagerSingleton();
	// 私有构造函数，避免被客户端代码使用
	private EagerSingleton() {}

	// 获取单例入口
	public static EagerSingleton getInstance() {
		return INSTANCE;
	}
}
