package com.Springboot.Controller;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Springboot.Binding.PassengerInfo;
import com.Springboot.Binding.TicketInfo;

@RestController
public class TicketController {
	
	
	@PostMapping(value="/TicketInfo", produces = {"Application/json"},consumes = {"Application/json"})
	public ResponseEntity<TicketInfo> bookTrainTicket(@RequestBody PassengerInfo passengerInfo)
	{
		TicketInfo ticketinfo=new TicketInfo();
		
		
		ticketinfo.setTravelingClass("Sleeper");
		ticketinfo.setDateofJourney("12/01/2025");
		ticketinfo.setBoardingStation("Nagpur");
		ticketinfo.setDestinationStation("Prayagraj");
		ticketinfo.setTrainNumber(123445);
		
		BeanUtils.copyProperties(passengerInfo, ticketinfo);
		
		return new ResponseEntity<TicketInfo>(ticketinfo,HttpStatus.OK);
	}

}
