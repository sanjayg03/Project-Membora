package com.example.membora.basemodel;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Data
public class BaseModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Field
	@CreatedDate
	protected Date createdOn;

	@Field
	@LastModifiedDate
	protected Date modifiedOn;

	@Field
	@CreatedBy
	protected String createdBy;

	@Field
	@LastModifiedBy
	protected String modifiedBy;

	@Field
	@Version
	protected Integer versionNo;
}
