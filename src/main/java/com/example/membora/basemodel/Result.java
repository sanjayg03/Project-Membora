package com.example.membora.basemodel;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class Result<T> {
	
	private String code;
	private String message;
	private T data;

}
