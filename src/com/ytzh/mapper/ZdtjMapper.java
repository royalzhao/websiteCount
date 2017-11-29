package com.ytzh.mapper;

import java.util.List;
import java.util.Map;

import com.ytzh.pojo.FwmxPojo;
import com.ytzh.pojo.TjDate;

public interface ZdtjMapper {
	void FwmxSave(FwmxPojo fwmx);
	
	List<Map<String, Object>> pageViewAllByHour(TjDate tjDate);

	List<Map<String, Object>> IpcAllByHourList(TjDate tjDate);

	Map<String, Object> IpcAllByDay(TjDate tjDate);

	Map<String, Object> pageViewByDay(TjDate tjDate);

	//List<Map<String, Object>> accessToDetail();

	

}
