package com.divyansh.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rental {
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	private String firstName;
    private String lastName;
	private String email;
	private String bikeName;

	@DateTimeFormat(pattern = "yyyy-mm-dd")	
	private Date dateOut;
	
	
	public Rental() {
		
	}
			
		
	public Rental(String firstName, String lastName, String email, String bikeName, Date dateOut) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.bikeName = bikeName;
		this.dateOut = dateOut;
	}


	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
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