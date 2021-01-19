package com.study.web.user.entity;

import com.study.web.baseentity.PersionAndLoginEntity;

/**
 * 登录身份类
 * @author 刘俊沣
 * @version 1.1
 * @category LoginIdent
 *
 */
public class Ident extends PersionAndLoginEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 身份编号
	 */
	private int identId;
	/**
	 * 身份名称
	 */
	private String identname;
	public int getLoginIdent() {
		return identId = super.getLoginIdent();
	}
	public void setLoginIdent(int identId) {
		this.identId = identId;
		super.setLoginIdent(this.identId);
	}
	public String getIdentname() {
		return identname;
	}
	public void setIdentname(String identname) {
		this.identname = identname;
	}
}
