package com.satish;

import org.springframework.web.client.RestTemplate;

import com.satish.entity.Course;

public class Test8 {
	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		System.out.println("-------8.Get Course By Course Name-------"); 
		String url = "http://localhost:8192/myapi/mycoruse/cname/SpringBoot";
		Course mycourse = restTemplate.getForObject(url, Course.class);
		System.out.println(mycourse);
		System.out.println("Done!!!");
	}
}
