package com.study.web.entity;
/**
 * �������
 * @author ������
 * @version 1.0
 *
 */
public class FileImportant {
	/**
	 * ��Ӧid��ţ������ֶ�
	 */
	private int id;
	/**
	 * ��Ӧ�ļ���˵�����
	 */
	private String special;
	/**
	 * �޲ι��췽��
	 */
	public FileImportant() {
		super();
	}
	/**
	 * �вι��췽��
	 * @param special
	 * �ļ���˵�����
	 */
	public FileImportant(String special) {
		super();
		this.special = special;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSpecial() {
		return special;
	}
	public void setSpecial(String special) {
		this.special = special;
	}
}
