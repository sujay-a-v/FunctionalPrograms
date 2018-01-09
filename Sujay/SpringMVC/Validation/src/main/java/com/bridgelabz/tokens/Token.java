package com.bridgelabz.tokens;

public interface Token {
	
	public String createToken(String subject, String id, String issuer);
	
	public void validateToken(String token);

}
