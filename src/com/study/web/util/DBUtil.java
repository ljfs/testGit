package com.study.web.util;

import java.net.InetAddress;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * DBUtil数据库连接类
 * @author 刘俊沣
 *
 */
public class DBUtil {
	private InetAddress address;
	/**
	 * 获取本机IP地址
	 * @return
	 * 返回IP地址
	 */
	private String getServiceIp(){
		String ip = null;
		try{
			address = address.getLocalHost();
			ip = address.getHostAddress();
			return ip;
		}catch (Exception e) {
			// TODO: handle exception
		}
		return ip;
	}
	/**
	 * 创建数据库连接
	 * @return
	 * 返回一个连接对象
	 */
	public static Connection getConnection(){
		DBUtil db = new DBUtil();
		//实例化一个IP地址
		String serviceip = db.getServiceIp();
		Connection conn = null;
		String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String url = "jdbc:sqlserver://PC-20160214FJYX:1433;databaseName = ManagerDB";
		String user = "sa";
		String pwd = "ljfxwf2015";
		String pwd2 = "123@qwe";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pwd);
			return conn;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return conn;
	}
	/**
	 * 关闭所有连接
	 * @param conn
	 * @param stmt
	 * @param rs
	 */
	public static void closeAll(Connection conn,Statement stmt,ResultSet rs){
		try {
			if(rs != null){
				rs.close();
			}
			if(stmt != null){
				stmt.close();
			}
			if(conn != null){
				conn.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

