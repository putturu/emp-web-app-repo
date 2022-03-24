package com.sapient.aem.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {
	private Integer userId;
	private String userName;
	private String password;
	private Role role;
	
	
	public User(String userName, String password, Role role) {
		super();
		this.userName = userName;
		this.password = password;
		this.role = role;
	}
	
	
	
}
