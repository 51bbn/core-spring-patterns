package io.spring2go.corespring.ioc;

public class EventLogWriter implements INotifier {

	public void notify(String message) {
		// д���¼���־
		System.out.println("Write to event log, message : " + message);
	}

}
