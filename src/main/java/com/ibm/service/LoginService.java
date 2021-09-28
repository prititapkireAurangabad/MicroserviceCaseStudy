package com.ibm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.modal.LoginContaint;
import com.ibm.repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	LoginRepository logRepo;

	public void postDataServ(LoginContaint lc) {
		// TODO Auto-generated method stub
		logRepo.save(lc);
	}

	public LoginContaint getDataServ(String userName, String password) {
		// TODO Auto-generated method stub

		
	
        
		return logRepo.findByUserNameAndPassword(userName, password);
	}
}
