package com.study.web.entity;
/**
 * ϵ������
 * @author ������
 * @version 1.0
 */
public class SubjectParent {
	/**
	 * ���͵�id��ţ���Ӧ���ݱ��е�id��
	 */
	private int id;
	/**
	 * �ַ������͵�sbjparent����Ӧ���ݱ��е�sbjParent��
	 */
	private String sbjparent;
	/**
	 * �޲ι��췽��������ʵ����ʵ����<br>
	 * ��������ʵ����һ��ʵ��
	 */
	public SubjectParent() {
		super();
	}
	/**
	 * �вι��췽�������ڴ��ݲ�����ʵ��
	 * @param id
	 * ����Ϊ���͵�id���
	 * @param sbjparent
	 * ����Ϊ�ַ������͵�ϵ����
	 */
	public SubjectParent(int id, String sbjparent) {
		super();
		this.id = id;
		this.sbjparent = sbjparent;
	}
	/**
	 * ��ȡ������һ��ϵ��ı��
	 * @return
	 * ����һ�����͵�ϵ����
	 */
	public int getId() {
		return id;
	}
	/**
	 * ��ȡ������һ��ϵ����
	 * @param id
	 * ����һ�����͵�ϵ����
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * ��ȡ������һ��ϵ���������Ϣ
	 * @return
	 * ����һ���ַ������͵�ϵ����Ϣ
	 */
	public String getSbjparent() {
		return sbjparent;
	}
	/**
	 * ��ȡ������һ��ϵ�����Ϣ
	 * @param sbjparent
	 * ����һ���ַ������͵�ϵ����Ϣ
	 */
	public void setSbjparent(String sbjparent) {
		this.sbjparent = sbjparent;
	}
}
