package com.funnyboy.it.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="t_user")
public class User implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name = "NAME", columnDefinition = "VARCHAR(255) DEFAULT NULL COMMENT '用户名'")
	private String name;

	@Column(name = "password", columnDefinition = "VARCHAR(50) DEFAULT NULL COMMENT '用户密码'")
	private String password;

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

}
