package com.study.web.entity;
/**
 * ���״̬
 * @author ������
 * @version 1.0
 *
 */
public class ExamineAndVerifyRank {
	/**
	 * <br>״̬id��ţ������ֶ�</br>
	 */
	private int id;
	/**
	 * <br>���״̬</br>
	 */
	private String passedStatus;
	/**
	 * <br>�޲ι��췽��</br>
	 */
	public ExamineAndVerifyRank() {
		super();
	}
	/**
	 * <br>�вι��췽��</br>
	 * @param passedStatus
	 * <br>���״̬</br>
	 */
	public ExamineAndVerifyRank(String passedStatus) {
		super();
		this.passedStatus = passedStatus;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassedStatus() {
		return passedStatus;
	}
	public void setPassedStatus(String passedStatus) {
		this.passedStatus = passedStatus;
	}
}
