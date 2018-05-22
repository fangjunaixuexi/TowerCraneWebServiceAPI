package com.dajingzhu.mapper;

import java.util.List;

import com.dajingzhu.model.Running_data;
import com.dajingzhu.model.Working_cycle;

public interface MyMapper {

	int selectRunningDataId();

	void insertinsertRunningData(List<Running_data> runningDataList);

	int selectWorkingCycleId();

	void insertWorkingCycle(List<Working_cycle> workingCycleList);



}
