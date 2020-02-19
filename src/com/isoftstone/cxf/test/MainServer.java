package com.isoftstone.cxf.test;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class MainServer {
	public static void main(String[] args) {
		JaxWsServerFactoryBean jwsfb = new JaxWsServerFactoryBean();//老板想创建一个公司
		jwsfb.setAddress("http://localhost:9189/MyCxf");//公司地址
		jwsfb.setServiceClass(HelloWorldImpl.class);//做什么业务，这里是实现类
		Server server = jwsfb.create();//注册公司
		server.start();//公司营业
	}
}




