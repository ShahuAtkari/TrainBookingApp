package com.Springboot.Binding;

import lombok.Data;

@Data
public class PassengerInfo {
	
	private Integer passengerId;
	private String passengerFirstName;
	private String passengerLastName;
	private Integer passengerAge;
	private String passengerGender;
	private Long passengerMobile;
	private String passengerEmail;

}
