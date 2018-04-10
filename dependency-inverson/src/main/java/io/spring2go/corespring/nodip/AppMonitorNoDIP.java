package io.spring2go.corespring.nodip;

public class AppMonitorNoDIP {

	// �����¼���־д����־ϵͳ
	private EventLogWriter writer = null;
	
	// Ӧ��������ʱ�÷�����������
	public void notify(String message) {
		if (writer == null) {
			writer = new EventLogWriter();
		}
		writer.write(message);
	}
	
	public static void main(String[] args) {
		AppMonitorNoDIP appMonitor = new AppMonitorNoDIP();
		appMonitor.notify("App has a problem ...");
	}
}

class EventLogWriter {
	
	public void write(String message) {
		// д���¼���־
		System.out.println("Write to event log, message : " + message);
	}
}


