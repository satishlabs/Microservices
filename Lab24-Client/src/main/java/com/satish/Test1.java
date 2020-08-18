package com.satish;

import org.springframework.web.client.RestTemplate;

import com.satish.entity.Course;

public class Test1 {
	public static void main(String[] args) {
		 RestTemplate restTemplate = new RestTemplate();
		 System.out.println("------------1. Add Course-----------");
		 Course mycourse = new Course("PHP", 15000, 30, "Sachin");
		 
		 String endpoints = "http://localhost:8192/myapi/addcourse";
		 restTemplate.postForObject(endpoints, mycourse, Course.class);
		 
		 System.out.println("Done!!!");
	}
}
