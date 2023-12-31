package com.sample.spsite.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import com.sample.spsite.dto.UserDestinationDTO;
import com.sample.spsite.util.DBConnector;

public class UserDestinationDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();


	public Map<String, Object> session;

	public ArrayList<UserDestinationDTO> getUserDestinaton(String loginId) throws SQLException {

		ArrayList<UserDestinationDTO> userDestinationDTO = new ArrayList<UserDestinationDTO>();
		String sql = "SELECT*FROM user_destination where user_id=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginId);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				UserDestinationDTO dto = new UserDestinationDTO();
				dto.setId(resultSet.getInt("id"));
				dto.setUserId(resultSet.getString("user_id"));
				dto.setUserName(resultSet.getString("user_name"));
				dto.setUserTel(resultSet.getString("user_tel"));
				dto.setUserMail(resultSet.getString("user_mail"));
				dto.setUserAddressNum(resultSet.getString("user_address_num"));
				dto.setUserAddressPrefecture(resultSet.getString("user_address_prefecture"));
				dto.setUserAddressCity(resultSet.getString("user_address_city"));
				dto.setUserAddressOther(resultSet.getString("user_address_other"));
				userDestinationDTO.add(dto);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return userDestinationDTO;
	}


	public ArrayList<UserDestinationDTO> getSerchDestinaton(int id) throws SQLException {

		ArrayList<UserDestinationDTO> userDestinationDTO = new ArrayList<UserDestinationDTO>();
		String sql = "SELECT*FROM user_destination where id=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				UserDestinationDTO dto = new UserDestinationDTO();
				dto.setId(resultSet.getInt("id"));
				dto.setUserId(resultSet.getString("user_id"));
				dto.setUserName(resultSet.getString("user_name"));
				dto.setUserTel(resultSet.getString("user_tel"));
				dto.setUserMail(resultSet.getString("user_mail"));
				dto.setUserAddressNum(resultSet.getString("user_address_num"));
				dto.setUserAddressPrefecture(resultSet.getString("user_address_prefecture"));
				dto.setUserAddressCity(resultSet.getString("user_address_city"));
				dto.setUserAddressOther(resultSet.getString("user_address_other"));
				userDestinationDTO.add(dto);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
		System.out.println("DAOの通貨テスト");
		return userDestinationDTO;
	}
	public Map<String, Object> getSession() {
		return this.session;
	}

}
