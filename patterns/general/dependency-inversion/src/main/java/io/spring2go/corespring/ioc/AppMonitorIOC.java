package io.spring2go.corespring.ioc;

public class AppMonitorIOC {
	// �¼�֪ͨ��
	private INotifier notifier = null;
	
	// Ӧ��������ʱ�÷���������
	public void notify(String message) {
		if (notifier == null) {
			// ������ӿ�ӳ��Ϊ������
			notifier = new EventLogWriter();
		}
		notifier.notify(message);
	}
	
	public static void main(String[] args) {
		AppMonitorIOC appMonitor = new AppMonitorIOC();
		appMonitor.notify("App has a problem ...");
	}
}
