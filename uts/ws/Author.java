package uts.ws;

import java.io.*;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD) 
@XmlRootElement(name = "user") //xml root element
public class Author implements Serializable{
//The author
	private String email;
	private String name;
	private String password;
	private String biography;
	private String dob;
	public Author(){
		super();
	}

	public Author(String email, String name, String password, String biography, String dob) {
		// TODO Auto-generated constructor stub
		super();
		this.email = email;
		this.name = name;
		this.password = password;
		this.biography = biography;
		this.dob = dob;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
