package com.dajingzhu.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.dajingzhu.model.Alarm_information;
import com.dajingzhu.model.Tower_cranerunning_data;

@WebService(name="IMyService", serviceName="IMyService")
public interface IMyService {
	//向运行数据表中添加数据
	boolean insertRunningData(@WebParam(name="runningDataList")List<Tower_cranerunning_data> runningDataList);
	//查找运行数据最新的id
	int selectRunningDataId();
	//查找工作循环表最后一条数据的ID
	int selectWorkingCycleId();
	//插入工作循环数据
/*	boolean insertWorkingCycle(@WebParam(name="workingCycleList")List<Tower_craneworking_cycle> workingCycleList);*/
	//传入报警信息
	boolean inserAlarm_information(@WebParam(name="alarmDataList")List<Alarm_information> alarmDataList);
	
	
}
