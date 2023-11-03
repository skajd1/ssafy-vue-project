package com.mvc.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.mvc.vo.TripInfo;

@Mapper
public interface TripInfoMapper {
	
	List<TripInfo> getInfoAll();
	
	List<TripInfo> searchContentTypeId(String contentTypeId);
	
	List<TripInfo> searchArea(Map<String,Integer> map);
	
	List<TripInfo> searchTitle(String word);
	
}
