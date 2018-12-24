package com.sample.spsite.dto;

public class UserDestinationDTO {
	private int id;
	private String userId;
	private String userName;
	private int userTel;
	private String userMail;
	private int userAddressNum;
	private String userAddressPrefecture;
	private String userAddressCity;
	private String userAddressOther;

	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}


	public String getUserId(){
		return userId;
	}
	public void setUserId(String userId){
		this.userId = userId;
	}


	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
		this.userName = userName;
	}


	public int getUserTel(){
		return userTel;
	}
	public void setUserTel(int userTel){
		this.userTel = userTel;
	}


	public String getuserMail(){
		return userMail;
	}
	public void setUserMail(String userMail){
		this.userMail = userMail;
	}


	public int getUserAddressNum(){
		return userAddressNum;
	}
	public void setUserAddressNum(int userAddressNum){
		this.userAddressNum = userAddressNum;
	}


	public String getUserAddressPrefecture(){
		return userAddressPrefecture;
	}
	public void setUserAddressPrefecture(String userAddressPrefecture){
		this.userAddressPrefecture = userAddressPrefecture;
	}


	public String getUserAddressCity(){
		return userAddressCity;
	}
	public void setUserAddressCity(String userAddressCity){
		this.userAddressCity = userAddressCity;
	}


	public String getUserAddressOther(){
		return userAddressOther;
	}
	public void setUserAddressOther(String userAddressOther){
		this.userAddressOther = userAddressOther;
	}


}
