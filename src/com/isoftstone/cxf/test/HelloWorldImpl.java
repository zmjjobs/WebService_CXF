package com.isoftstone.cxf.test;

public class HelloWorldImpl implements HelloWorld{

	@Override
	public String sayHello(String name, int age) {
		return "cxf 20200218 ,hello " + name + ",age="+age;
	}
}






