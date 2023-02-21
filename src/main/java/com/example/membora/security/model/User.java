package com.example.membora.security.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.membora.basemodel.BaseModel;

import lombok.Data;

@Data
@Document("tbl_User")
public class User extends BaseModel{

	private static final long serialVersionUID = 1L;
	
	@Id
	private String userId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	private String businessName;
	private String businessType;
	private String dateOfBirth;
}
