package com.mvc.service;

import java.util.List;

import com.mvc.vo.Gugun;
import com.mvc.vo.TripInfo;


public interface TripInfoService {


	List<TripInfo> getInfoAll();

	List<TripInfo> searchContentTypeId(String contentTypeId);

	List<TripInfo> searchArea(int sidocode, int guguncode);

	List<TripInfo> searchTitle(String word);

	List<Gugun> getGugunList(String sidoCode);

	List<TripInfo> searchBySidoGugunType(String sidoCode, String gugunCode, String typeId);
	
}
