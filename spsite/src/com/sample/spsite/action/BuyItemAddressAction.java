package com.sample.spsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.sample.spsite.dao.CartDAO;
import com.sample.spsite.dao.UserDestinationDAO;
import com.sample.spsite.dto.CartInfoDTO;
import com.sample.spsite.dto.UserDestinationDTO;

public class BuyItemAddressAction extends ActionSupport implements SessionAware{
	public Map<String, Object> session;
	private int sum;

	private String loginId;
	private ArrayList<CartInfoDTO> cartList = new ArrayList<CartInfoDTO>();
	private ArrayList<UserDestinationDTO> destinationList = new ArrayList<UserDestinationDTO>();
	private CartDAO cartDAO = new CartDAO();
	private UserDestinationDAO userDestinationDAO = new UserDestinationDAO();
	public UserDestinationDTO dto = new UserDestinationDTO();


	public String execute() throws SQLException{


		String result = SUCCESS;
		cartList=cartDAO.getSerchCartItemInfo(loginId);
		destinationList=userDestinationDAO.getUserDestinaton(loginId);
		session.put("destinationList", destinationList);

		return result;
	}

	public void setSession(Map<String,Object>session){
		this.session= session;
	}
	public Map<String,Object>getSession(){
		return this.session;
	}

	public int getSum(){
		return sum;
	}
	public void setSum(int sum){
		this.sum = sum;
	}

	public String getLoginId(){
		return loginId;
	}
	public void setLoginId(String loginId){
		this.loginId = loginId;
	}

	public ArrayList<CartInfoDTO>getCartList(){
		return this.cartList;
	}
	public void setCartList(ArrayList<CartInfoDTO>cartList){
		this.cartList = cartList;
	}

	public ArrayList<UserDestinationDTO>getDestinationList(){
		return this.destinationList;
	}
	public void setDestinationList(ArrayList<UserDestinationDTO>destinationList){
		this.destinationList = destinationList;
	}


}