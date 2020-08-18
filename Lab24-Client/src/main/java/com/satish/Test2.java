package com.satish;

import org.springframework.web.client.RestTemplate;

import com.satish.entity.Course;

public class Test2 {
	public static void main(String[] args) {
		 RestTemplate restTemplate = new RestTemplate();
		 System.out.println("------------2. Update Course -----------");
		 Course mycourse=new Course(10,"React 16",25000.0,65,"Vas");
		 
		 String endpoints = "http://localhost:8192/myapi/updatecourse";
		 restTemplate.put(endpoints, mycourse);
		 
		 System.out.println("Done!!!");
	}
}
