package com.satish;

import org.springframework.web.client.RestTemplate;

public class Test3 {
	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		 System.out.println("------------2. Delete Course By Id -----------");
		 
		 String url = "http://localhost:8192/myapi/deletecourse/10";
		 
		 restTemplate.delete(url);
		 System.out.println("Deleted successfully !!");
	}
}
