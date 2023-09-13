package com.india.airLines.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.india.airLines.entity.UserInformation;

public interface UserInformationRepository extends JpaRepository<UserInformation, Integer>
{
	@Query("SELECT u1 FROM UserInformation u1 WHERE u1.userName = :userName AND u1.password = :password")
	UserInformation loginUser(@Param("userName") String userName, @Param("password") String password);
}
