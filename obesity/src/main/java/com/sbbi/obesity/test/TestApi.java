package com.sbbi.obesity.test;

import org.springframework.web.client.RestTemplate;

public class TestApi {

	public static void main(String[] args) {
		
		RestTemplate restTemplate = new RestTemplate();
		//String response = restTemplate.getForObject("http://127.0.0.1:5000/", String.class);
		//System.out.println(response);
		
		Message msg = restTemplate.postForObject("http://127.0.0.1:5000/", new Message("bruno"), Message.class);
		
	}
	
}