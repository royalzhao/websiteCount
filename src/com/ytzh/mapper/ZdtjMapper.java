package com.ytzh.mapper;

import java.util.List;
import java.util.Map;

import com.ytzh.pojo.TjDate;

public interface ZdtjMapper {

	List<Map<String, Object>> pageViewAllByHour(TjDate tjDate);

	List<Map<String, Object>> IpcAllByHourList(TjDate tjDate);

}
