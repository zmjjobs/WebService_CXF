package com.isoftstone.cxf.test;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class ClientTest {
	public static void main(String[] args) {
		JaxWsProxyFactoryBean jwpfb = new JaxWsProxyFactoryBean();//访客想找某个公司
		jwpfb.setAddress("http://localhost:9189/MyCxf");//根据公司地址找公司
		//jwpfb.setAddress("http://localhost:8345/MyCxf");//将端口改为监控端口
		jwpfb.setServiceClass(HelloWorld.class);////需要公司提供什么业务，这里是接口
		HelloWorld helloWorld = (HelloWorld)jwpfb.create();//谈妥
		String result = helloWorld.sayHello("张三", 26);//业务进行
		System.out.println(result);
	}
}
