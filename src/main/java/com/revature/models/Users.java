package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

	@Entity
	@Table(name = "users")
	public class Users {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "user_id")
		private int id;
		
		@Column(name = "user_username")
		private String username;
		
		@Column(name = "user_password")
		private String password;
		
		@Column(name = "user_first_name")
		private String firstName;
		
		@Column(name = "user_last_name")
		private String lastName;
		
		@Column(name = "user_email")
		private String email;
		
		@ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(name = "card_id")
		private Cards card_id;
}
