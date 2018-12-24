package com.sample.spsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class AddressCreateConfirmAction extends ActionSupport implements SessionAware {

	private int userTel;
	private String userMail;
	private int userAddressNum;
	private String userAddressPrefecture;
	private String userAddressCity;
	private String userAddressOther;
	public Map<String, Object> session;
	private String errorMassage;

	public String execute(){
		String result = SUCCESS;

		if(!(userTel==0)
			&&!(userMail.equals(""))
			&&!(userAddressNum==0)
			&&!(userAddressPrefecture.equals(""))
			&&!(userAddressCity.equals(""))
			&& !(userAddressCity.equals(""))
			){
				session.put("loginId", session.get("loginId"));
				session.put("userName", session.get("userName"));
				session.put("userTel", userTel);
				session.put("userMail", userMail);
				session.put("userAddressNum", userAddressNum);
				session.put("userAddressPrefecture", userAddressPrefecture);
				session.put("userAddressCity", userAddressCity);
				session.put("userAddressOther", userAddressOther);



			}else{
				setErrorMassage("未入力の項目があります。");
				result = ERROR;
			}
		return result;
	}

	public int getUserTel() {
		return userTel;
	}

	public void setUserTel(int userTel) {
		this.userTel = userTel;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public int getUserAddressNum() {
		return userAddressNum;
	}

	public void setUserAddressNum(int userAddressNum) {
		this.userAddressNum = userAddressNum;
	}

	public String getUserAddressPrefecture() {
		return userAddressPrefecture;
	}

	public void setUserAddressPrefecture(String userAddressPrefecture) {
		this.userAddressPrefecture = userAddressPrefecture;
	}

	public String getUserAddressCity() {
		return userAddressCity;
	}

	public void setUserAddressCity(String userAddressCity) {
		this.userAddressCity = userAddressCity;
	}

	public String getUserAddressOther() {
		return userAddressOther;
	}

	public void setUserAddressOther(String userAddressOther) {
		this.userAddressOther = userAddressOther;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getErrorMassage() {
		return errorMassage;
	}

	public void setErrorMassage(String errorMassage) {
		this.errorMassage = errorMassage;
	}
}