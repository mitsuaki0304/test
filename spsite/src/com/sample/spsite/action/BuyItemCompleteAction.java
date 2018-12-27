package com.sample.spsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.sample.spsite.dao.BuyItemCompleteDAO;
import com.sample.spsite.dao.CartDAO;
import com.sample.spsite.dao.UserDestinationDAO;
import com.sample.spsite.dto.CartInfoDTO;
import com.sample.spsite.dto.UserDestinationDTO;

public class BuyItemCompleteAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;
	private String loginId;
	private String pay;

	private int id;
	private BuyItemCompleteDAO buyItemCompleteDAO = new BuyItemCompleteDAO();
	private CartDAO cartDAO = new CartDAO();
	private UserDestinationDAO userDestinationDAO = new UserDestinationDAO();
	private ArrayList<CartInfoDTO> cartList = new ArrayList<CartInfoDTO>();
	private ArrayList<UserDestinationDTO> destinationList = new ArrayList<UserDestinationDTO>();

	private String userAddressNum;
	private String userAddressPrefecture;
	private String userAddressCity;
	private String userAddressOther;

	public String execute() throws SQLException {
		destinationList=userDestinationDAO.getSerchDestinaton(id);
		for (int i = 0; i < destinationList.size(); ++i) {

			userAddressNum=destinationList.get(i).getUserAddressNum();
			userAddressPrefecture = destinationList.get(i).getUserAddressPrefecture();
			userAddressCity=destinationList.get(i).getUserAddressCity();
			userAddressOther=destinationList.get(i).getUserAddressOther();

		}
		cartList = cartDAO.getCartItemInfo(loginId);
		for (int i = 0; i < cartList.size(); ++i) {
			System.out.println("ItemId"+cartList.get(i).getItemId());
			System.out.println("ItemName"+cartList.get(i).getItemName());
			System.out.println("ItemPrice"+cartList.get(i).getItemPrice());
			System.out.println("ItemCount"+cartList.get(i).getItemCount());
			System.out.println("TotalPrice"+cartList.get(i).getTotalPrice());
			System.out.println("payテスト"+pay);
			buyItemCompleteDAO.buyItemInfo(
					cartList.get(i).getItemId(),
					cartList.get(i).getItemName(),
					cartList.get(i).getItemPrice(),
					cartList.get(i).getItemCount(),
					cartList.get(i).getTotalPrice(),
					cartList.get(i).getUserId(),
					session.get("pay").toString(),
					userAddressNum,
					userAddressPrefecture,
					userAddressCity,
					userAddressOther
					);
		}
		cartDAO.deleteCart(loginId);
		String result = SUCCESS;
		return result;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
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
	public void serCartList(ArrayList<CartInfoDTO>cartList){
		this.cartList = cartList;
	}

	public String getPay(){
		return pay;
	}

	public void setPay(String pay){
		this.pay = pay;
	}
	public String getUserAddressNum(){
		return userAddressNum;
	}
	public void setUserAddressNum(String userAddressNum){
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

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
	}

}
//
// id int primary key not null auto_increment,
// user_id varchar(16),
// item_id int not null,
// item_name varchar(255),
// item_price int not null,
// item_count int not null,
// total_price int not null,
// regist_date datetime not null
//