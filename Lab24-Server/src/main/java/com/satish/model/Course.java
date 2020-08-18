package com.satish.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "mycourses")
@ApiModel(value = "Contains Course Inforamtion - C CourseId,CourseName,Cost,Duration,Trainer ")
public class Course {
	@Id
	@Column(name = "cid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ApiModelProperty(value = "Contains courseId Information")
	private int cid;

	@Column(name = "cname")
	@ApiModelProperty(value = "Contains coursename Information")
	private String cname;

	@Column(name = "cost")
	@ApiModelProperty(value = "Contains cost Information")
	private double cost;

	@Column(name = "trainer")
	@ApiModelProperty(value = "Contains trainer Information")
	private String trainer;

	@Column(name = "duration")
	@ApiModelProperty(value = "Contains duration Information")
	private int duration;

	public Course() {}
	public Course(String cname, double cost, int duration, String trainer) {
		this.cname = cname;
		this.cost = cost;
		this.duration = duration;
		this.trainer = trainer;
	}
	public Course(int cid, String cname, double cost, int duration, String trainer) {
		this.cid = cid;
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

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", cost=" + cost + ", trainer=" + trainer + ", duration="
				+ duration + "]";
	}


}
