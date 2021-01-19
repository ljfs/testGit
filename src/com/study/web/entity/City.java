package com.study.web.entity;

/**
 * ���б����ڵǼǳ�����Ϣ<br>
 * @version 1.0
 * @author ������
 */
public class City {
	/**
	 * ���͵�id����Ӧ���ݱ��е�id��<br>
	 * ��ʾһ��������������
	 */
	private int id;
	/**
	 * �ַ������͵�city����Ӧ���ݱ��е�t_city��<br>
	 * ���ڱ�����е�����
	 */
	private String city;
	/**
	 * ���͵�pid����Ӧ���ݱ��е�pid�У�<br>
	 * ����һ���������ӦPorvince���е�id��
	 */
	private int pid;
	/**
	 * �޲ι��췽��������ʵ����һ��ʵ����<br>
	 * ��������ʵ����
	 */
	public City() {
		super();
	}
	/**
	 * �вι��췽��������ֱ�Ӵ������<br>
	 * ����Ϊ����������֮��������������췽��
	 * @param city
	 * ������е�������Ϣ
	 * @param pid
	 * ����������ӵ�ʡ��id���
	 */
	public City(String city, int pid) {
		super();
		this.city = city;
		this.pid = pid;
	}
	/**
	 * �вι��췽��������ֱ�Ӵ������<br>
	 * ����Ϊʵ�����е��������Բ���
	 * @param id
	 * �������Ϊ���е�id���
	 * @param city
	 * �������Ϊ���е�������Ϣ
	 * @param pid
	 * �������Ϊ����������ӵ�ʡ��id���
	 */
	public City(int id, String city, int pid) {
		super();
		this.id = id;
		this.city = city;
		this.pid = pid;
	}
	/**
	 * ��ȡ�����س��е�id���
	 * @return
	 * ����һ�����͵�id���
	 */
	public int getId() {
		return id;
	}
	/**
	 * ��ȡ��������е�id���
	 * @param id
	 * �������Ϊһ�����͵ĳ���id��ű�����е�id���
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * ��ȡ�����س��е�����
	 * @return
	 * ����һ���ַ������͵ĳ�������
	 */
	public String getCity() {
		return city;
	}
	/**
	 * ��ȡ��������е�����
	 * @param city
	 * �������Ϊһ���ַ������͵ĳ�����Ϣ
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * ��ȡ�����س���������ӵ�ʡ�ݵ�id��Ϣ
	 * @return
	 * ���ز���Ϊһ�����͵�ʡ��id���
	 */
	public int getPid() {
		return pid;
	}
	/**
	 * ��ȡ������һ�����͵�pid��Ŷ�Ӧһ��ʡ�ݵ���Ϣ
	 * @param pid
	 * �������Ϊһ�����͵�pid�������Ӧ�������ڵ�ʡ�ݵ���Ϣ
	 */
	public void setPid(int pid) {
		this.pid = pid;
	}
}
