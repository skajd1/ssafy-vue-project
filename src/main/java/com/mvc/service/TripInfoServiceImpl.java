package com.mvc.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.mapper.TripInfoMapper;
import com.mvc.vo.Gugun;
import com.mvc.vo.TripInfo;

@Service
public class TripInfoServiceImpl implements TripInfoService{
	@Autowired
	TripInfoMapper mapper;

	@Override
	public List<TripInfo> getInfoAll() {
		return mapper.getInfoAll();
	}

	@Override
	public List<TripInfo> searchContentTypeId(String contentTypeId) {
		return mapper.searchContentTypeId(contentTypeId);
	}

	@Override
	public List<TripInfo> searchArea(int sidocode, int guguncode) {
		Map<String, Integer> map = new HashMap<>();
		map.put("sidocode", sidocode);
		map.put("guguncode", guguncode);
		return mapper.searchArea(map);
	}

	@Override
	public List<TripInfo> searchTitle(String word) {
		return mapper.searchTitle(word);
	}

	@Override
	public List<Gugun> getGugunList(String sidoCode) {
		return mapper.getGugunList(sidoCode);
	}

	@Override
	public List<TripInfo> searchBySidoGugunType(String sidoCode, String gugunCode, String typeId) {
		return mapper.getInfoBySidoGugunType(sidoCode,gugunCode,typeId);
	}
	
	
}
