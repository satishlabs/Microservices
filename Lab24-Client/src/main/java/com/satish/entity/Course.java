package com.satish.entity;

public class Course {
	private int cid;
	private String cname;
	private double cost;
	private int duration;
	private String trainer; 
	
	public Course() {}

	public Course(int cid, String cname, double cost, int duration, String trainer) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cost = cost;
		this.duration = duration;
		this.trainer = trainer;
	}

	public Course(String cname, double cost, int duration, String trainer) {
		super();
		this.cname = cname;
		this.cost = cost;
		this.duration = duration;
		this.trainer = trainer;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", cost=" + cost + ", duration=" + duration + ", trainer="
				+ trainer + "]";
	}
	
	
	
}
