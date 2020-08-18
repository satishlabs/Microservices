package com.satish;

import java.util.List;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import com.satish.entity.Course;

public class SpringRestClient {
	private static final String POST_ADD_COURSES = "http://localhost:8192/myapi/addcourse";
	private static final String PUT_UPDATE_COURSED = "http://localhost:8192/myapi/updatecourse";
	private static final String DELETE_COURSED_BY_ID = "http://localhost:8192/myapi/deletecourse/10";
	private static final String GET_COURSES_BY_ID = "http://localhost:8192/myapi/mycourse/2";
	private static final String GET_ALL_COURSES = "http://localhost:8192/myapi/mycourses";
	
	private static final String GET_COURSES_BY_TRAINER = "http://localhost:8192/myapi/mycourse/trainer/Srinivas";
	private static final String GET_COURSES_BY_COST = "http://localhost:8192/myapi/mycourse/cost/13000.0";
	private static final String GET_COURSES_BY_CNAME = "http://localhost:8192/myapi/mycoruse/cname/SpringBoot";

	public static RestTemplate restTemplate = new RestTemplate();

	public static void main(String[] args) {
		SpringRestClient springRestClient = new SpringRestClient();

		//1. Add courses
		springRestClient.addCourses();

		//2. updated the coruse details
		springRestClient.updateCourses();

		//3. delete course by courseId
		springRestClient.deleteCourseById();

		//4. Get coursed by course Id
		springRestClient.getCourseByCid();

		//5. Fetch all course details 
		springRestClient.getAllCourse();

		//6. Get course detals by Trainer
		springRestClient.getCoursedByTrainer();

		//7. Get course details by Cost
		springRestClient.getCoursesByCost();
		
		//8. Get course detials by CourseName
		springRestClient.getCoursesByCname();
	}

	
	private void addCourses() {
		Course mycourse = new Course("PHP", 15000, 30, "Sachin");
		restTemplate.postForObject(POST_ADD_COURSES, mycourse, Course.class);
		System.out.println(mycourse);
		System.out.println("##### MyCoursed Added ######");
	}
	private void updateCourses() {
		Course mycourse=new Course(11,"MYSQL",25000.0,65,"Vas");
		restTemplate.put(PUT_UPDATE_COURSED, mycourse);
		System.out.println(mycourse);
		System.out.println("Coursed updated successfully !!");

	}
	private void deleteCourseById() {
		restTemplate.delete(DELETE_COURSED_BY_ID);
		System.out.println("Deleted successfully !!");
	}
	private void getCourseByCid() {
		Course mycourse = restTemplate.getForObject(GET_COURSES_BY_ID, Course.class);
		System.out.println("My Cours Details!!!");
		System.out.println(mycourse);	
	}

	private void getAllCourse() {
		List<Map> myList = restTemplate.getForObject(GET_ALL_COURSES, List.class);
		System.out.println();
		System.out.println("=======================");
		for(Map mycourse: myList) {
			System.out.println(mycourse);
		}
		System.out.println("Done!!!");		
	}

	private void getCoursedByTrainer() {
		List<Map> myList = restTemplate.getForObject(GET_COURSES_BY_TRAINER, List.class);
		for(Map mycourse:  myList) {
			System.out.println(mycourse);
		}
		System.out.println("Done!!!");
	}

	private void getCoursesByCost() {
		List<Map> mapCourse = restTemplate.getForObject(GET_COURSES_BY_COST, List.class);
		for(Map courseMap: mapCourse) {
			System.out.println(courseMap);
		}
		System.out.println("Done!!!");
	}
	private void getCoursesByCname() {
		Course mycourse = restTemplate.getForObject(GET_COURSES_BY_CNAME, Course.class);
		System.out.println(mycourse);
		System.out.println("Done!!!");	
	}
}
