package com.rishu.blog.payloads;

import java.util.HashSet;
import java.util.Set;

import com.rishu.blog.entity.Role;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	
	private int id;
	
	@NotEmpty(message = "user name should not be empty")
	private String name;
	
	@Email(message = "not a valid email")
	private String email;
	
	@NotNull(message = "password should not be null")
	private String password;
	
	@NotNull(message = "about should not be null")
	private String about; 
	
	private Set<RoleDto> roles = new HashSet<>();


}
