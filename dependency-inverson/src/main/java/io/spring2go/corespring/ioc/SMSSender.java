package io.spring2go.corespring.ioc;

public class SMSSender implements INotifier {

	public void notify(String message) {
		// ���Ͷ���Ϣ
		System.out.println("Send SMS, message : " + message);
	}
}
