package com.study.web.entity;


/**
 * ��¼ʵ���¼��
 * @author ������
 * @version 1.0
 */
public class PersionLogin {
	/**
	 * ��Ա��½ʱ�õ��ʺţ���Ӧ��¼��Ϣ���е�userid�У�<br>
	 * �����������У�������10000��
	 */
	private int userid;
	/**
	 * �����������Ӧ��Ա��id��ţ����ڲ��ҳ�Ա����Ϣ<br>
	 * �������������Ϣ
	 */
	private int pid;
	/**
	 * 
	 */
	private String password;
	/**
	 * ident�����Ա��ݣ�����0��1�ֱ��ʾѧϰ��Ա����ʦ��<br>
	 * 2Ϊ����Ա��3Ϊ�ײ����4Ϊ�������<br>
	 * �����������������е�Ȩ�ޣ��ײ������г��������֮���Ȩ��<br>
	 * �Դ�����...
	 */
	private int ident;
	/**
	 * �޲ι��췽��������ʵ����һ��ʵ����<br>
	 * ��������ʵ����
	 */
	public PersionLogin() {
		super();
	}
	/**
	 * �вι��췽��������ֱ�Ӵ������в���<br>
	 * ʵ����֮����Ա������еĲ�����ʵ������
	 * @param userid
	 * �������Ϊ��Ա���ʺ�
	 * @param pid
	 * �����Ա��id���
	 * @param password
	 * �����Ա��ע������
	 * @param ident
	 * �����Ա����ݱ��
	 */
	public PersionLogin(int userid, int pid, String password, int ident) {
		super();
		this.userid = userid;
		this.pid = pid;
		//�鿴�����Ƿ�Ϊ6~16λ
		if(password.length() >= 6 && password.length() <= 16){
			//��������������ԵǼ�����
			this.password = password;
		}else {
			//��������Ϊ��
			this.password = null;
		}
		//�ж���ݱ���Ƿ�Ϸ�
		if(ident >= 0 &&ident <= 4){
			//����Ϸ�������ݱ��
			this.ident = ident;
		}else{
			//����Ĭ��Ϊ��ͨ��Ա
			this.ident = 0;
		}
	}
	/**
	 * ��ȡ�����س�Ա�˺�
	 * @return
	 * ����һ�����͵ĳ�Ա�˺���Ϣ
	 */
	public int getUserid() {
		return userid;
	}
	/**
	 * ��ȡ�������Ա���˺�
	 * @param userid
	 * ����һ����Ա���˺���Ϣ
	 */
	public void setUserid(int userid) {
		this.userid = userid;
	}
	/**
	 * ��ȡ������һ����������ڶ�Ӧ��Ա��id��Ϣ
	 * @return
	 * ����һ�����͵�pid��Ŷ�Ӧ��Ա��id���
	 */
	public int getPid() {
		return pid;
	}
	/**
	 * ��ȡ������һ����Ա��id���
	 * @param pid
	 * �����Ա��һ��id���
	 */
	public void setPid(int pid) {
		this.pid = pid;
	}
	/**
	 * ��ȡ������һ����Ա������
	 * @return
	 * ����һ���ַ������͵ĳ�Ա����
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * ��ȡ�������Ա������
	 * @param password
	 * ��ȡһ�鳤��Ϊ6~16λ���ַ����������Ա������
	 */
	public void setPassword(String password) {
		//�鿴�����Ƿ�Ϊ6~16λ
		if(password.length() >= 6 && password.length() <= 16){
			//��������������ԵǼ�����
			this.password = password;
		}else {
			//��������Ϊ��
			this.password = null;
		}
	}
	/**
	 * ��ȡ�����س�Ա�������Ϣ
	 * @return
	 * ����һ�����͵ĳ�Ա��Ϣ
	 */
	public int getIdent() {
		return ident;
	}
	/**
	 * ��ȡ������һ����Ա�������Ϣ
	 * @param ident
	 * �����Ա����ݱ�źϷ���<br>
	 * �򷵻س�Ա����ݱ����Ϣ
	 */
	public void setIdent(int ident) {
		//�ж���ݱ���Ƿ�Ϸ�
		if(ident >= 0 &&ident <= 4){
			//����Ϸ�������ݱ��
			this.ident = ident;
		}else{
			//����Ĭ��Ϊ��ͨ��Ա
			this.ident = 0;
		}
	}
}
