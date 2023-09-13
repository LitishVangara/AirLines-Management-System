package com.india.airLines.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.india.airLines.service.StaticScannerAndPrint.*;

import java.util.Optional;

import com.india.airLines.dto.UserInformationDTO;

import com.india.airLines.entity.UserInformation;

import com.india.airLines.repository.UserInformationRepository;

@Service
public class UserInformationServicesImplementation implements UserInformationServices
{
	@Autowired
	private UserInformationRepository userInformationRepository;
	@Override
	public int addUserInformation(UserInformationDTO userInformationDTO) 
	{
		UserInformation userInformation = userInformationRepository.save(UserInformation.builder()
				.firstName(userInformationDTO.getFirstName())
				.lastName(userInformationDTO.getLastName())
				.mobileNumber(userInformationDTO.getMobileNumber())
				.gender(userInformationDTO.getGender())
				.userName(userInformationDTO.getUserName())
				.password(userInformationDTO.getPassword())
				.confirmPassword(userInformationDTO.getConfirmPassword())
				.build());
		println(userInformation);
		return userInformation.getUserInformationId();
	}
	@Override
	public UserInformationDTO findUser(int userInformationId) 
	{
		Optional<UserInformation> userInformation = userInformationRepository.findById(userInformationId);
		if (userInformation.isPresent()) 
		{
			UserInformation userInformation2 = userInformation.get();
			UserInformationDTO userInformationDTO = UserInformationDTO.builder()
					.firstName(userInformation2.getFirstName())
					.lastName(userInformation2.getLastName())
					.mobileNumber(userInformation2.getMobileNumber())
					.gender(userInformation2.getGender())
					.userName(userInformation2.getUserName())
					.password(userInformation2.getPassword())
					.confirmPassword(userInformation2.getConfirmPassword())
					.build();
			println(userInformationDTO);
			return userInformationDTO;
		}
		else
		{
			return null;
		}
	}
	@Override
	public UserInformationDTO userLogin(String userName, String password) 
	{
		UserInformation userInformation = userInformationRepository.loginUser(userName, password);
		if (userInformation != null) 
		{
			UserInformationDTO userInformationDTO = UserInformationDTO.builder()
					.firstName(userInformation.getFirstName())
					.lastName(userInformation.getLastName())
					.build();
			println(userInformationDTO);
			return userInformationDTO;
		}
		else
		{
			return null;
		}
	}
}
