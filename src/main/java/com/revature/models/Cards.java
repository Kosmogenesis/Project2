package com.revature.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cards")
public class Cards {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "card_id")
		private int id;
		
		@Column(name = "card_name")
		private String name;
		
		@Column(name = "card_question")
		private String question;
		
		@Column(name = "card_answer")
		private String answer;
		
		@Column(name = "card_status")
		private int status;
		
		@Column(name = "card_category")
		private String category;
		
//		@OneToMany(mappedBy = "roleId", fetch = FetchType.EAGER)
//		private List<Users> userList;
}
