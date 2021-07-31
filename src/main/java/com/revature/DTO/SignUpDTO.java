package com.revature.DTO;

import java.util.Objects;

public class SignUpDTO {

	
	public String firstName;
	public String lastName;
	public String email;
	public String username;
	public String password;
	
	
	
	//Boilerplate code-----------------------------------------------------------------------------------------
	public SignUpDTO() {
		super();
		// TODO Auto-generated constructor stub
	}



	public SignUpDTO(String firstName, String lastName, String email, String username, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = username;
		this.password = password;
	}



	@Override
	public String toString() {
		return "SignUpDTO [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", username="
				+ username + ", password=" + password + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(email, firstName, lastName, password, username);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SignUpDTO other = (SignUpDTO) obj;
		return Objects.equals(email, other.email) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(password, other.password)
				&& Objects.equals(username, other.username);
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

	


	
	
	
}
