package com.study.web.entity;

import java.util.Date;

import com.study.web.baseentity.PersionAndLoginEntity;

/**
 * ��Աʵ���࣬���ڵǼǳ�Ա��Ϣ
 * @version 1.0
 * @author ������
 *
 */
public class Persion extends PersionAndLoginEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ���� id,��Ӧ���ݱ��е�id
	 */
	private int id;
	/**
	 * �ַ������͵�name����Ӧ���ݱ��е�pName,<br>
	 * ���ڱ����û�������
	 */
	private String name;
	/**
	 * ����age����Ӧ���ݱ��е�pAge,<br>
	 * ���ڱ����Ա�����䣬��setter�������ж������������
	 */
	private int age;
	/**
	 * �ַ������͵�gender����Ӧ���ݱ��е�pGender,<br>
	 * ���ڱ����Ա���Ա���setter�������жԳ�Ա���Ա�����Ϊ�л�Ů
	 */
	private String gender;
	/**
	 * �ַ������͵�province����Ӧ���ݱ��е�pProvince,<br>
	 * ���ڱ���ʡ����Ϣ
	 */
	private String province;
	/**
	 * �ַ������͵�city����Ӧ���ݱ��е�pCity,<br>
	 * ���ڱ����Ա�ĳ�����Ϣ
	 */
	private String city;
	/**
	 * �ַ������͵�moblePhone����Ӧ���ݱ��е�pMBP,<br>
	 * �����Ա���ֻ�������Ϣ
	 */
	private String moblePhone;
	/**
	 * �ַ������͵�subject����Ӧ���ݱ��е�pSubject,<br>
	 * �����ɳ�Ա��ѡ����ӵĿ�Ŀ�ı����ɵ��ַ���
	 */
	private String subject;
	/**
	 * �ַ������͵�Qid,��Ӧ���ݱ��е�pQid,<br>
	 * �����Ա��QQ����
	 */
	private String Qid;
	/**
	 * ���͵�reputation����Ӧ���ݱ��е�pReputation,<br>
	 * ��¼��Ա�������ȣ�Ĭ��ֵΪ1
	 */
	private int reputation;
	/**
	 * �޲������췽��������ʵ����һ�����κβ����ĳ�Աʵ����<br>
	 * ����������ʵ����
	 */
	public Persion() {
		super();
	}
	/**
	 * ���ι��췽��������ֱ����Ӳ�����<br>
	 * ���ҽ���������id���ԣ��Լ��Ǳ�����
	 * @param name
	 * �����Ա����������
	 * @param age
	 * �����Ա���������
	 * @param gender
	 * �����Ա���Ա����
	 * @param subject
	 * �����Ŀ�����ɵ��ַ���
	 * @param qid
	 * �����Ա��QQ����
	 * @param reputation
	 * �����Ա��������
	 */
	public Persion(String name, int age, String gender, String subject,
			String qid, int reputation) {
		super();
		this.name = name;
		this.age = age;
		//�жϴ���Ĳ����Ƿ�Ϊ�л�Ů
		if(gender.equals("��") || gender.equals("Ů")){
			//�������Ĳ�������������ִ�и�ֵ����
			this.gender = gender;
		}else{
			//����Ĭ��ֵΪ��
			this.gender = "��";
		}
		this.subject = subject;
		Qid = qid;
		this.reputation = reputation;
	}
	/**
	 * ���ι��췽��������ֱ����Ӳ�����<br>
	 * ���ҽ���������Ĭ��ֵ�Ĺ��췽��
	 * @param name
	 * �����Ա������
	 * @param age
	 * �����Ա������
	 * @param gender
	 * �����Ա���Ա�
	 * @param province
	 * �����Ա������ʡ��
	 * @param city
	 * �����Ա�ĳ�����Ϣ
	 * @param subject
	 * �����Ա����ѡ�γ�
	 * @param qid
	 * �����Ա��QQ����
	 */
	public Persion(String name, int age, String gender, String province,
			String city, String subject, String qid) {
		super();
		this.name = name;
		this.age = age;
		//�жϴ���Ĳ����Ƿ�Ϊ�л�Ů
		if(gender.equals("��") || gender.equals("Ů")){
			//�������Ĳ�������������ִ�и�ֵ����
			this.gender = gender;
		}else{
			//����Ĭ��ֵΪ��
			this.gender = "��";
		}
		this.province = province;
		this.city = city;
		this.subject = subject;
		Qid = qid;
	}
	/**
	 * ���ι��췽��������ֱ����Ӳ�����<br>
	 * ����������������֮�⺬ʡ�ݲ���������
	 * @param name
	 * �����Ա����������
	 * @param age
	 * �����Ա���������
	 * @param gender
	 * �����Ա���Ա����
	 * @param province
	 * �����Ա������ʡ����Ϣ
	 * @param subject
	 * �����Ա����ѡ��Ŀ��Ϣ
	 * @param qid
	 * �����Ա��QQ��Ϣ
	 */
	public Persion(String name, int age, String gender, String province,
			String subject, String qid) {
		super();
		this.name = name;
		this.age = age;
		//�жϴ���Ĳ����Ƿ�Ϊ�л�Ů
		if(gender.equals("��") || gender.equals("Ů")){
			//�������Ĳ�������������ִ�и�ֵ����
			this.gender = gender;
		}else{
			//����Ĭ��ֵΪ��
			this.gender = "��";
		}
		this.province = province;
		this.subject = subject;
		Qid = qid;
	}
	/**
	 * ���ι��췽��������ֱ����Ӳ�����<br>
	 * �������ݱ��ж�Ӧ�����в���
	 * @param id
	 * �����Ա�ı����
	 * @param name
	 * �����Ա��������Ϣ
	 * @param age
	 * �����Ա���������
	 * @param gender
	 * �����Ա���Ա����
	 * @param province
	 * �����Ա������ʡ����Ϣ
	 * @param city
	 * �����Ա�����ڳ�����Ϣ
	 * @param moblePhone
	 * �����Ա���ֻ�������Ϣ
	 * @param subject
	 * �����Ա��ѡ��Ŀ�ı����ɵ��ַ�����Ϣ
	 * @param qid
	 * �����Ա��QQ����
	 * @param reputation
	 * �����Ա��������
	 */
	public Persion(int id, String name, int age, String gender,
			String province, String city, String moblePhone, String subject,
			String qid, int reputation) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		//�жϴ���Ĳ����Ƿ�Ϊ�л�Ů
		if(gender.equals("��") || gender.equals("Ů")){
			//�������Ĳ�������������ִ�и�ֵ����
			this.gender = gender;
		}else{
			//����Ĭ��ֵΪ��
			this.gender = "��";
		}
		this.province = province;
		this.city = city;
		this.moblePhone = moblePhone;
		this.subject = subject;
		Qid = qid;
		this.reputation = reputation;
	}
	/**
	 * ��ȡ�����س�Ա�ı��
	 * @return
	 * ����һ�����͵�id���
	 */
	public int getId() {
		return id;
	}
	/**
	 * ��ȡ��Ա�ı�Ų�����ʵ������
	 * @param id
	 * ��Ա��id���
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * ��ȡ�����س�Ա��������Ϣ
	 * @return
	 * ����һ���ַ������͵ĳ�Ա������Ϣ
	 */
	public String getName() {
		return name;
	}
	/**
	 * ��ȡ��Ա������������ʵ������
	 * @param name
	 * �������Ϊ����
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * ��ȡ�����س�Ա������
	 * @return
	 * ����һ�����͵�������Ϣ
	 */
	public int getAge() {
		return age;
	}
	/**
	 * ��ȡ��������������ĳ�Ա������Ϣ��������ʵ������
	 * @param age
	 * �������Ϊ��Ա��������Ϣ����Ч��ΧΪ7~80��<br>
	 * ������䲻��ѡ��Χ�ڣ���Ĭ��Ϊ7��
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * ��ȡ�����س�Ա���Ա�
	 * @return
	 * ����һ���ַ������͵ĳ�Ա�Ա���Ϣ
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * ��ȡ���������ĳ�Ա�Ա���Ϣ��������ʵ������
	 * @param gender
	 * �������Ϊ��Ա���Ա���Ϣ����ЧֵΪ���С���Ů��<br>
	 * ���δ�����������������ڷ�Χ�ڣ�<br>
	 * ��Ĭ��Ϊ��
	 */
	public void setGender(String gender) {
		//�жϴ���Ĳ����Ƿ�Ϊ�л�Ů
		if(gender.equals("��") || gender.equals("Ů")){
			//�������Ĳ�������������ִ�и�ֵ����
			this.gender = gender;
		}else{
			//����Ĭ��ֵΪ��
			this.gender = "��";
		}
	}
	/**
	 * ��ȡ�����س�Ա���ڵ�ʡ��
	 * @return
	 * ����һ���ַ������͵�ʡ����Ϣ
	 */
	public String getProvince() {
		return province;
	}
	/**
	 * ��ȡ������һ��ʡ�ݵ���Ϣ�����浽ʵ������
	 * @param province
	 * �������Ϊһ���ַ������͵�ʡ����Ϣ
	 */
	public void setProvince(String province) {
		this.province = province;
	}
	/**
	 * ��ȡ������һ����Ա���ڵĳ�����Ϣ
	 * @return
	 * ����һ���ַ������͵ĳ�����Ϣ
	 */
	public String getCity() {
		return city;
	}
	/**
	 * ��ȡ������һ����Ա�ĳ�����Ϣ��ʵ������
	 * @param city
	 * ����Ϊһ����Ա�����ڳ�����Ϣ
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * ��ȡ�����س�Ա���ֻ�����
	 * @return
	 * ����һ���ַ������͵��ֻ�����
	 */
	public String getMoblePhone() {
		return moblePhone;
	}
	/**
	 * ��ȡ������һ����Ա���ֻ�����Ϣ��ʵ������
	 * @param moblePhone
	 * ����Ĳ���Ϊ�ַ������͵ĳ�Ա�ֻ�����
	 */
	public void setMoblePhone(String moblePhone) {
		if (moblePhone == null) {
			moblePhone = "";
		}else if (!(moblePhone.equals("")) || (moblePhone != null)) {
			int length = moblePhone.length();
			if (length == 11) {
				this.moblePhone = moblePhone;
			}
		}
		
	}
	/**
	 * ��ȡ������һ����Ա��ѡ�Ŀ�Ŀƴ�ӳɵ��ַ���
	 * @return
	 * ����һ����Ա����ѡ��Ŀƴ�ӳɵ��ַ���
	 */
	public String getSubject() {
		return subject;
	}
	/**
	 * ��ȡ�������Ա��ѡ�Ŀ�Ŀ��ɵ��ַ���
	 * @param subject
	 * ����һ���ַ������͵ĳ�Ա��ѡ�Ŀ�Ŀ�ı����ɵ��ַ���
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	/**
	 * ��ȡ�����س�Ա��QQ����
	 * @return
	 * ���س�Ա��QQ����
	 */
	public String getQid() {
		return Qid;
	}
	/**
	 * ��ȡ�������Ա��QQ����
	 * @param qid
	 * ����һ���ַ������͵Ĳ��������Ա��QQ����
	 */
	public void setQid(String qid) {
		Qid = qid;
	}
	/**
	 * ��ȡ�����س�Ա��������
	 * @return
	 * ����һ�����͵ı��Ĭ�������������Ϊ1������������Ϊ0
	 */
	public int getReputation() {
		return reputation;
	}
	/**
	 * ��ȡ�������Ա��������
	 * @param reputation
	 * ����һ�����Ͳ��������������Ϊ1��0��Ĭ��Ϊ1
	 */
	public void setReputation(int reputation) {
		
			this.reputation = reputation;
	}
	/**
	 * �������֤��
	 * @return
	 * ����һ��������ɵ��ַ���
	 */
	public String getIdentityId(){
		return super.getIdentityCardId();
	}
	/**
	 * ��ȡ���֤��
	 * @param identityId
	 * �������֤��
	 */
	public void setIdentityId(String identityId){
		super.setIdentityCardId(identityId);
	}
	/**
	 * ����һ�����գ�<br>
	 * ��ʽΪ����-��-��
	 */
	public Date getBirthday(){
		return super.getBirthday();
	}
	/**
	 * ����һ������
	 * @param birthday
	 * ���������֤��������ͬ
	 */
	public void getBrithDay(String birthday){
		super.setBirthday(birthday);
	}
}