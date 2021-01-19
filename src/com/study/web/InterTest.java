package com.study.web;

import com.study.web.internet.Intetnet;

public class InterTest {

	/**
	 * 测试服务器的名称和服务器的ip地址查询
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//显示本机的IP和名称
		System.out.println("主机名称："+Intetnet.getServicename()+"\t\t主机ip地址："+Intetnet.getServiceip());
	}
}