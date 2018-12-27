package com.sample.spsite.dto;

public class BuyItemHistoryDTO {

	public String itemName;

	public int itemPrice;

	public int itemCount;

	public String totalPrice;

	public String payment;

	private int userAddressNum;

	private String userAddressPrefecture;

	private String userAddressCity;

	private String userAddressOther;

	public String insert_date;

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

	public String getTotalPrice(){
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice){
		this.totalPrice = totalPrice;
	}


	public String getPayment(){
		return payment;
	}
	public void setPayment(String payment){
		this.payment = payment;
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

	public String getInsert_date(){
		return insert_date;
	}

	public void setInsert_date(String insert_date){
		this.insert_date = insert_date;
	}

}
