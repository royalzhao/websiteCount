package com.ytzh.service;

import java.util.List;
import java.util.Map;

import com.ytzh.pojo.FwmxPojo;
import com.ytzh.pojo.TjDate;

public interface ZdtjService {
	
	String pageViewAllByHour(TjDate tjDate);

	String IpcAllByHourList(TjDate tjDate);

	//List<Map<String, Object>> accessToDetail();

	void FwmxSave(FwmxPojo fwmx);
	
	String countAllByYesterday(TjDate tjDate);
}
