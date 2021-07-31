package com.revature.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
		
//		@Column(name = "card_status")
//		private int status;
//		
//		@Column(name = "card_category")
//		private String category;
		
		@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
		@JoinColumn(name = "user_id")
		private Users userId;
		
//		@ManyToMany(mappedBy = "cards")
//		private Collection<Users> userList = new ArrayList();
		
		@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
		@JoinColumn(name = "card_status_id")
		private Status status;
		
		@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
		@JoinColumn(name = "subject_id")
		private Subject subject;
		
//		@OneToMany(mappedBy = "roleId", fetch = FetchType.EAGER)
//		private List<Users> userList;
		
		public Cards() {
			super();
			// TODO Auto-generated constructor stub
		}

public Cards(int id, String name, String question, String answer, Users userId, Status status, Subject subject) {
	super();
	this.id = id;
	this.name = name;
	this.question = question;
	this.answer = answer;
	this.userId = userId;
	this.status = status;
	this.subject = subject;
}

public Cards(String name, String question, String answer, Users userId, Status status, Subject subject) {
	super();
	this.name = name;
	this.question = question;
	this.answer = answer;
	this.userId = userId;
	this.status = status;
	this.subject = subject;
}

public Cards(int id) {
	super();
	this.id = id;
}

public Cards(Subject subject, String name, String question, String answer, Status status) {
	this.subject=subject;
	this.name=name;
	this.question=question;
	this.answer=answer;
	this.status=status;
}

@Override
public String toString() {
	return "Cards [id=" + id + ", name=" + name + ", question=" + question + ", answer=" + answer + ", userId=" + userId
			+ ", status=" + status + ", subject=" + subject + "]";
}

@Override
public int hashCode() {
	return Objects.hash(answer, id, name, question, status, subject, userId);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Cards other = (Cards) obj;
	return Objects.equals(answer, other.answer) && id == other.id && Objects.equals(name, other.name)
			&& Objects.equals(question, other.question) && Objects.equals(status, other.status)
			&& Objects.equals(subject, other.subject) && Objects.equals(userId, other.userId);
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
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

public Users getUserId() {
	return userId;
}

public void setUserId(Users userId) {
	this.userId = userId;
}

public Status getStatus() {
	return status;
}

public void setStatus(Status status) {
	this.status = status;
}

public Subject getSubject() {
	return subject;
}

public void setSubject(Subject subject) {
	this.subject = subject;
}
		


		
		

}

		