package com.study.web.entity;
/**
 * <br>��Ӧ���ݿ��еĳ�Ա��ݱ�</br>
 * @author ������
 * @version 1.0
 *
 */
public class Ident {
	/**
	 * <br>id��Ӧ�е�������ţ������ֶ�</br>
	 */
	private int id;
	/**
	 * <br>��Ӧ��Ա���������</br>
	 */
	private String identityName;
	/**
	 * �޲ι��췽����Ӣ��ʵ�������
	 */
	public Ident() {
		super();
	}
	/**
	 * �вι��췽��
	 * @param identityName
	 * <br>������Ӧ��Ա����ֶ�</br>
	 */
	public Ident(String identityName) {
		super();
		this.identityName = identityName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIdentityName() {
		return identityName;
	}
	public void setIdentityName(String identityName) {
		this.identityName = identityName;
	}
}
