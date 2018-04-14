package io.spring2go.corespring.singleton.v3;

// �ȶ�.�շ���
public class BillPughSingleton {
	// ˽�й��캯�������ⱻ�ͻ��˴���ʹ��
	private BillPughSingleton() {}

	private static class LazyHolder {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return LazyHolder.INSTANCE;
	}
}