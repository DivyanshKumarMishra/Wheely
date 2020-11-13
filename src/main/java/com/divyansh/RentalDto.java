package com.divyansh;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class RentalDto {

	private String firstName;
    private String lastName;
	private String email;
	private String bikeName;

	@DateTimeFormat(pattern = "yyyy-mm-dd")	
	private Date dateOut;
	
	public RentalDto() {
		
	}
	
	public RentalDto(String firstName, String lastName, String email, String bikeName, Date dateOut) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.bikeName = bikeName;
		this.dateOut = dateOut;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBikeName() {
		return bikeName;
	}

	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}

	public Date getDateOut() {
		return dateOut;
	}

	public void setDateOut(Date dateOut) {
		this.dateOut = dateOut;
	}

}
