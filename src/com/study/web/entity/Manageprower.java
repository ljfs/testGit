package com.study.web.entity;
/**
 * Ȩ�޲���
 * @author ������
 * @version 1.0
 *
 */
public class Manageprower {
	/**
	 * ������ţ�id�����ֶ�
	 */
	private int id;
	/**
	 * Ȩ������
	 */
	private String disc;
	/**
	 * �޲ι��췽��
	 */
	public Manageprower() {
		super();
	}
	/**
	 * �вι��췽��
	 * @param disc
	 * Ȩ������
	 */
	public Manageprower(String disc) {
		super();
		this.disc = disc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDisc() {
		return disc;
	}
	public void setDisc(String disc) {
		this.disc = disc;
	}
}
