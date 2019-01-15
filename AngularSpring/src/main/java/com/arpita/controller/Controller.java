package com.arpita.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arpita.model.User;
import com.arpita.repost.UserRepos;

@RestController
//@RequestMapping("/api")
public class Controller {
	
	@Autowired
	UserRepos userRep;
	
	//@PostMapping("users/create")
	@RequestMapping(method=RequestMethod.POST,value="api/users/create")
	void createUser(@RequestBody User u) {
		userRep.save(u);
	}
     
	@RequestMapping(method=RequestMethod.DELETE, value="api/users/delete")
	void deleteUser(@RequestBody User u) {
		userRep.delete(u);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="api/users/update")
	void updateUser(@RequestBody User u) {
		userRep.insert(u);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="api/users/get")
	void getAllUser(@RequestBody Sort u) {
		userRep.findAll(u);
	}
	
}
