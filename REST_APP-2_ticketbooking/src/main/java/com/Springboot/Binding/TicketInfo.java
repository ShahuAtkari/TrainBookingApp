package com.Springboot.Binding;

import lombok.Data;

@Data
public class TicketInfo {
	
	private Integer trainNumber;
	private String boardingStation;
	private String destinationStation;
	private String dateofJourney;
	private String travelingClass;

}
