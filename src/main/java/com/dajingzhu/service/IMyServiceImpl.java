package com.dajingzhu.service;

import java.util.List;
import javax.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dajingzhu.mapper.MyMapper;
import com.dajingzhu.model.Running_data;
import com.dajingzhu.model.Working_cycle;

@Component("iMyService")
@WebService(endpointInterface = "com.dajingzhu.service.IMyService",serviceName="IMyServiceImpl")
public class IMyServiceImpl implements IMyService {
	@Autowired
	private MyMapper dao;
	//向表中添加数据
	public boolean insertRunningData(List<Running_data> runningDataList) {
		if (runningDataList == null) {
			System.out.println("传入数据为空");
			return false;
		} else {
			System.out.println("传入数据中");
			for (Running_data running_data : runningDataList) {
				System.out.println(running_data.toString());
			}
			dao.insertinsertRunningData(runningDataList);
			System.out.println("数据传入成功");
			return true;
		}
	}
//查找最后一条接收的id
	public int selectRunningDataId() {
		int RunningDataId = dao.selectRunningDataId();
		System.out.println(RunningDataId);
		return RunningDataId;
	}
	
	//查找循环数据表最后一条数据id
		public int selectWorkingCycleId() {
			try {
				int workingCycleId = dao.selectWorkingCycleId();
				System.out.println("workingCycleId");
				return workingCycleId;
			} catch (Exception e) {
				System.out.println("查找失败");
				return 0;
			}

		}
	//插入循环数据表数据
		public boolean insertWorkingCycle(List<Working_cycle> workingCycleList) {
			try {
				if (workingCycleList == null) {
					System.out.println("传入数据为空");
					return false;
				} else {
					System.out.println("传入数据中");
				for (Working_cycle working_cycle : workingCycleList) {
					System.out.println(working_cycle);
				}
					dao.insertWorkingCycle(workingCycleList);
					System.out.println("传入数据成功");
					return true;
				}
			} catch (Exception e) {
				System.out.println("传入数据失败");
				return false;
			}

		}

}
