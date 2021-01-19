package com.study.web.user.entity;

import java.util.Date;

import com.study.web.baseentity.PersionAndLoginEntity;

/**
 * 成员实体类
 * @author 刘俊沣
 * @category userEntity
 *
 */
public class PersionEntity extends PersionAndLoginEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 性别
	 */
	private String gender;
	/**
	 * 年龄
	 */
	private int age;
	/**
	 * 手机号
	 */
	private String moblephone;
	/**
	 * 科目
	 */
	private String subjects;
	/**
	 * 生日
	 */
	private Date birthday;
	/**
	 * 身份证号码
	 */
	private String identityCardId;
	/**
	 * QQ号码
	 */
	private String qid;
	/**
	 * 信誉度
	 */
	private int reputation;
	/**
	 * 返回id编号
	 */
	public int getId() {
		return super.getId();
	}
	/**
	 * 获取id编号
	 */
	public void setId(int id) {
		super.setId(id);
	}
	/**
	 * 返回姓名
	 */
	public String getName() {
		return super.getName();
	}
	/**
	 * 获取姓名
	 */
	public void setName(String name) {
		super.setName(name);
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * 返回省份
	 */
	public String getProvince() {
		return super.getProvince();
	}
	/**
	 * 获取省份
	 */
	public void setProvince(String province) {
		super.setProvince(province);
	}
	/**
	 * 返回城市
	 */
	public String getCity() {
		return super.getCity();
	}
	/**
	 * 获取城市
	 */
	public void setCity(String city) {
		super.setCity(city);
	}
	public String getMoblephone() {
		return moblephone;
	}
	public void setMoblephone(String moblephone) {
		this.moblephone = moblephone;
	}
	public String getSubjects() {
		return subjects;
	}
	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}
	public String getQid() {
		return qid;
	}
	public void setQid(String qid) {
		this.qid = qid;
	}
	public int getReputation() {
		return reputation;
	}
	public void setReputation(int reputation) {
		this.reputation = reputation;
	}
	/**
	 * 返回生日
	 */
	public Date getBirthday(){
		return birthday = super.getBirthday();
	}
	/**
	 * 获取生日
	 */
	public void setBirthday(Date birthday){
		this.birthday = birthday; 
		super.setBirthday(this.birthday.toString());
	}
	/**
	 * 返回身份证号
	 */
	public String getIdentityCardId(){
		return identityCardId = super.getIdentityCardId();
	}
	/**
	 * 获取身份证号
	 */
	public void setIdentityCardId(String identityId){
		identityCardId = identityId;
		super.setIdentityCardId(identityCardId);
	}
	/**
	 * 返回结果为hashCode@身份证号:手机号&QQ号
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return hashCode()+"@"+this.getIdentityCardId()+":"+getMoblephone()+"&"+getQid();
	}
}
