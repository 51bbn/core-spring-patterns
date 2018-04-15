package io.spring2go.corespring.singleton_v1_1;

// ��̬���ʼ������
public class StaticBlockSingleton {
	private static final StaticBlockSingleton INSTANCE;

	// ˽�й��캯�������ⱻ�ͻ��˴���ʹ��
	private StaticBlockSingleton() {}

	static {
		try {
			INSTANCE = new StaticBlockSingleton();
		} catch (Exception e) { // �쳣����
			throw new RuntimeException("Uffff, i was not expecting this!", e);
		}
	}

	public static StaticBlockSingleton getInstance() {
		return INSTANCE;
	}
}
