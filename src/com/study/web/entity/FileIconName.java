package com.study.web.entity;
/**
 * <br>�ļ��ϴ���ͼƬ���ͱ�</br>
 * @author ������
 * @version 1.0
 *
 */
public class FileIconName {
	/**
	 * <br>ͼƬ����id��ţ������ֶ�</br>
	 */
	private int id;
	/**
	 * <br>ͼƬ���ͺ�׺��</br>
	 */
	private String iconTypeName;
	/**
	 * <br>�޲ι��췽��</br>
	 */
	public FileIconName() {
		super();
	}
	/**
	 * <br>�вι��췽��</br>
	 * @param iconTypeName
	 * <br>����ͼƬ���ͺ�׺��</br>
	 */
	public FileIconName(String iconTypeName) {
		super();
		this.iconTypeName = iconTypeName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIconTypeName() {
		return iconTypeName;
	}
	public void setIconTypeName(String iconTypeName) {
		this.iconTypeName = iconTypeName;
	}
}
