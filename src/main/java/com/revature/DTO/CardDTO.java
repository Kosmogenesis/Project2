package com.revature.DTO;

import java.util.Objects;

import com.revature.models.Status;

public class CardDTO {
	public String username;
	public String name;
	public String question;
	public String answer;
	public String subject;
	public int status;
	
	
	public CardDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CardDTO(String username, String name, String question, String answer, String subject, int status) {
		super();
		this.username = username;
		this.name = name;
		this.question = question;
		this.answer = answer;
		this.subject = subject;
		this.status = status;
	}


	@Override
	public String toString() {
		return "CardDTO [username=" + username + ", name=" + name + ", question=" + question + ", answer=" + answer
				+ ", subject=" + subject + ", status=" + status + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(answer, name, question, status, subject, username);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CardDTO other = (CardDTO) obj;
		return Objects.equals(answer, other.answer) && Objects.equals(name, other.name)
				&& Objects.equals(question, other.question) && status == other.status
				&& Objects.equals(subject, other.subject) && Objects.equals(username, other.username);
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	
}
