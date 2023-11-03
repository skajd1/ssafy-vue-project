package com.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mvc.service.TripInfoService;
import com.mvc.vo.TripInfo;

@RestController
public class TripInfoController {
	@Autowired
	TripInfoService service;
	
	@GetMapping("/trip/all")
	public List<TripInfo> getData(){
		
		return service.getInfoAll();
	}
}
