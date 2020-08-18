package com.satish;

import java.util.List;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

public class Test6 {
	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		System.out.println("-------6.Get Course By Trainer-------"); 
		String url = "http://localhost:8192/myapi/mycourse/trainer/Srinivas";
		
		List<Map> myList = restTemplate.getForObject(url, List.class);
		for(Map mycourse:  myList) {
			System.out.println(mycourse);
		}
		System.out.println("Done!!!");
	}
}
