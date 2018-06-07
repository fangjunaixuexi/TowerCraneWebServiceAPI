package com.dajingzhu.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.dajingzhu.model.Running_data;
import com.dajingzhu.model.Working_cycle;

@WebService(name="IMyService", serviceName="IMyService")
public interface IMyService {
	//向表中添加数据
	boolean insertRunningData(@WebParam(name="runningDataList")List<Running_data> runningDataList);
	//查找最新的id
	int selectRunningDataId();
	//查找工作循环表最后一条数据的ID
	int selectWorkingCycleId();
	//插入工作循环数据
	boolean insertWorkingCycle(@WebParam(name="workingCycleList")List<Working_cycle> workingCycleList);
	
	
	
}
