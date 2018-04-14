package io.spring2go.corespring.singleton_v1;

// ��ǰ��ʼ������
public class EagerSingleton {
	private static final EagerSingleton INSTANCE = new EagerSingleton();

	// ˽�й��캯�������ⱻ�ͻ��˴���ʹ��
	private EagerSingleton() {}

	public static EagerSingleton getInstance() {
		return INSTANCE;
	}
}
