package com.india.airLines.controller;

import static com.india.airLines.service.StaticScannerAndPrint.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.india.airLines.dto.UserInformationDTO;

import com.india.airLines.services.UserInformationServices;

@RestController
@RequestMapping("/userInformation")
public class UserInformationController 
{
	@Autowired
	private UserInformationServices userInformationServices;
	@PostMapping("/u1")
	public ResponseEntity<String> addUserInformation(@RequestBody UserInformationDTO userInformationDTO)
	{
		println(userInformationDTO);
		int id = userInformationServices.addUserInformation(userInformationDTO);
		return ResponseEntity.status(HttpStatus.CREATED).body("Id is : "+ id);
	}
	@GetMapping("/u2/{userInformationId}")
	public ResponseEntity<UserInformationDTO> findUser(@PathVariable("userInformationId") int userInformationId)
	{
		UserInformationDTO userInformationDTO = userInformationServices.findUser(userInformationId);
		if (userInformationDTO != null) 
		{
			println(userInformationId);
			println(userInformationDTO);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(userInformationDTO);
		}
		else
		{
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}
	@GetMapping("/u3/{userName}/{password}")
	public ResponseEntity<String> userLogin(@PathVariable("userName") String userName, @PathVariable("password") String password)
	{
		UserInformationDTO userInformationDTO = userInformationServices.userLogin(userName, password);
		if (userInformationDTO != null) 
		{
			println(userInformationDTO);
			return ResponseEntity.accepted().body("Login Successfull... = FirstName : "+userInformationDTO.getFirstName()+" and LastName : "+userInformationDTO.getLastName());
		}
		else
		{
			return ResponseEntity.badRequest().body("Failed to Login...");
		}
	}
}
