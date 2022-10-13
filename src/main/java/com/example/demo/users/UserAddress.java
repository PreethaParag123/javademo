package com.example.demo.users;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "user_address")
public class UserAddress {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	int Id;
    String address;
    int user_id;

	
    public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	@ManyToOne
	//@JsonBackReference
    @JoinColumn(name="user_id", nullable=false,insertable=false ,updatable=false)
    private Users users;
    
	
	}
	
	


