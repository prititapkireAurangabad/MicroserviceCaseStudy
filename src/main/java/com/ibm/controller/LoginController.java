package com.ibm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.modal.LoginContaint;
import com.ibm.service.LoginService;

@RestController
public class LoginController {

	@Autowired
	LoginService logserv;
	
	
	@PostMapping("/post")
	public String postData(@RequestBody LoginContaint lc) {
		logserv.postDataServ(lc);
		return "data save successfully";
	}
	
	@GetMapping("/getData/{userName}/{password}")
	public LoginContaint getData(@PathVariable String userName, @PathVariable String password) {
		LoginContaint lc= logserv.getDataServ(userName, password);
		return lc;
	}
}
