package com.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mvc.service.TripInfoService;
import com.mvc.vo.TripInfo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/trip")
@Api(value="SSAFY")
public class TripInfoController {
	@Autowired
	TripInfoService service;
	
	@ApiOperation(value="전체 관광지 리스트",notes="모든 여행지 정보를 반환한다")
	@GetMapping("/all")
	public List<TripInfo> getInfoAll(){
		
		return service.getInfoAll();
	}
	
	@ApiOperation(value="컨텐트 타입 별 관광지 리스트",notes="컨텐트 타입 별 관광지 정보를 반환한다")
	@GetMapping("/contentTypeId/{contentTypeId}")
	public List<TripInfo> searchContentId(@PathVariable("contentTypeId") String contentTypeId){
		
		return service.searchContentTypeId(contentTypeId);
	}
	
	@ApiOperation(value="지역 코드 별 관광지 리스트",notes="지역 코드 별 관광지 정보를 반환한다")
	@GetMapping("/area/{sidocode}/{guguncode}")
	public List<TripInfo> searchArea(@PathVariable("sidocode") String sidocode, @PathVariable("guguncode") String guguncode){
		return service.searchArea(Integer.parseInt(sidocode),Integer.parseInt(guguncode));
	}
	
	@ApiOperation(value="관광지명 별 관광지 리스트",notes="관광지명으로 검색한 관광지 정보를 반환한다 ")
	@GetMapping("/title/{word}")
	public List<TripInfo> searchTitle(@PathVariable("word") String word){
		return service.searchTitle(word);
	}
}
