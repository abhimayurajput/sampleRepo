package com.numbers;

public class OtpGenerator {
	public static void main(String[] args) {
		System.out.println(generateOTP());
	}
	public static String generateOTP() {
		String otp="";
		for(int i=0;i<6;i++) {
			otp=otp+String.valueOf((int)(Math.random()*10));
		}
		return otp;
	}

}
