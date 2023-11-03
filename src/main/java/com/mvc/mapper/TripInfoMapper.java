package com.mvc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mvc.vo.TripInfo;

@Mapper
public interface TripInfoMapper {
	
	List<TripInfo> getInfoAll();
	
}
