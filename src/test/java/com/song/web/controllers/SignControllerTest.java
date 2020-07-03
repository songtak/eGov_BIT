/**
 * 
 */
package com.song.web.controllers;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.song.web.services.SignService;

/**

 * @FileName : SignControllerTest.java

 * @Project : legacy

 * @Date : 2020. 7. 3. 

 * @작성자 : bit-6

 * @변경이력 :

 * @프로그램 설명 :

 */
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:META_INF/servlet-context.xml","classpath*:META-INF/root-context.xml"})

public class SignControllerTest {

	/**
	 * Test method for {@link com.song.web.controllers.SignController#join(com.song.web.domains.SignDTO)}.
	 */
	@Autowired SignService signService;
	@Test
	public void testJoin() {
		fail("Not yet implemented");
	}
	

	/**
	 * Test method for {@link com.song.web.controllers.SignController#login(javax.servlet.http.HttpSession, com.song.web.domains.SignDTO)}.
	 */
	@Test
	public void testLogin() {
		fail("Not yet implemented");
	}

}
