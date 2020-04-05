package com.tfg.keybank.ws.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@NamedQueries({ @NamedQuery(name = "User.findAll", query = "select u from User u") })
@Table(name = "user_master")
@Data
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	String username;
	String password;
	
}
