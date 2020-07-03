package com.song.web.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.mvel2.ast.Sign;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.song.web.domains.SignDTO;
import com.song.web.enums.Messenger;
import com.song.web.services.SignService;

@RestController
@RequestMapping("/sign")
@SessionAttributes({"session"})
public class SignController {
@Autowired SignService signService;

	private static final Logger logger = LoggerFactory.getLogger(SignController.class);
	
	@PostMapping("/users")
	public Messenger join(@RequestBody SignDTO SignDTO) {
		logger.info(SignDTO.toString());
		return Messenger.SUCCESS; 
	}
	
	
	@PostMapping("/logins")
	public SignDTO login(HttpSession session, @RequestBody SignDTO SignDTO) {
		SignDTO returnSign = signService.findByUseridAndPassword(SignDTO);
		session.setAttribute("session", returnSign);
		return returnSign; 
	}
	@GetMapping("/users")
	public void list(Model model) 
			List<SignDTO> 1 = new ArrayList
		
}



