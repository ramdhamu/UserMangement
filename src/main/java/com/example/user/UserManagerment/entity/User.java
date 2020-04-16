package com.example.user.UserManagerment.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@Table(name = "user")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="AGE")
	private int age;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Column(name="EMAIL")
	private String email;

	@Column(name="FIRST_NAME")
	private String firstName;

	@Column(name="GENDER")
	private int gender;

	@Column(name="LAST_NAME")
	private String lastName;

	@Column(name="PASS_WORD")
	private String passWord;

	@Column(name="USER_NAME")
	private String userName;

	public User() {
	}
	

	public User(int age, String createdBy, Date createdDate, String email, String firstName, int gender,
			String lastName, String passWord, String userName) {
		super();
		this.age = age;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.email = email;
		this.firstName = firstName;
		this.gender = gender;
		this.lastName = lastName;
		this.passWord = passWord;
		this.userName = userName;
	}


	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getGender() {
		return this.gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassWord() {
		return this.passWord;
	}

	public void setPassword(String passWord) {
		this.passWord = passWord;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}