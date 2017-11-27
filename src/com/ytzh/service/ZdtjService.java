package com.ytzh.service;

import java.util.List;
import java.util.Map;

import com.ytzh.pojo.TjDate;

public interface ZdtjService {

	List<Map<String, Object>> zdtjQuery(TjDate tjDate);
	
}
