package com.song.web.mappers;

import org.apache.ibatis.annotations.Insert;
import org.mvel2.ast.Sign;
import org.springframework.stereotype.Repository;

import com.song.web.domains.SignDTO;

@Repository
public interface TxMapper {
	@Insert("insert into signs (userid, passwd)"
			+ " values #{userid}, #{password}")
	public void insertUser(SignDTO user);
}
