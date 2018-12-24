package com.sample.spsite.action;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.sample.spsite.dao.ReviewCompleteDAO;
public class ReviewCompleteAction extends ActionSupport implements SessionAware{

	private String title;
	private int rank;
	private String comment;
	public Map<String,Object>session;
	private ReviewCompleteDAO reviewCompleteDAO = new ReviewCompleteDAO();

	public String execute() throws SQLException {
		reviewCompleteDAO.userReview(
				session.get("loginId").toString(),
				Integer.parseInt(session.get("itemId").toString()),
				session.get("userName").toString(),
				session.get("itemName").toString(),
				session.get("title").toString(),
				Integer.parseInt(session.get("rank").toString()),
				session.get("comment").toString()
				);

		String result = SUCCESS;

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

	@Override
	public void setSession(Map<String,Object>session){
		this.session = session;
	}
}
