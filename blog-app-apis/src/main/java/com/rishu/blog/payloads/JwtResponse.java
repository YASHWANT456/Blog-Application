package com.rishu.blog.payloads;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class JwtResponse {
	
	private String jwtToken;
    private UserDto user;

}
