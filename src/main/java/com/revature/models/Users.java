package com.revature.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
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
		
//		@ManyToMany
//		private Collection<Cards> cards = new ArrayList<Cards>();

		public Users() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Users(int id, String username, String password, String firstName, String lastName, String email,
				Cards card_id) {
			super();
			this.id = id;
			this.username = username;
			this.password = password;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.card_id = card_id;
		}

		public Users(String username, String password, String firstName, String lastName, String email, Cards card_id) {
			super();
			this.username = username;
			this.password = password;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.card_id = card_id;
		}

		@Override
		public String toString() {
			return "Users [id=" + id + ", username=" + username + ", password=" + password + ", firstName=" + firstName
					+ ", lastName=" + lastName + ", email=" + email + ", card_id=" + card_id + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(card_id, email, firstName, id, lastName, password, username);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Users other = (Users) obj;
			return Objects.equals(card_id, other.card_id) && Objects.equals(email, other.email)
					&& Objects.equals(firstName, other.firstName) && id == other.id
					&& Objects.equals(lastName, other.lastName) && Objects.equals(password, other.password)
					&& Objects.equals(username, other.username);
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Cards getCard_id() {
			return card_id;
		}

		public void setCard_id(Cards card_id) {
			this.card_id = card_id;
		}
		
		
		
}
