package com.study.web.entity;

import java.util.Date;

/**
 * �����Ϣ��
 * @author ������
 * @version 1.0
 *
 */
public class Advertisement {
	/**
	 * ����ţ�����id�����ֶ�
	 */
	private int id;
	/**
	 * �ϴ��߱�ţ���Ӧ�����Ա���
	 */
	private int personId;
	/**
	 * ��Ա��ݣ���Ӧ�����ݱ�ţ�Ĭ���ϴ���ԱΪ1ʱ����ʹ��
	 */
	private int ident;
	/**
	 * ��������⣬�ϴ�����������
	 */
	private String theme;
	/**
	 * �ϴ�����
	 */
	private Date upperDate;
	/**
	 * ��������
	 */
	private Date startDate;
	/**
	 * ��浽��ʱ�䣬����3����
	 */
	private Date endDate;
	/**
	 * ������״̬��ţ���Ӧ������״̬id���
	 */
	private int statusId;
	/**
	 * �޲ι��췽��
	 */
	public Advertisement() {
		super();
	}
	/**
	 * �вι��췽��
	 * @param personId
	 * ��Ա���
	 * @param ident
	 * �����Ϣ���
	 * @param theme
	 * �������
	 * @param upperDate
	 * �ϴ�����
	 * @param startDate
	 * ��������
	 * @param endDate
	 * ��浽��ʱ��
	 * @param statusId
	 * ������״̬
	 */
	public Advertisement(int personId, int ident, String theme, Date upperDate,
			Date startDate, Date endDate, int statusId) {
		super();
		this.personId = personId;
		this.ident = ident;
		this.theme = theme;
		this.upperDate = upperDate;
		this.startDate = startDate;
		this.endDate = endDate;
		this.statusId = statusId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public int getIdent() {
		return ident;
	}
	public void setIdent(int ident) {
		this.ident = ident;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public Date getUpperDate() {
		return upperDate;
	}
	public void setUpperDate(Date upperDate) {
		this.upperDate = upperDate;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getStatusId() {
		return statusId;
	}
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}
}
