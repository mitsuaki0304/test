package com.sample.spsite.action;


import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ReviewAction extends ActionSupport implements SessionAware {
	public Map<String,Object> session;
	private String type;
	public String execute(){

		if(session.containsKey("loginId")){
			String result = SUCCESS;
			return result;
		}
		String result = "login";

		type="review";
		session.put("type", type);
		return result;
	}

	@Override
	public void setSession(Map<String,Object>session){
		this.session= session;
	}
	public Map<String,Object>getSession(){
		return this.session;
	}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
