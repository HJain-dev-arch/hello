package org.studyeasy.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="hj2")
@Table(name = "hj2")
public class hj2 {

	@Id
	@Column(name = "user_id")
	int userId;

	@Column(name = "name")
	String name;

	@Column(name = "password")
	String password;
	
	public hj2()
	{
		
	}
	public hj2(String name, String password) {
		
		this.name = name;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "hj2 [userId=" + userId + ", name=" + name + ", password=" + password + "]";
	}
	
}