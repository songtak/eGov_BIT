package com.song.web.services;


import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.song.web.domains.SignDTO;
import com.song.web.mappers.SignMapper;


@Service
public class SignServiceImpl implements SignService{
	private static final Logger logger = LoggerFactory.getLogger(SignServiceImpl.class);
	@Autowired SignMapper signMapper;
	@Autowired SignDTO signDTO;
	/* (non-Javadoc)
	 * @see kr.co.bitcamp.services.PersonService#save()
	 */
	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see kr.co.bitcamp.services.PersonService#update()
	 */
	@Override
	public void update() {
		
		
	}
	/* (non-Javadoc)
	 * @see kr.co.bitcamp.services.PersonService#findOne()
	 */
	@Override
	public void findOne() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see kr.co.bitcamp.services.PersonService#count()
	 */
	@Override
	public void count() {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see kr.co.bitcamp.services.PersonService#delete()
	 */
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see kr.co.bitcamp.services.PersonService#findByEmailAndUserId(java.lang.String, java.lang.String)
	 */
	@Override
	public SignDTO findByUseridAndPassword(SignDTO param){
		return signMapper.selectByUseridAndPassword(param);
	}
	/* (non-Javadoc)
	 * @see kr.co.bitcamp.services.PersonService#findByEmailOrUserId(java.lang.String, java.lang.String)
	 */
	@Override
	public void findByEmailOrUserId(String email, String userId) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see kr.co.bitcamp.services.PersonService#findByCreatedAtBetween(java.util.Date, java.util.Date)
	 */
	@Override
	public void findByCreatedAtBetween(Date fromDate, Date toDate) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see kr.co.bitcamp.services.PersonService#findByAgeGraterThanEqual(int)
	 */
	@Override
	public void findByAgeGraterThanEqual(int age) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see kr.co.bitcamp.services.PersonService#findByNameLike(java.lang.String)
	 */
	@Override
	public void findByNameLike(String name) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see kr.co.bitcamp.services.PersonService#findByAccessCodeIsNull()
	 */
	@Override
	public void findByAccessCodeIsNull() {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see kr.co.bitcamp.services.PersonService#findByGenerLike(java.lang.String)
	 */
	@Override
	public void findByGenerLike(String gender) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see kr.co.bitcamp.services.PersonService#findByEmailOrderByNameAsc(java.lang.String)
	 */
	@Override
	public void findByEmailOrderByNameAsc(String email) {
		// TODO Auto-generated method stub
		
	}
	
	
}
