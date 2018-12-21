package com.project.mapper;


import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.project.user.User;

public class UserMapper implements RowMapper<User> {

	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		   User user = new User();
		   //user.setId(rs.getInt("id"));
		   user.setId(rs.getInt("userId"));
		   user.setUsername(rs.getString("username"));
		   user.setPassword(rs.getString("password"));
	      return user;
	   }

}
