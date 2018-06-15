package com.dajingzhu.mapper;

import java.util.List;

import com.dajingzhu.model.Alarm_information;
import com.dajingzhu.model.Playback;
import com.dajingzhu.model.Tower_cranerunning_data;
import com.dajingzhu.model.Tower_craneworking_cycle;

public interface MyMapper {

	int selectRunningDataId();

	void insertRunningData(List<Tower_cranerunning_data> runningDataList);

	int selectWorkingCycleId();


	void insertPlaybackData(Tower_cranerunning_data running_data);

	Tower_cranerunning_data selectLifting_weight();

	List<Playback> selectPlaybackList(int playbackid);

	Playback selectStartplayback(int playbackid);

	Playback selectEndplayback(int playbackid);

	Playback selectPlayback();

	double selectMax_playload(int playbackid);

	double selectMax_amplitude(int playbackid);

	double selectMaximum_torque_ratio(int playbackid);

	double selectMaximum_torque(int playbackid);

	void insertTower_craneworking_cycle(Tower_craneworking_cycle working_cycle);

	void insertAlarmDataList(List<Alarm_information> alarmDataList);



}
