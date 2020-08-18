package com.satish;

import java.util.List;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

public class Test7 {
	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		System.out.println("-------7.Get Course By Cost-------");
		String url = "http://localhost:8192/myapi/mycourse/cost/13000.0";
		List<Map> mapCourse = restTemplate.getForObject(url, List.class);
		for(Map courseMap: mapCourse) {
			System.out.println(courseMap);
		}
		System.out.println("Done!!!");
	}
}
