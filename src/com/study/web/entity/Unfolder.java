package com.study.web.entity;
/**
 * <br>���ļ������ļ���</br>
 * @author ������
 * @version 1.0
 */
public class Unfolder {
	/**
	 * <br>�ļ����id���У������ֶ�</br>
	 */
	private int id;
	/**
	 * <br>�ļ����͵�id��ţ������Ӧ�ļ����ͱ�id</br>
	 */
	private int typeid;
	/**
	 * <br>�ļ��ĺ�׺����</br>
	 */
	private String fileName;
	public Unfolder() {
		super();
	}
	public Unfolder(int typeid, String fileName) {
		super();
		this.typeid = typeid;
		this.fileName = fileName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTypeid() {
		return typeid;
	}
	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}
