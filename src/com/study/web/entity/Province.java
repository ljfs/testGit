package com.study.web.entity;
/**
 * ʡ��ѡ���
 * @author ������
 * @version 1.0
 */
public class Province {
	/**
	 * ���͵�id��ţ���Ӧ���ݱ��е�ʡ��id<br>
	 * ���ڱ���ʡ�ݵı��
	 */
	private int id;
	/**
	 * �ַ������͵�province����Ӧ���ݱ��е�Province��<br>
	 * ���ڱ���ʡ�ݵ���Ϣ
	 */
	private String province;
	/**
	 * �޲ι��췽��������ʵ����<br>
	 * ��������ʵ����ʵ����
	 */
	public Province() {
		super();
	}
	/**
	 * �вι��췽��������ֱ�Ӵ��ݲ���<br>
	 * ���ݵĲ���Ϊʵ�����е����в���
	 * @param id
	 * �������Ϊʡ�ݵ�id���
	 * @param province
	 * ����Ĳ���Ϊʡ�ݵ�������Ϣ
	 */
	public Province(int id, String province) {
		super();
		this.id = id;
		this.province = province;
	}
	/**
	 * ��ȡ������һ��ʡ�ݵ�id���<br>
	 * @return
	 * ����һ�����͵�ʡ��id���
	 */
	public int getId() {
		return id;
	}
	/**
	 * ��ȡ������һ��ʡ�ݵ�id���
	 * @param id
	 * ����һ�����͵�ʡ�ݱ��
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * ��ȡ������һ��ʡ�ݵ���Ϣ
	 * @return
	 * ����һ���ַ������͵�ʡ����Ϣ
	 */
	public String getProvince() {
		return province;
	}
	/**
	 * ��ȡ������һ��ʡ�ݵ���Ϣ
	 * @param province
	 * ����һ���ַ������͵�ʡ����Ϣ
	 */
	public void setProvince(String province) {
		this.province = province;
	}
}
