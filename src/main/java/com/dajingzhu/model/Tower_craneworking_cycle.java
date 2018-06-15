package com.dajingzhu.model;

public class Tower_craneworking_cycle {

	
	 private int device_sn;
	 private String towercrance_name;
	 private String lifting_time;
	 private String drop_time;
	 private double maximum_payload;
	 private double lifting_range;
	 private double max_amplitude;
	 private double drop_range;
	 private double lifting_height;
	 private double drop_height;
	 private double lifting_angle;
	 private double drop_angle;
	 private double lifting_windspeed;
	 private double drop_windspeed;
	 private double maximum_torque;	 
	 private double maximum_torque_ratio;
	 private int playbackid;
	public int getPlaybackid() {
		return playbackid;
	}
	public void setPlaybackid(int playbackid) {
		this.playbackid = playbackid;
	}
	public int getDevice_sn() {
		return device_sn;
	}
	public void setDevice_sn(int device_sn) {
		this.device_sn = device_sn;
	}
	public String getTowercrance_name() {
		return towercrance_name;
	}
	public void setTowercrance_name(String towercrance_name) {
		this.towercrance_name = towercrance_name;
	}

	public String getLifting_time() {
		return lifting_time;
	}
	public void setLifting_time(String lifting_time) {
		this.lifting_time = lifting_time;
	}
	public String getDrop_time() {
		return drop_time;
	}
	public void setDrop_time(String drop_time) {
		this.drop_time = drop_time;
	}
	public double getMaximum_payload() {
		return maximum_payload;
	}
	public void setMaximum_payload(double maximum_payload) {
		this.maximum_payload = maximum_payload;
	}
	public double getLifting_range() {
		return lifting_range;
	}
	public void setLifting_range(double lifting_range) {
		this.lifting_range = lifting_range;
	}
	
	public double getMax_amplitude() {
		return max_amplitude;
	}
	public void setMax_amplitude(double max_amplitude) {
		this.max_amplitude = max_amplitude;
	}
	public double getDrop_range() {
		return drop_range;
	}
	public void setDrop_range(double drop_range) {
		this.drop_range = drop_range;
	}
	public double getLifting_height() {
		return lifting_height;
	}
	public void setLifting_height(double lifting_height) {
		this.lifting_height = lifting_height;
	}
	public double getDrop_height() {
		return drop_height;
	}
	public void setDrop_height(double drop_height) {
		this.drop_height = drop_height;
	}
	public double getLifting_angle() {
		return lifting_angle;
	}
	public void setLifting_angle(double lifting_angle) {
		this.lifting_angle = lifting_angle;
	}
	public double getDrop_angle() {
		return drop_angle;
	}
	public void setDrop_angle(double drop_angle) {
		this.drop_angle = drop_angle;
	}
	public double getLifting_windspeed() {
		return lifting_windspeed;
	}
	public void setLifting_windspeed(double lifting_windspeed) {
		this.lifting_windspeed = lifting_windspeed;
	}
	public double getDrop_windspeed() {
		return drop_windspeed;
	}
	public void setDrop_windspeed(double drop_windspeed) {
		this.drop_windspeed = drop_windspeed;
	}
	public double getMaximum_torque() {
		return maximum_torque;
	}
	public void setMaximum_torque(double maximum_torque) {
		this.maximum_torque = maximum_torque;
	}
	public double getMaximum_torque_ratio() {
		return maximum_torque_ratio;
	}
	public void setMaximum_torque_ratio(double maximum_torque_ratio) {
		this.maximum_torque_ratio = maximum_torque_ratio;
	}
	@Override
	public String toString() {
		return "Tower_craneworking_cycle [device_sn=" + device_sn + ", towercrance_name=" + towercrance_name
				+ ", lifting_time=" + lifting_time + ", drop_time=" + drop_time + ", maximum_payload=" + maximum_payload
				+ ", lifting_range=" + lifting_range + ", max_amplitude=" + max_amplitude + ", drop_range=" + drop_range
				+ ", lifting_height=" + lifting_height + ", drop_height=" + drop_height + ", lifting_angle="
				+ lifting_angle + ", drop_angle=" + drop_angle + ", lifting_windspeed=" + lifting_windspeed
				+ ", drop_windspeed=" + drop_windspeed + ", maximum_torque=" + maximum_torque
				+ ", maximum_torque_ratio=" + maximum_torque_ratio + "]";
	}
	


}
