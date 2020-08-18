package com.satish.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.satish.dao.CourseDAO;
import com.satish.model.Course;
import com.satish.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	private CourseDAO courseDAO;
	
	@Override
	public void addCourse(Course mycourse) {
		System.out.println("CS - addCouse()");
		courseDAO.save(mycourse);	
	}

	@Override
	public void updateCourse(Course mycourse) {
		System.out.println("CS - updateCourse()");
		courseDAO.saveAndFlush(mycourse);
	}

	@Override
	public void deleteCourseByCid(Integer cid) {
		System.out.println("CS - deleteCourse()");
		if(courseDAO.existsById(cid))
		  courseDAO.deleteById(cid);
	}

	@Override
	public Course getCourseById(Integer cid) {
		System.out.println("CS - getCourseById()");
		Course mycourse = courseDAO.findById(cid).get();
		return mycourse;
	}

	@Override
	public List<Course> getAllCourses() {
		System.out.println("CS - getAllCourses()");
		return courseDAO.findAll();
	}

	@Override
	public List<Course> getCoursedByTrainer(String trainer) {
		System.out.println("CS - getCoursedByTrainer()");
		return courseDAO.getCoursesByTrainer(trainer);
	}

	@Override
	public List<Course> getCoursesByCost(double cost) {
		System.out.println("CS - getCoursedByTrainer()");
		return courseDAO.getCoursesByCost(cost);
	}

	@Override
	public Course getCoursesByCname(String cname) {
		System.out.println("CS - getCoursesByCname()");
		return courseDAO.getCoursesByCname(cname);
	}

}
