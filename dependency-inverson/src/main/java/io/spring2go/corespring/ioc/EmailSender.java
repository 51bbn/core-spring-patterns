package io.spring2go.corespring.ioc;

public class EmailSender implements INotifier {

	public void notify(String message) {
		// ����Email
		System.out.println("Send email, message : " + message);
	}

}
