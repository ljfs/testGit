package com.study.web.entity;
/**
 * <br>��������Ϣ��</br>
 * @author ������
 * @version 1.0
 *
 */
public class Servicemanager {
	/**
	 * <br>������id��ţ������ֶ�</br>
	 */
	private int id;
	/**
	 * <br>��Ӧ�����������ֶ�</br>
	 */
	private String serviceName;
	/**
	 * <br>��Ӧ��������ip��ַ�ֶ�</br>
	 */
	private String serviceIp;
	/**
	 * <br>��Ӧ��������״̬��0Ϊ�رգ�1Ϊ����</br>
	 */
	private int serviceStatue;
	/**
	 * �޲ι��췽��
	 */
	public Servicemanager() {
		super();
	}
	/**
	 * �вι��췽��
	 * @param serviceName
	 * <br>����������</br>
	 * @param serviceIp
	 * <br>������Ip��ַ</br>
	 * @param serviceStatue
	 * <br>������״̬</br>
	 */
	public Servicemanager(String serviceName, String serviceIp,
			int serviceStatue) {
		super();
		this.serviceName = serviceName;
		this.serviceIp = serviceIp;
		if (serviceStatue >=0 || serviceStatue <= 1) {
			this.serviceStatue = serviceStatue;
		}
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getServiceIp() {
		return serviceIp;
	}
	public void setServiceIp(String serviceIp) {
		this.serviceIp = serviceIp;
	}
	public int getServiceStatue() {
		return serviceStatue;
	}
	public void setServiceStatue(int serviceStatue) {
		//�жϴ�������Ƿ�Ϊ1��0
		if (serviceStatue >=0 || serviceStatue <= 1) {
			//����ǣ�������е����Խ��и�ֵ
			this.serviceStatue = serviceStatue;
		}
	}
}
