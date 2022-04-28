package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext cob=new ClassPathXmlApplicationContext("spring.xml");
		Mobile mobobj=(Mobile) cob.getBean("mob");
		mobobj.mobileFunction();

	}

}
