package com.study.web.entity;
/**
 * <br>ͼƬ��Ϣ��</br>
 * @author ������
 * @version 1.0
 *
 */
public class FileIcon {
	/**
	 * <br>ͼƬ��Ϣid��ţ������ֶ�</br>
	 */
	private int id;
	/**
	 * <br>ͼƬ��Ϣ��ȡ·��</br>
	 */
	private String fileIconSetPath;
	/**
	 * <br>ͼƬ��Ϣ�ϴ�����·��</br>
	 */
	private String fileIconSavePath;
	/**
	 * <br>ͼƬ����</br>
	 */
	private String fileIconName;
	/**
	 * <br>ͼƬ��׺�����</br>
	 */
	private String fileIconNameId;
	/**
	 * �޲ι��췽��
	 */
	public FileIcon() {
		super();
	}
	/**
	 * �вι��췽��
	 * @param fileIconSetPath
	 * <br>ͼƬ��Ϣ��ȡ·��</br>
	 * @param fileIconSavePath
	 * <br>ͼƬ��Ϣ�ϴ�����·��</br>
	 * @param fileIconName
	 * <br>ͼƬ����</br>
	 * @param fileIconNameId
	 * <br>ͼƬ��׺�����</br>
	 */
	public FileIcon(String fileIconSetPath, String fileIconSavePath,
			String fileIconName, String fileIconNameId) {
		super();
		this.fileIconSetPath = fileIconSetPath;
		this.fileIconSavePath = fileIconSavePath;
		this.fileIconName = fileIconName;
		this.fileIconNameId = fileIconNameId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFileIconSetPath() {
		return fileIconSetPath;
	}
	public void setFileIconSetPath(String fileIconSetPath) {
		this.fileIconSetPath = fileIconSetPath;
	}
	public String getFileIconSavePath() {
		return fileIconSavePath;
	}
	public void setFileIconSavePath(String fileIconSavePath) {
		this.fileIconSavePath = fileIconSavePath;
	}
	public String getFileName() {
		return fileIconName;
	}
	public void setFileName(String fileIconName) {
		this.fileIconName = fileIconName;
	}
	public String getFileIconNameId() {
		return fileIconNameId;
	}
	public void setFileIconNameId(String fileIconNameId) {
		this.fileIconNameId = fileIconNameId;
	}
}
