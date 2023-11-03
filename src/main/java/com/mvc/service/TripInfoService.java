package com.mvc.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mvc.vo.TripInfo;


public interface TripInfoService {


	List<TripInfo> getInfoAll();

	List<TripInfo> searchContentTypeId(String contentTypeId);

	List<TripInfo> searchArea(int sidocode, int guguncode);

	List<TripInfo> searchTitle(String word);
	
}
