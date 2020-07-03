package com.song.web.services;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.song.web.domains.SignDTO;

@Component
public interface SignService {
	 public void save();
	 public void update();
	 public void findOne();
	 public List<SignDTO> findAll();	
	 public void count();
	 public void delete();
	 public SignDTO findByUseridAndPassword(SignDTO person);
	 public void findByEmailOrUserId(String email, String userId);
	 public void findByCreatedAtBetween(Date fromDate, Date toDate);
	 public void findByAgeGraterThanEqual(int age);
	 public void findByNameLike(String name);
	 public void findByAccessCodeIsNull();
	 public void findByGenerLike(String gender);
	 public void findByEmailOrderByNameAsc(String email);
	
}
