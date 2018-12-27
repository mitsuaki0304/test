package com.sample.spsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sample.spsite.util.DBConnector;

public class AddressCreateCompleteDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();

	private String sql = "INSERT INTO user_destination (user_id, user_name, user_tel, user_mail, user_address_num, user_address_prefecture, user_address_city, user_address_other) VALUES(?,?,?,?,?,?,?,?)";

	public void createAddress(String loginId, String userName, int userTel, String userMail, int userAddressNum ,String userAddressPrefecture,
			String userAddressCity, String userAddressOther)throws SQLException{

		try{
			PreparedStatement preparedStatement =connection.prepareStatement(sql);
			preparedStatement.setString(1, loginId);
			preparedStatement.setString(2, userName);
			preparedStatement.setInt(3, userTel);
			preparedStatement.setString(4, userMail);
			preparedStatement.setInt(5, userAddressNum);
			preparedStatement.setString(6, userAddressPrefecture);
			preparedStatement.setString(7, userAddressCity);
			preparedStatement.setString(8, userAddressOther);
			preparedStatement.execute();

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
	}
}