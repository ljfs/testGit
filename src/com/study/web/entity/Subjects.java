package com.study.web.entity;
/**
 * ��Ŀ��Ϣʵ����
 * @author ������
 * @version 1.0
 */
public class Subjects {
	/**
	 * ���͵�id��ţ���Ӧ���ݱ��е�id���
	 */
	private int id;
	/**
	 * �ַ������͵�sbj����Ӧ���ݱ��е�sbj��
	 */
	private String sbj;
	/**
	 * ���͵�spid����Ӧ���ݱ��е�spid��
	 */
	private int spid;
	/**
	 * 
	 */
	public Subjects() {
		super();
	}
	/**
	 * 
	 * @param sbj
	 */
	public Subjects(String sbj) {
		super();
		this.sbj = sbj;
	}
	/**
	 * 
	 * @param id
	 * @param sbj
	 */
	public Subjects(int id, String sbj) {
		super();
		this.id = id;
		this.sbj = sbj;
	}
	/**
	 * 
	 * @param id
	 * @param sbj
	 * @param spid
	 */
	public Subjects(int id, String sbj, int spid) {
		super();
		this.id = id;
		this.sbj = sbj;
		this.spid = spid;
	}
	/**
	 * 
	 * @return
	 */
	public int getSpid() {
		return spid;
	}
	/**
	 * 
	 * @param spid
	 */
	public void setSpid(int spid) {
		this.spid = spid;
	}
	/**
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}
	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 
	 * @return
	 */
	public String getSbj() {
		return sbj;
	}
	/**
	 * 
	 * @param sbj
	 */
	public void setSbj(String sbj) {
		this.sbj = sbj;
	}
}
