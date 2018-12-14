package com.internousdev.ecsite.action;
import java.sql.SQLException;

import com.internousdev.ecsite.dao.UserListDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;
public class UserListDeleteCompleteAction extends ActionSupport  {

	private UserListDeleteCompleteDAO userListDeleteCompleteDAO = new UserListDeleteCompleteDAO();

	private String message;

	public String execute() throws SQLException{
		int res = userListDeleteCompleteDAO.userInfoDelete();
		if(res>0){
			setMessage("商品情報を正しく削除しました。");
		}else if(res==0){
			setMessage("商品情報の削除に失敗しました。");
		}
/////////
		System.out.println("Action-userのresの件数"+res);
/////////
		String result = SUCCESS;
		return result;
	}


	public String getMessage(){
		return this.message;
	}
	public void setMessage(String message){
		this.message=message;
	}
}