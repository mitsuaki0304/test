package com.sample.spsite.dto;

public class CartInfoDTO {
	private String userId;
	private  int itemId;
	private  String itemName;
	private  int itemPrice;
	private int itemCount;
	private int totalPrice;
	private String regist_date;

	public String getUserId(){
		return userId;
	}
	public void setUserId(String userId){
		this.userId = userId;
	}


	public int getItemId(){
		return itemId;
	}
	public void setItemId(int itemId){
		this.itemId = itemId;
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



	public int getItemCount(){
		return itemCount;
	}
	public void setItemCount(int itemCount){
		this.itemCount = itemCount;
	}


	public int getTotalPrice(){
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice){
		this.totalPrice = totalPrice;
	}


	public String getRegist_date(){
		return regist_date;
	}
	public void setRegist_date(String regist_date){
		this.regist_date = regist_date;
	}
}
