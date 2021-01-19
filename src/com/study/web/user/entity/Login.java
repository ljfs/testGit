package com.study.web.user.entity;

import com.study.web.baseentity.PersionAndLoginEntity;
import com.study.web.entity.Persion;
/**
 * 登录实体类
 * @author 刘俊沣
 * @version 1.1
 * @category loginEntity
 */
public class Login extends PersionAndLoginEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 成员实体类
	 */
	private Persion persion;
	/**
	 * 登录账号
	 */
	private String loginId;
	/**
	 * 登录密码
	 */
	private String loginPassword;
	/**
	 * 登录身份
	 */
	private int loginIdent;
	public String getLoginId(){
		return loginId = super.getLoginId();
	}
	public void setLoginId(String loginId){
		this.loginId = loginId;
		super.setLoginId(this.loginId);
	}
	public String getLoginPassword(){
		return loginPassword = super.getLoginPassword();
	}
	public void setLoginPassword(String password){
		loginPassword = password;
		super.setLoginPassword(loginPassword);
	}
	public int getLoginIdent(){
		return loginIdent = super.getLoginIdent();
	}
	public void setLoginIdent(int ident){
		loginIdent = ident;
		super.setLoginIdent(loginIdent);
	}
	public int getPersionId(){
		return persion.getId();
	}
	public void setPersionLd(int id){
		persion.setId(id);
	}
}
