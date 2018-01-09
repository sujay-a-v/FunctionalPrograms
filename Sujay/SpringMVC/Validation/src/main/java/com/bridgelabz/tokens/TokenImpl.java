package com.bridgelabz.tokens;

import java.util.Calendar;
import java.util.Date;

public class TokenImpl implements Token {

	@Override
	public String createToken(String subject, String id, String issuer) {
		Calendar calendar=Calendar.getInstance();
		Date currentDate=new Date();
		
		JwtBuilder builder=new JwtBuilder()
		return null;
	}

	@Override
	public void validateToken(String token) {
		// TODO Auto-generated method stub
		
	}

}
