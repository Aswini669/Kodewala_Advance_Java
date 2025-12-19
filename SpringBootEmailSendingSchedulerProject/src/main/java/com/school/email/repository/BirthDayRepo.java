package com.school.email.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.school.email.entity.UserBirthday;

@Repository
public interface BirthDayRepo extends JpaRepository<UserBirthday, Long>{

	@Query(value = "SELECT * FROM user_birthday WHERE MONTH(birthday) = MONTH(CURDATE()) " +
	           "AND DAY(birthday) = DAY(CURDATE())", nativeQuery = true)
	List<UserBirthday> findTodayBirthDay();
}
