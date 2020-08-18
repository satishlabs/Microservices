package com.satish;

import java.util.List;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

public class Test5 {
	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		System.out.println("-------5.Get All Courses -------"); 
		String url = "http://localhost:8192/myapi/mycourses";

		List<Map> myList = restTemplate.getForObject(url, List.class);
		
		System.out.println();
		System.out.println("=======================");
		for(Map mycourse: myList) {
			System.out.println(mycourse);
		}
		System.out.println("Done!!!");
	}
}
