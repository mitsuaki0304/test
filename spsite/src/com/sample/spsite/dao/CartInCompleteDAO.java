package com.sample.spsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sample.spsite.util.DBConnector;
import com.sample.spsite.util.DateUtil;

public class CartInCompleteDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private DateUtil dateUtil = new DateUtil();
	private String sql = "INSERT INTO cart_info (user_id, item_id, item_name, item_price, item_count, total_price, regist_date) VALUES(?,?,?,?,?,?,?)";

	public void cartInItemInfo(String user_id, int item_id, String item_name, int item_price, int item_count ,int total_price )throws SQLException{

		try{
			PreparedStatement preparedStatement =connection.prepareStatement(sql);
			preparedStatement.setString(1, user_id);
			preparedStatement.setInt(2, item_id);
			preparedStatement.setString(3, item_name);
			preparedStatement.setInt(4, item_price);
			preparedStatement.setInt(5, item_count);
			preparedStatement.setInt(6, total_price);
			preparedStatement.setString(7, dateUtil.getDate());
			preparedStatement.execute();

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
	}
}

