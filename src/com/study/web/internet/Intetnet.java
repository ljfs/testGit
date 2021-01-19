package com.study.web.internet;

import java.net.InetAddress;
/**
 * Internet地址访问<br>
 * 访问获取ip地址打印到文本中保存<br>
 * 获取主机ip或客户端ip
 * @author 刘俊沣
 * @version 1.0.0
 * 
 */
public class Intetnet {
	/**
	 * 
	 * 地址
	 * 
	 */
	private static InetAddress address;
	/**
	 * 服务器地址
	 */
	private static String serviceip;
	/**
	 * 服务器名称
	 */
	private static String servicename;
	/**
	 * 正常情况下输出ip地址<br>
	 * 否则返回错误信息<br>
	 * 
	 * @author 刘俊沣
	 * @return 返回一个服务器ip地址
	 * 
	 */
	public static String getServiceip() {
		serviceip = null;
		try{
			address = address.getLocalHost();
			serviceip = address.getHostAddress();
			return serviceip;
		}catch (Exception e) {
			// TODO: handle exception
		}
		return serviceip;
	}
	
	
	public void setServiceip(String serviceip) {
		this.serviceip = serviceip;
	}
	
	
	/**
	 * 获取服务器名称<br>
	 * 静态方法
	 * @return
	 * 返回服务器名称
	 */
	public static String getServicename() {
		servicename = null;
		try {
			address = address.getLocalHost();
			servicename = address.getHostName();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return servicename;
	}
	
	
	public void setServicename(String servicename) {
		this.servicename = servicename;
	}
	
	
}
