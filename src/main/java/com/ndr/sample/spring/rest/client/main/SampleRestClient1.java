package com.ndr.sample.spring.rest.client.main;

import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class SampleRestClient1 {
	
	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new MappingJacksonHttpMessageConverter());
		try {
			String result = restTemplate.postForObject("http://localhost:8080/test1", null, String.class);
			System.out.println(result);
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
