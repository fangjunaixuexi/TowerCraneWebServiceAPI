package com.dajingzhu.service;

import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dajingzhu.controller.WeChatController;
import com.dajingzhu.mapper.MyMapper;
import com.dajingzhu.model.Alarm_information;
import com.dajingzhu.model.Playback;
import com.dajingzhu.model.Tower_cranerunning_data;
import com.dajingzhu.model.Tower_craneworking_cycle;

@Component("iMyService")
@WebService(endpointInterface = "com.dajingzhu.service.IMyService", serviceName = "IMyServiceImpl")
public class IMyServiceImpl implements IMyService {

	static int playbackid = 1;

	@Autowired
	private MyMapper dao;

	// 向实时数据表中添加数据
	public boolean insertRunningData(List<Tower_cranerunning_data> runningDataList) {

		if (runningDataList == null) {
			System.out.println("传入数据为空");
			return false;
		} else {
			Tower_cranerunning_data playback1=dao.selectLifting_weight();
			int start1id=0;
			if (playback1!=null) {
				start1id=playback1.getRunning_id();
			}
			System.out.println("查看第一个载重为0的id");
			System.out.println(start1id);
			dao.insertRunningData(runningDataList);
			System.out.println("传入数据");
			int i=0;
			for (Tower_cranerunning_data running_data : runningDataList) {
				System.out.println(running_data.toString());
				Playback playback=dao.selectPlayback();
				if(playback!=null) {
					playbackid=playback.getPlaybackid();
				}
				running_data.setPlaybackid(playbackid);
				System.out.println("查看运行数据载重");
				System.out.println(running_data.getLifting_weight());
				
				if(running_data.getLifting_weight()==0){
					System.out.println(playbackid);
					Tower_cranerunning_data playback2=dao.selectLifting_weight();
					int start2id=0;
				
					
					if (playback1!=null) {
						start2id=playback2.getRunning_id();
					}
					System.out.println("查看第二个载重为0的id");
					System.out.println(start2id);
					int startid=start2id-start1id;
					System.out.println("查看两个载重为0是否在一起");
					System.out.println(startid);
					
					
					if(startid==1) {
						//List<Playback> playbackList=dao.selectPlaybackList(playbackid);
						System.out.println("查找一个工作循环内开始数据");
						Playback startplayback=dao.selectStartplayback(playbackid);
						
						System.out.println("查找一个工作循环内结束数据");
					
						Playback endplayback=dao.selectEndplayback(playbackid);
					
						if(startplayback!=null&&endplayback!=null) {
						//向工作循环塞入数据
						Tower_craneworking_cycle working_cycle=new Tower_craneworking_cycle();
						//设备sn
						working_cycle.setDevice_sn(startplayback.getDevice_sn());
						//塔机名称
						working_cycle.setTowercrance_name(startplayback.getTower_crance_name());
						//起吊时间
						working_cycle.setLifting_time(startplayback.getMonitoring_time());
						//落吊时间
						working_cycle.setDrop_time(endplayback.getMonitoring_time());
						//最大载重
						double max_playload=dao.selectMax_playload(playbackid);
						working_cycle.setMaximum_payload(max_playload);
						//起吊幅度
						working_cycle.setLifting_range(startplayback.getTower_range());
						//落吊幅度
						working_cycle.setDrop_range(endplayback.getTower_range());
						//最大幅度
						double max_amplitude=dao.selectMax_amplitude(playbackid);
						working_cycle.setMax_amplitude(max_amplitude);
						//起吊高度
						working_cycle.setLifting_height(startplayback.getHeight());
						//落吊高度
						working_cycle.setDrop_height(endplayback.getHeight());
						//起吊角度
						working_cycle.setLifting_angle(startplayback.getDipangle());
						//落吊角度
						working_cycle.setDrop_angle(endplayback.getDipangle());
						//起吊风速
						working_cycle.setLifting_windspeed(startplayback.getWind_speed());
						//落吊风速
						working_cycle.setDrop_windspeed(endplayback.getWind_speed());
						//最大力矩比
						double maximum_torque_ratio=dao.selectMaximum_torque_ratio(playbackid);
						working_cycle.setMaximum_torque_ratio(maximum_torque_ratio);
						//最大力矩
						double maximum_torque=dao.selectMaximum_torque(playbackid);
						working_cycle.setMaximum_torque(maximum_torque);
						//playbackid
						working_cycle.setPlaybackid(playbackid);
						if(working_cycle.getMaximum_payload()>0) {
						System.out.println(working_cycle.toString());
						dao.insertTower_craneworking_cycle(working_cycle);
						}
						}
						System.out.println("两条相近的id传入数据载重为0"+i);
						playbackid++;
						System.out.println(playbackid);
						running_data.setPlaybackid(playbackid);
						dao.insertPlaybackData(running_data);
						i=1;
						
					}
					
					System.out.println("传入数据载重为0"+i);
					if (i==0) {
						System.out.println(playbackid);
						dao.insertPlaybackData(running_data);
						i=1;
					}
				
				
				}
				System.out.println("传入数据载重非0"+i);
				if (i==0) {
					System.out.println(playbackid);
					dao.insertPlaybackData(running_data);
				}
			}
		
			System.out.println("数据传入成功");
			return true;
		}
	}

	// 查找最后一条接收的id
	public int selectRunningDataId() {
		int RunningDataId = dao.selectRunningDataId();
		System.out.println(RunningDataId);
		return RunningDataId;
	}

	// 查找循环数据表最后一条数据id
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

	@Override
	public boolean inserAlarm_information(List<Alarm_information> alarmDataList) {
		try {
			if (alarmDataList == null) {
				System.out.println("传入数据为空");
				return false;
			} else {
				System.out.println("传入数据中");
				dao.insertAlarmDataList(alarmDataList);
				for (Alarm_information alarm_information : alarmDataList) {
					WeChatController.sendTemplate(alarm_information);
				}
				System.out.println("传入数据成功");
				return true;
			}
		} catch (Exception e) {
			System.out.println("传入数据失败");
			return false;
		}
	}

	// 插入循环数据表数据
	/*public boolean insertWorkingCycle(List<Tower_craneworking_cycle> workingCycleList) {
		try {
			if (workingCycleList == null) {
				System.out.println("传入数据为空");
				return false;
			} else {
				System.out.println("传入数据中");
				for (Tower_craneworking_cycle working_cycle : workingCycleList) {
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

	}*/

}
