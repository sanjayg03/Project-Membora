package com.example.membora.security.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.example.membora.basemodel.BaseModel;


/**
 * @author Mavensi Lap020
 *
 */
@Document("tbl_customer")
public class Customer extends BaseModel{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Field(name = "customerId")
    private String customerId;
    
	@Field(name = "firstName")
	private String firstName;
	
	@Field(name = "lastName")
	private String lastName;
	
	@Field(name = "phoneNumber")
	private String phoneNumber;
	
	@Field(name = "email")
	private String email;
	
	@Field(name = "joiningDate")
	private Date joiningDate;
	
	@Field(name = "reminder")
	private boolean reminder;

	@Field(name = "dateOfBirth")
	private String dateOfBirth;
	
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}


	public boolean isReminder() {
		return reminder;
	}

	public void setReminder(boolean reminder) {
		this.reminder = reminder;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
	
	
	
	
	
	
	
}
