package com.study.web.entity;
/**
 * <br>��������Ӳ�̿ռ�</br>
 * @author ������
 * @version 1.0
 *
 */
public class Servicelocalurl {
	/**
	 * <br>��Ӧid�У������ֶ�</br>
	 */
	private int id;
	/**
	 * <br>��Ӧ������·��</br>
	 */
	private String savePath;
	/**
	 * <br>�̷���ʣ��ռ�</br>
	 */
	private int pathHomeSize;
	/**
	 * <br>�̷����õ�����</br>
	 */
	private String pathHomedescr;
	/**
	 * �޲ι��췽��
	 */
	public Servicelocalurl() {
		super();
	}
	/**
	 * �вι��췽��
	 * @param savePath
	 * �̷�·��
	 * @param pathHomeSize
	 * �̷�ʣ��ռ�
	 * @param pathHomedescr
	 * �̷���Ϣ����
	 */
	public Servicelocalurl(String savePath, int pathHomeSize,
			String pathHomedescr) {
		super();
		this.savePath = savePath;
		this.pathHomeSize = pathHomeSize;
		this.pathHomedescr = pathHomedescr;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSavePath() {
		return savePath;
	}
	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}
	public int getPathHomeSize() {
		return pathHomeSize;
	}
	public void setPathHomeSize(int pathHomeSize) {
		this.pathHomeSize = pathHomeSize;
	}
	public String getPathHomedescr() {
		return pathHomedescr;
	}
	public void setPathHomedescr(String pathHomedescr) {
		this.pathHomedescr = pathHomedescr;
	}
}
