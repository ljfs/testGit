package com.study.web.entity;

import java.util.Date;
/**
 * Ȩ�ޱ�
 * @author ������
 * @version 1.0
 *
 */
public class prower {
	/**
	 * ������ţ������ֶ�
	 */
	private int id;
	/**
	 * ��Ӧ���ܱ��еĹ��ܣ��ǿգ�Ψһ
	 */
	private String manage;
	/**
	 * ֱ�Ӵ����������Ȩ��
	 */
	private String checkeds;
	/**
	 * ���ܵĸ��ڵ�
	 */
	private String objectnode;
	/**
	 * ���ܵ��ӽڵ�
	 */
	private String childnode;
	/**
	 * �޸�Ȩ�޵�ִ���ߣ������Ӧ��Ա��Ϣ���
	 */
	private int changepersonId;
	/**
	 * ��ִ��Ȩ�޲����Ľ�ɫ
	 */
	private int orderident;
	/**
	 * �޸Ľ�ɫ����Ȩ�޵�ʱ��
	 */
	private Date changedate;
	/**
	 * �޲ι��췽��
	 */
	public prower() {
		super();
	}
	/**
	 * �вι��췽��
	 * @param manage
	 * ��Ӧ���ܱ��еĹ��ܣ��ǿգ�Ψһ
	 * @param checkeds
	 * ֱ�Ӵ����������Ȩ��
	 * @param objectnode
	 * ���ܵĸ��ڵ�
	 * @param childnode
	 * ���ܵ��ӽڵ�
	 * @param changepersonId
	 * �޸�Ȩ�޵�ִ���ߣ������Ӧ��Ա��Ϣ���
	 * @param orderident
	 * ��ִ��Ȩ�޲����Ľ�ɫ
	 * @param changedate
	 * �޸Ľ�ɫ����Ȩ�޵�ʱ��
	 */
	public prower(String manage, String checkeds, String objectnode,
			String childnode, int changepersonId, int orderident,
			Date changedate) {
		super();
		this.manage = manage;
		this.checkeds = checkeds;
		this.objectnode = objectnode;
		this.childnode = childnode;
		this.changepersonId = changepersonId;
		this.orderident = orderident;
		this.changedate = changedate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getManage() {
		return manage;
	}
	public void setManage(String manage) {
		this.manage = manage;
	}
	public String getCheckeds() {
		return checkeds;
	}
	public void setCheckeds(String checkeds) {
		this.checkeds = checkeds;
	}
	public String getObjectnode() {
		return objectnode;
	}
	public void setObjectnode(String objectnode) {
		this.objectnode = objectnode;
	}
	public String getChildnode() {
		return childnode;
	}
	public void setChildnode(String childnode) {
		this.childnode = childnode;
	}
	public int getChangepersonId() {
		return changepersonId;
	}
	public void setChangepersonId(int changepersonId) {
		this.changepersonId = changepersonId;
	}
	public int getOrderident() {
		return orderident;
	}
	public void setOrderident(int orderident) {
		this.orderident = orderident;
	}
	public Date getChangedate() {
		return changedate;
	}
	public void setChangedate(Date changedate) {
		this.changedate = changedate;
	}
}
