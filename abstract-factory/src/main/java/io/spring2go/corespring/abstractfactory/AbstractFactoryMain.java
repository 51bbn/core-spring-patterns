package io.spring2go.corespring.abstractfactory;

public class AbstractFactoryMain {

	public static void main(String[] args) {

		// ����
		IElectricalFactory electricalFactory = new ChineseElectricalFactory();
		
		IFan fan = electricalFactory.createFan();
		
		fan.swithOn();
		
		// ����
		electricalFactory = new USElectricalFactory();
		
		ITubeLight tubeLight = electricalFactory.createTubeLight();
		tubeLight.swithOn();
		tubeLight.tuneLight();

	}

}
