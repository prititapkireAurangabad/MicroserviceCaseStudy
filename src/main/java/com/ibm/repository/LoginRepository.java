package com.ibm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.modal.LoginContaint;

@Repository
public interface LoginRepository extends JpaRepository<LoginContaint, Integer> {
	public LoginContaint findByUserNameAndPassword(String userName, String password);
}
