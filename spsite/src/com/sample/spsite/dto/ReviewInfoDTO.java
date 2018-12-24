package com.sample.spsite.dto;

public class ReviewInfoDTO {
	private String userId;
	private int itemId;
	private String userName;
	private String itemName;
	private String title;
	private int rank;
	private String comment;
	private int avg;


	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public int getRank() {
		return rank;
	}

	public void setRank(int rank ) {
		this.rank = rank;
	}
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public int getAvg() {
		return avg;
	}

	public void setAvg(int avg)  {
		this.avg = avg;
	}



}
