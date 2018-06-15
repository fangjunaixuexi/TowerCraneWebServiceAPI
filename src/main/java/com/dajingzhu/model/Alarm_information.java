package com.dajingzhu.model;

public class Alarm_information {

	private int alarm_id;
	private String alarm_starttime;
	private String alarm_endtime;
	private int device_sn;
	private String alarm_type;
	public int getAlarm_id() {
		return alarm_id;
	}
	public void setAlarm_id(int alarm_id) {
		this.alarm_id = alarm_id;
	}
	public String getAlarm_starttime() {
		return alarm_starttime;
	}
	public void setAlarm_starttime(String alarm_starttime) {
		this.alarm_starttime = alarm_starttime;
	}
	public String getAlarm_endtime() {
		return alarm_endtime;
	}
	public void setAlarm_endtime(String alarm_endtime) {
		this.alarm_endtime = alarm_endtime;
	}
	public int getDevice_sn() {
		return device_sn;
	}
	public void setDevice_sn(int device_sn) {
		this.device_sn = device_sn;
	}
	public String getAlarm_type() {
		return alarm_type;
	}
	public void setAlarm_type(String alarm_type) {
		this.alarm_type = alarm_type;
	}
}
