package com.programwind.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMainApp {
	
	public static void main(String[] args) {
		//load config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//extract the engineer object
		Engineer eng=context.getBean("engineer",Engineer.class);
		
		//invoke the method
		System.out.println(eng.work());
		
		//close the context
		context.close();
	}

}
