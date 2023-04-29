package com.soni.jpaTutorial;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Candidates {
	
	@Id
	private int id;
	private String firstName;
	private String skills;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	
	@Override
	public String toString() {
		return "Candidates [id=" + id + ", firstName=" + firstName + ", skills=" + skills + "]";
	}
	
}
