package com.satish.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.satish.model.Course;
import com.satish.service.CourseService;

import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/myapi")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@ApiOperation(value = "Add Couese Information", response = void.class, notes = "Adds Course Information")
	@PostMapping("/addcourse")
	public void addCourse(@RequestBody Course mycourse) {
		System.out.println("CC -- addCourse()");
		courseService.addCourse(mycourse);
	}
	
	@ApiOperation(value = "Update Couese Information", response = void.class, notes = "Updates Course Information")
	@PutMapping("/updatecourse")
	public void updateCourse(@RequestBody Course mycourse) {
		System.out.println("CC -- addCourse()");
		courseService.updateCourse(mycourse);
	}
	@ApiOperation(value = "Delete Couese Information", response = void.class, notes = "Deletes Course Information")
	@DeleteMapping("/deletecourse/{cid}")
	public void deleteCourse(@PathVariable Integer cid) {
		System.out.println("CC -- deleteCourse()");
		courseService.deleteCourseByCid(cid);
	}
	
	@ApiOperation(value = "Returns Course Information by course id. ", response = Course.class, notes = "Returns Course Information By Course Id")
	@GetMapping("/mycourse/{cid}")
	public Course getCourseByCid(@PathVariable Integer cid) {
		System.out.println("CC -- getCourseByCid()");
		return courseService.getCourseById(cid);
	}
	
	@ApiOperation(value = "Returns All Course Information. ", response = List.class, notes = "Returns All the Courses Information")
	@GetMapping("/mycourses")
	public List<Course> getAllCourses(){
		System.out.println("CC -- getAllCourses()");
		return courseService.getAllCourses();
	}
	
	@ApiOperation(value = "Returns Course Information by Trainer. ", response = List.class, notes = "Returns Course Information By Trainer Name")
	@GetMapping("/mycourse/trainer/{trainer}")
	public List<Course> getCoursedByTrainer(@PathVariable String trainer){
		System.out.println("CC -- getCoursedByTrainer()");
		return courseService.getCoursedByTrainer(trainer);
	}
	
	@ApiOperation(value = "Returns Course Information by Cost. ", response = List.class, notes = "Returns Course Information By Cost")
	@GetMapping("/mycourse/cost/{cost}")
	public List<Course> getCoursesByCost(@PathVariable double cost){
		System.out.println("CC -- getCoursesByCost()");
		return courseService.getCoursesByCost(cost);
	}
	
	@ApiOperation(value = "Returns Course Information by Course Name. ", response = Course.class, notes = "Returns Course Information By Course Name")
	@GetMapping("/mycoruse/cname/{cname}")
	public Course getCoursesByCname(@PathVariable String cname) {
		System.out.println("CC -- getCoursesByCname()");
		return courseService.getCoursesByCname(cname);
	}
}
