package com.satish.service;

import java.util.List;

import com.satish.model.Course;

public interface CourseService {
	public void addCourse(Course course);
	public void updateCourse(Course course);
	public void deleteCourseByCid(Integer cid);
	public Course getCourseById(Integer cid);
	public List<Course> getAllCourses();
	
	
	public List<Course> getCoursedByTrainer(String trainer);
	public List<Course> getCoursesByCost(double cost);
	public Course getCoursesByCname(String cname);
}
