package com.ibm.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginContaint {

	@Id
	@GeneratedValue
	private int custmerId;
	
	@Size(min=5, max=100, message="Description must be bw 5-100")
	private String customerName;
	
	@NotBlank(message = "User name can't be empty!")
	private String userName;
	
	@NotBlank(message = "Password can't be null !")
	private String password;

	public static boolean isPresent() {
		// TODO Auto-generated method stub
		return false;}
	private String token;
	
}
