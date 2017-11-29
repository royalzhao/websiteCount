package com.ytzh.service;

import java.util.List;
import java.util.Map;

import com.ytzh.pojo.TjDate;

public interface ZdtjService {
	//网站日各时段总访问量
	List<Map<String, Object>> pageViewAllByHour(TjDate tjDate);

	List<Map<String, Object>> IpcAllByHourList(TjDate tjDate);
	
}
