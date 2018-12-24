package com.sample.spsite.action;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.sample.spsite.dao.BuyItemListDAO;
import com.sample.spsite.dao.ReviewCompleteDAO;
import com.sample.spsite.dto.BuyItemInfoDTO;
import com.sample.spsite.dto.ReviewInfoDTO;
public class BuyItemDetailAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;

	private ArrayList<BuyItemInfoDTO> buyItemList = new ArrayList<BuyItemInfoDTO>();
	private ArrayList<ReviewInfoDTO> reviewList = new ArrayList<ReviewInfoDTO>();
	ReviewInfoDTO avg = new ReviewInfoDTO();
	private int itemId;
	public String sql;
	private ReviewCompleteDAO reviewCompleteDAO = new ReviewCompleteDAO();
	public String execute() throws SQLException {

		sql = "SELECT*FROM item_info_transaction";

		BuyItemListDAO buyItemListDAO = new BuyItemListDAO();
		BuyItemInfoDTO buyItemInfoDTO  = new BuyItemInfoDTO();
		buyItemInfoDTO = buyItemListDAO.getBuyItemInfo(itemId);
		buyItemList = buyItemListDAO.getBuyItemListInfo(sql);

		session.put("itemId", buyItemInfoDTO.getItemId());
		session.put("itemName", buyItemInfoDTO.getItemName());
		session.put("itemPrice", buyItemInfoDTO.getItemPrice());
		session.put("itemStock", buyItemInfoDTO.getItemStock());
		session.put("itemMaker", buyItemInfoDTO.getItemMaker());
		session.put("itemCategory", buyItemInfoDTO.getItemCategory());

		reviewList=reviewCompleteDAO.serchReview(itemId);

		avg=reviewCompleteDAO.reviewAvg(itemId);

		String result = SUCCESS;
		return result;

	}
	@Override
	public void setSession(Map<String,Object>session){
		this.session = session;
	}

	public ArrayList<BuyItemInfoDTO>getBuyItemList(){
		return this.buyItemList;
	}
	public ArrayList<ReviewInfoDTO>getReviewList(){
		return this.reviewList;
	}

	public int getItemId(){
		return itemId;
	}
	public void setItemId(int itemId){
		this.itemId = itemId;
	}

	public ReviewInfoDTO getAvg() {
		return avg;
	}

	public void setAvg(ReviewInfoDTO avg) {
		this.avg=avg;
	}

}
