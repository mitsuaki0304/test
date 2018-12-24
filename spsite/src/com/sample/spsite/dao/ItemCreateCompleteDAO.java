package com.sample.spsite.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sample.spsite.util.DBConnector;

public class ItemCreateCompleteDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();


	private String sql = "INSERT INTO item_info_transaction(item_name, item_price, item_stock, item_maker, item_category) VALUES(?,?,?,?,?)";

	public void createItem(String itemName, int itemPrice, int itemStock, String itemMaker, String itemCategory)throws SQLException{
		try{
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, itemName);
		preparedStatement.setInt(2, itemPrice);
		preparedStatement.setInt(3, itemStock);
		preparedStatement.setString(4, itemMaker);
		preparedStatement.setString(5, itemCategory);

		preparedStatement.execute();

	}catch(Exception e){
		e.printStackTrace();
	}finally{
		connection.close();
	}

	}
}
