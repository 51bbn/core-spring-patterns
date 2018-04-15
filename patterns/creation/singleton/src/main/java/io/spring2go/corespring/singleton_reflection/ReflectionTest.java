package io.spring2go.corespring.singleton_reflection;

import java.lang.reflect.Constructor;

public class ReflectionTest {

	public static void main(String[] args) {
		ReflectionSingleton instanceOne = ReflectionSingleton.getInstance();
		ReflectionSingleton instanceTwo = null;
		try {
			Constructor constructor = ReflectionSingleton.class.getDeclaredConstructor();
			// ����Ĵ������Ƶ���
			constructor.setAccessible(true);
			// �����ڶ���ʵ��
			instanceTwo = (ReflectionSingleton) constructor.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
	}
}