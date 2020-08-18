package com.satish;

import org.springframework.web.client.RestTemplate;

import com.satish.entity.Course;

public class Test4 {
	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		System.out.println("-------4.Get Course By Course Id-------");
		
		String url = "http://localhost:8192/myapi/mycourse/2";
		Course mycourse = restTemplate.getForObject(url, Course.class);
		System.out.println(mycourse);
		System.out.println("Done!!!");
	}
}
