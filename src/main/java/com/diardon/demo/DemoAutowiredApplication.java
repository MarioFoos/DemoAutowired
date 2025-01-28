package com.diardon.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoAutowiredApplication
{
	public static void main(String[] args)
	{
		ApplicationContext context = SpringApplication.run(DemoAutowiredApplication.class, args);
        MyService1 service1 = context.getBean(MyService1.class);
        service1.doOperation();
		
		MyService2 service2 = context.getBean(MyService2.class, new MyRepository());
        service2.doOperation();
		
        MyService3 service3 = context.getBean(MyService3.class);
        service3.doOperation();		
	}
}
