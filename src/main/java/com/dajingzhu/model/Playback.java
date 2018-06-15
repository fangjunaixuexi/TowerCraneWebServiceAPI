package com.dajingzhu.model;

public class Playback {

	private int id;
	private int device_sn;
	private String tower_cranemodel;
	private String tower_crance_name;
	private String monitoring_time;
	private double lifting_weight;
	private double tower_range;
	private double moment_percentage;
	private double rotation;
	private double height;
	private double wind_speed;
	private double dipangle;
	private double multiple_rate;
	private int alarm_state;
	private int on_line;
	private int playbackid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getTower_cranemodel() {
		return tower_cranemodel;
	}
	public void setTower_cranemodel(String tower_cranemodel) {
		this.tower_cranemodel = tower_cranemodel;
	}
	public String getTower_crance_name() {
		return tower_crance_name;
	}
	public void setTower_crance_name(String tower_crance_name) {
		this.tower_crance_name = tower_crance_name;
	}
	public String getMonitoring_time() {
		return monitoring_time;
	}
	public void setMonitoring_time(String monitoring_time) {
		this.monitoring_time = monitoring_time;
	}
	public double getLifting_weight() {
		return lifting_weight;
	}
	public void setLifting_weight(double lifting_weight) {
		this.lifting_weight = lifting_weight;
	}
	public double getTower_range() {
		return tower_range;
	}
	public void setTower_range(double tower_range) {
		this.tower_range = tower_range;
	}
	public double getMoment_percentage() {
		return moment_percentage;
	}
	public void setMoment_percentage(double moment_percentage) {
		this.moment_percentage = moment_percentage;
	}
	public double getRotation() {
		return rotation;
	}
	public void setRotation(double rotation) {
		this.rotation = rotation;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWind_speed() {
		return wind_speed;
	}
	public void setWind_speed(double wind_speed) {
		this.wind_speed = wind_speed;
	}
	public double getDipangle() {
		return dipangle;
	}
	public void setDipangle(double dipangle) {
		this.dipangle = dipangle;
	}
	public double getMultiple_rate() {
		return multiple_rate;
	}
	public void setMultiple_rate(double multiple_rate) {
		this.multiple_rate = multiple_rate;
	}
	public int getAlarm_state() {
		return alarm_state;
	}
	public void setAlarm_state(int alarm_state) {
		this.alarm_state = alarm_state;
	}
	public int getOn_line() {
		return on_line;
	}
	public void setOn_line(int on_line) {
		this.on_line = on_line;
	}
	@Override
	public String toString() {
		return "Playback [id=" + id + ", device_sn=" + device_sn + ", tower_cranemodel=" + tower_cranemodel
				+ ", tower_crance_name=" + tower_crance_name + ", monitoring_time=" + monitoring_time
				+ ", lifting_weight=" + lifting_weight + ", tower_range=" + tower_range + ", moment_percentage="
				+ moment_percentage + ", rotation=" + rotation + ", height=" + height + ", wind_speed=" + wind_speed
				+ ", dipangle=" + dipangle + ", multiple_rate=" + multiple_rate + ", alarm_state=" + alarm_state
				+ ", on_line=" + on_line + ", playbackid=" + playbackid + "]";
	}

}
