package com.study.web.entity;
/**
 * <br>�ļ�����</br>
 * @author ������
 * @version 1.0
 */
public class FileType {
	/**
	 * <br>��Ӧ�е�id��ţ��ֶ�����</br>
	 */
	private int id;
	/**
	 * <br>�ϴ�������</br>
	 */
	private String fileType;
	/**
	 * �޲ι��췽��������ʵ������
	 */
	public FileType() {
		super();
	}
	/**
	 * <br>�вι��췽��</br>
	 * @param fileType
	 * <br>������Ӧ���ݱ��е��ϴ�����</br>
	 */
	public FileType(String fileType) {
		super();
		this.fileType = fileType;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
}
