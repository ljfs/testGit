package com.study.web.entity;
/**
 * �ļ������־��
 * @author ������
 * @version 1.0
 *
 */
public class FileStatusLog {
	/**
	 * �������кţ���Ӧid�����ֶ�
	 */
	private int id;
	/**
	 * �ļ���ţ���Ӧ����ļ���Ϣ���е�����
	 */
	private int fileId;
	/**
	 * �ļ����״̬����Ӧ������״̬���е�����
	 */
	private int passedStatusId;
	/**
	 * �ļ����״̬�ı�ע��˵��������һ״̬��ԭ��
	 */
	private String passedStatusRemark;
	/**
	 * �������δͨ���Ľ��б�ע
	 */
	private String remark;
	/**
	 * �޲ι��췽��
	 */
	public FileStatusLog() {
		super();
	}
	/**
	 * �вι��췽��
	 * @param fileId
	 * �ļ�id���
	 * @param passedStatusId
	 * �ļ��ϴ�״̬id���
	 * @param passedStatusRemark
	 * �ļ��ϴ�״̬��ע
	 * @param remark
	 * �ļ����ձ�ע
	 */
	public FileStatusLog(int fileId, int passedStatusId,
			String passedStatusRemark, String remark) {
		super();
		this.fileId = fileId;
		this.passedStatusId = passedStatusId;
		this.passedStatusRemark = passedStatusRemark;
		this.remark = remark;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFileId() {
		return fileId;
	}
	public void setFileId(int fileId) {
		this.fileId = fileId;
	}
	public int getPassedStatusId() {
		return passedStatusId;
	}
	public void setPassedStatusId(int passedStatusId) {
		this.passedStatusId = passedStatusId;
	}
	public String getPassedStatusRemark() {
		return passedStatusRemark;
	}
	public void setPassedStatusRemark(String passedStatusRemark) {
		this.passedStatusRemark = passedStatusRemark;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
