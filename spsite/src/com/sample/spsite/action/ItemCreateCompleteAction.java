package com.sample.spsite.action;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.sample.spsite.dao.ItemCreateCompleteDAO;

public class ItemCreateCompleteAction extends ActionSupport implements SessionAware {

	private String itemName;
	private int itemPrice;
	private int itemStock;
	private String itemMaker;
	private String itemCategory;
	public Map<String, Object> session;
	private ItemCreateCompleteDAO itemCreateCompleteDAO = new ItemCreateCompleteDAO();


	public String execute() throws SQLException {
		int intPrice = Integer.parseInt(session.get("itemPrice").toString());
		int intStock = Integer.parseInt(session.get("itemStock").toString());
		itemCreateCompleteDAO.createItem(
				session.get("itemName").toString(), intPrice, intStock,session.get("itemMaker").toString(),session.get("itemCategory").toString());
		String result = SUCCESS;

		return result;
	}

	public String getItemName(){
		return itemName;
	}
	public void setItemName(String itemName){
		this.itemName = itemName;
	}

	public int getItemPrice(){
		return itemPrice;
	}
	public void setItemPrice(int itemPrice){
		this.itemPrice = itemPrice;
	}

	public int  getItemStock(){
		return itemStock;
	}
	public void setItemStock(int itemStock){
		this.itemStock = itemStock;
	}

	public String getItemMaker() {
		return itemMaker;
	}

	public void setItemMaker(String itemMaker) {
		this.itemMaker = itemMaker;
	}

	public String getItemCategory() {
		return itemCategory;
	}

	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	@Override
	public void setSession(Map<String, Object>session){
		this.session = session;
	}
}
