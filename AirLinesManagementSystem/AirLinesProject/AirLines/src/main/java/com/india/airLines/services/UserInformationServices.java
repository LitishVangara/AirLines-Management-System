package com.india.airLines.services;

import com.india.airLines.dto.UserInformationDTO;

public interface UserInformationServices 
{
	int addUserInformation(UserInformationDTO userInformationDTO);
	UserInformationDTO findUser(int userInformationId);
	UserInformationDTO userLogin(String userName, String password);
}
