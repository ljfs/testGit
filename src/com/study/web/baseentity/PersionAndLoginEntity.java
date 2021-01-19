package com.study.web.baseentity;


import java.util.Date;

import com.study.web.util.IdentityCheckUtil;

/**
 * �û����¼��
 * @author ������
 * @category user
 * @category login
 * 
 */

public class PersionAndLoginEntity extends BaseEntity<PersionAndLoginEntity> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ����<br>
	 * Date����<br>
	 */
	private Date birthday;
	/**
	 * ʡ��id
	 * int����<br>
	 */
	private int provinceId;
	/**
	 * ����id<br>
	 * int����<br>
	 */
	private int cityId;
	/**
	 * ���еĸ���id,<br>
	 * ��Ӧʡ�ݵ�id<br>
	 * int����<br>
	 */
	private int cityOfProvinceId = provinceId;
	/**
	 * ʡ������<br>
	 * String����<br>
	 * ���������޸�<br>
	 */
	private String province;
	/**
	 * ��������<br>
	 * String����<br>
	 * �����޸�<br>
	 */
	private String city;
	/**
	 * ���֤���<br>
	 * String����
	 */
	private String identityCardId;
	/**
	 * ��¼���
	 */
	private String loginId;
	/**
	 * ��¼����
	 */
	private String loginPassword;
	/**
	 * ��¼���
	 */
	private int loginIdent;
	/**
	 * �γ�id��ϵ��id��<br>
	 * �γ̸���id(��Ӧϵ��id)<br>
	 */
	private int subjectParentId,
		subjectId,
		subjectOfParentId = subjectParentId;
	/**
	 * ��Ŀ����
	 */
	private String SubjectName;
	/**
	 * ϵ������
	 */
	private String subjectParentName;
	/**
	 * ��������id
	 */
	
	public int getId(){
		return super.getId();
	}
	/**
	 * ��ȡ����id
	 */
	 
	public void setId(int id){
		super.id = id;
	}
	/**
	 * 
	 */
	 
	public String getName(){
		return super.getName();
	}
	/**
	 * 
	 */
	 
	public void setName(String name){
		super.setName(name);
	}
	/**
	 * ���ص�¼��ݱ��
	 * @return
	 */
	 
	public int getLoginIdent() {
		return loginIdent;
	}
	/**
	 * ��ȡ��¼��ݱ��
	 * @param loginIdent
	 */
	 
	public void setLoginIdent(int loginIdent) {
		this.loginIdent = loginIdent;
	}
	/**
	 * ����ϵ��id
	 * @return
	 */
	 
	public int getSubjectParentId() {
		return subjectParentId;
	}
	/**
	 * ��ȡϵ��id
	 * @param subjectParentId
	 * 
	 */
	 
	public void setSubjectParentId(int subjectParentId) {
		this.subjectParentId = subjectParentId;
	}
	/**
	 * ���ؿ�Ŀid
	 * @return
	 */
	public int getSubjectId() {
		return subjectId;
	}
	/**
	 * ��ȡ��Ŀid
	 * @param subjectId
	 */
	 
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	/**
	 * ���ؿ�Ŀ��id
	 * @return
	 */
	public int getSubjectOfParentId() {
		return subjectOfParentId;
	}
	/**
	 * ��ȡ��Ŀ��id
	 * @param subjectOfParentId
	 */
	public void setSubjectOfParentId(int subjectOfParentId) {
		this.subjectOfParentId = subjectOfParentId;
	}
	/**
	 * ���ؿ�Ŀ����
	 * @return
	 */
	public String getSubjectName() {
		return SubjectName;
	}
	/**
	 * ��ȡ��Ŀ����
	 * @param subjectName
	 */
	 
	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}
	/**
	 * ����ϵ������
	 * @return
	 */
	public String getSubjectParentName() {
		return subjectParentName;
	}
	/**
	 * ��ȡϵ������
	 * @param subjectParentName
	 */
	 
	public void setSubjectParentName(String subjectParentName) {
		
		this.subjectParentName = subjectParentName;
	}
	/**
	 * ���췽��
	 */
	public PersionAndLoginEntity() {
		super();
	}
	/**
	 * ���س�������
	 * @return
	 */
	 
	public Date getBirthday() {
		return birthday;
	}
	/**
	 * ��ȡ��������
	 * @param birthday
	 */
	@SuppressWarnings("deprecation")
	public void setBirthday(String birthday) {
		this.birthday = new Date(birthday);
	}
	/**
	 * ����ʡ��id
	 * @return
	 */
	 
	public int getProvinceId() {
		return provinceId;
	}
	/**
	 * ��ȡʡ��id
	 * @param provinceId
	 */
	 
	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}
	/**
	 * ���س���id
	 * @return
	 */
	public int getCityId() {
		return cityId;
	}
	/**
	 * ��ȡ����id
	 * @param cityId
	 */
	 
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	/**
	 * ���س��еĸ���id
	 * @return
	 */
	 
	public int getCityOfProvinceId() {
		return cityOfProvinceId;
	}
	/**
	 * ��ȡ���и���id
	 * @param cityOfProvinceId
	 */
	 
	public void setCityOfProvinceId(int cityOfProvinceId) {
		//�жϻ�ȡ��ֵ�Ƿ�Ϊ0�������Ϊ0�ж��Ƿ���ʡ�ݱ�����
		if (cityOfProvinceId > 0 && this.provinceId == cityOfProvinceId) {
			//�������������������ȡ����
			this.cityOfProvinceId = cityOfProvinceId;
		}
	}
	/**
	 * ����ʡ��
	 * @return
	 */
	 
	public String getProvince() {
		return province;
	}
	/**
	 * ��ȡʡ��
	 * @param province
	 */
	 
	public void setProvince(String province) {
		this.province = province;
	}
	/**
	 * ���س���
	 * @return
	 */
	 
	public String getCity() {
		return city;
	}
	/**
	 * ��ȡ����
	 * @param city
	 */
	 
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * �������֤��Ϣ
	 * @return
	 */
	 
	public String getIdentityCardId() {
		return identityCardId;
	}
	/**
	 * ��ȡһ���Ϸ������֤��
	 * @param identityCardId
	 */
	 
	public void setIdentityCardId(String identityCardId) {
		//�ж����֤�����Ƿ�Ϸ�
		if (IdentityCheckUtil.checkIDCard(identityCardId)) {
			//�Ϸ�ִ�б���
			this.identityCardId = identityCardId;
		}
	}
	/**
	 * ���ص�¼�˺�
	 * @return
	 */
	 
	public String getLoginId() {
		return loginId;
	}
	/**
	 * ��ȡ��¼�˺�
	 * @param loginId
	 */
	 
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	/**
	 * ���ص�¼����
	 * @return
	 */
	 
	public String getLoginPassword() {
		return loginPassword;
	}
	/**
	 * ��ȡ��¼����
	 * @param loginPassword
	 * �����¼����
	 */
	 
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	/**
	 * toString��������һ��String���͵��ַ���<br>
	 * ��������Ϊ���֤�ţ�ʡ�ݱ�ţ�ʡ�ݣ�<br>
	 * ���б�ţ����У���¼�˺ţ���¼��ݱ��
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "���֤�ţ�"+getIdentityCardId()
				+"\tʡ�ݱ�ţ�"+getProvinceId()
				+"\tʡ�ݣ�"+getProvince()
				+"\t���б�ţ�"+getCityId()
				+"\t���У�"+getCity()
				+"\t��¼�˺ţ�"+getLoginId()
				+"\t��¼��ݱ�ţ�"+getLoginIdent();
	}
	/**
	 * ��дhashCode()������<br>
	 * �����ɳ��б�ţ�<br>
	 * ����������ʡ�ݱ�ţ�<br>
	 * ԭʼ{@link java.lang.Object#hashCode()}���룬<br>
	 * ��ͬƴ�ӳ��ַ�����֮��תΪ�µ�hashcode����
	 * 
	 */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Integer.parseInt(this.getCityId()+
				""+this.getCityOfProvinceId()+
				""+super.hashCode());
	}
	/**
	 * �����ڴ�
	 */
	@Override
	protected void finalize() {
		// TODO Auto-generated method stub
		try {
			super.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println("����������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������\n" +
					"�����쳣��\t ��ϸ��Ϣ���£�");
			e.printStackTrace();
		}
	}
}
