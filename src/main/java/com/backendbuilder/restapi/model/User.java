package com.backendbuilder.restapi.model;

import javax.persistence.*;

@Entity
@Table(name = "Users")
public class User {
  private long id;
  private String email;
  private String username;
  private String password;

  public User() {
  }

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  public long getId() {
    return id;
  }

	public void setId(long input) {
		this.id = input;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String input) {
		this.email = input;
	}
	
  public String getUsername() {
    return username;
  }

	public void setUsername(String input) {
		this.username = input;
	}
	
  public String getPassword() {
		return password;
	}
	
  public void setPassword(String input) {
		this.password = input;
	}
  
}
