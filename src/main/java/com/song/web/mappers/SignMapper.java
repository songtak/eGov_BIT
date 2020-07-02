package com.song.web.mappers;

import java.util.HashMap;


import org.springframework.stereotype.Repository;

import com.song.web.domains.SignDTO;

@Repository
public interface SignMapper {
	public void insertUser(SignDTO user);
	public SignDTO selectByUseridAndPassword(SignDTO signDTO);
	public int existId(String userid);
	public int countUsers();
	public void createDB(HashMap<String, String> paramMap);
	public void createUser(HashMap<String, String> paramMap);
	public void dropUser(HashMap<String, String> paramMap);
	public void truncatePerson(HashMap<String, String> paramMap);
}