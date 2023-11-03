package com.mvc.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import com.mvc.mapper.TripInfoMapper;
import com.mvc.vo.TripInfo;

@Service
public class TripInfoServiceImpl implements TripInfoService{
	@Autowired
	TripInfoMapper mapper;

	@Override
	public List<TripInfo> getInfoAll() {
		return mapper.getInfoAll();
	}
	
	
}
