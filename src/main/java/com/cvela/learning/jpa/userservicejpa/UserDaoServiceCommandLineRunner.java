package com.cvela.learning.jpa.userservicejpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cvela.learning.jpa.userservicejpa.entity.User;
import com.cvela.learning.jpa.userservicejpa.service.UserDaoService;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {

	@Autowired
	private UserDaoService userDaoService;
	
	private static final Logger log 
		= LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Jack", "Admin");
		long insert = userDaoService.insert(user);
		log.info("New User is created : " + user);
	}
}
