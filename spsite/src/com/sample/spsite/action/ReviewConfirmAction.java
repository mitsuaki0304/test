package com.sample.spsite.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
public class ReviewConfirmAction extends ActionSupport implements SessionAware{

	private String title;
	private int rank;
	private String comment;
	public Map<String,Object> session;
	private String errorMassage;
	private String itemName;
	private String loginId;
	private int itemId;
	private String userName;

	public String execute(){
		String result = SUCCESS;

		System.out.println("reviewtest1itemId"+itemId);
		System.out.println("reviewtest2userName"+userName);
		if(!(title.equals(""))
			&&!(rank ==0)
			&&!(comment.equals(""))){
				session.put("loginId", loginId);
				session.put("itemId", itemId);
				session.put("userName", userName);
				session.put("itemName", itemName);
				session.put("title", title);
				session.put("rank", rank);
				session.put("comment", comment);
			}else{
				setErrorMassage("未入力の項目があります。");
				result = ERROR;
			}
		return result;
	}

	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title = title;
	}

	public int Rank(){
		return rank;
	}
	public void setRank(int rank){
		this.rank = rank;
	}

	public String Comment(){
		return comment;
	}
	public void setComment(String comment){
		this.comment = comment;
	}

	public String getItemName(){
		return itemName;
	}
	public void setItemName(String itemName){
		this.itemName = itemName;
	}

	public String getLoginId(){
		return loginId;
	}
	public void setLoginId(String loginId){
		this.loginId = loginId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId ) {
		this.itemId = itemId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public void setSession(Map<String,Object>session){
		this.session = session;
	}
	public String getErrorMassage(){
		return errorMassage;
	}
	public void setErrorMassage(String errorMassage){
		this.errorMassage=errorMassage;
	}
}
