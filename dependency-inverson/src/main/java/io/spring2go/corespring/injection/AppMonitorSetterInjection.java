package io.spring2go.corespring.injection;

import io.spring2go.corespring.ioc.EventLogWriter;
import io.spring2go.corespring.ioc.INotifier;

public class AppMonitorSetterInjection {
	// �¼�֪ͨ��
	private INotifier notifier = null;
	
	public void SetNotifier(INotifier notifier) {
		this.notifier = notifier;
	}
	
	// Ӧ��������ʱ�÷���������
	public void notify(String message) {
		notifier.notify(message);
	}
	
	public static void main(String[] args) {
		EventLogWriter writer = new EventLogWriter();
		AppMonitorSetterInjection monitor = 
				new AppMonitorSetterInjection();
		// ������������������
		monitor.SetNotifier(writer);
		// �������������е���
		monitor.notify("App has a problem ...");
	}
}
