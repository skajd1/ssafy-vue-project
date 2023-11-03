package com.mvc.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mvc.vo.TripInfo;


public interface TripInfoService {


	List<TripInfo> getInfoAll();
	
}
