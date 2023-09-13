package com.india.airLines.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Builder
@Table(name = "userinformation")
public class UserInformation 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userInformationId;
	
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private String gender;
	private String userName;
	private String password;
	private String confirmPassword;
}
