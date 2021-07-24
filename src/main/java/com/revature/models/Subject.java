package com.revature.models;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "subjects")
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "subject_id")
	private int id;
	
	@Column(name = "subject_name")
	private String subjectName;
	
//	@OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
//	private List<Cards> cardList;
	
	
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

public Subject(int id, String subjectName) {
	super();
	this.id = id;
	this.subjectName = subjectName;
}

public Subject(String subjectName) {
	super();
	this.subjectName = subjectName;
}

@Override
public String toString() {
	return "Subject [id=" + id + ", subjectName=" + subjectName + "]";
}

@Override
public int hashCode() {
	return Objects.hash(id, subjectName);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Subject other = (Subject) obj;
	return id == other.id && Objects.equals(subjectName, other.subjectName);
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getSubjectName() {
	return subjectName;
}

public void setSubjectName(String subjectName) {
	this.subjectName = subjectName;
}

	

}
