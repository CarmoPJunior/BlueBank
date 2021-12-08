package com.example.BlueBank.DTOExceptions;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class ErrorResponse {

	private final String message;
	private final int code;
	private final String status;
	private final String objectName;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private final Date data;
	private final List<ErrorObject> errors;

	public ErrorResponse(String message, int code, String status, String objectName, Date data,
			List<ErrorObject> errors) {
		super();
		this.message = message;
		this.code = code;
		this.status = status;
		this.objectName = objectName;
		this.data = data;
		this.errors = errors;
	}

	public String getMessage() {
		return message;
	}

	public int getCode() {
		return code;
	}

	public String getStatus() {
		return status;
	}

	public String getObjectName() {
		return objectName;
	}

	public Date getData() {
		return data;
	}

	public List<ErrorObject> getErrors() {
		return errors;
	}

}
