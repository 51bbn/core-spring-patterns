package io.spring2go.corespring.singleton_v2_2;

// ˫�ؼ����������
public class DoubleCheckLockingSingleton {
	private static volatile DoubleCheckLockingSingleton INSTANCE;

	// ˽�й��캯�������ⱻ�ͻ��˴���ʹ��
	private DoubleCheckLockingSingleton() {}

	public static synchronized DoubleCheckLockingSingleton getInstance() {
		if (INSTANCE == null) {
			synchronized (DoubleCheckLockingSingleton.class) {
				// ˫�ؼ��
				if (INSTANCE == null) {
					INSTANCE = new DoubleCheckLockingSingleton();
				}
			}
		}
		return INSTANCE;
	}
}
