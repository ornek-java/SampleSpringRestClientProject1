package com.ndr.sample.spring.rest.client.main;

import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.ndr.sample.spring.rest.model.SampleRequest;
import com.ndr.sample.spring.rest.model.SampleResult;

public class SampleRestClient2 {
	
	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new MappingJacksonHttpMessageConverter());
		SampleRequest sampleRequest = new SampleRequest();
		sampleRequest.setSampleProperty1("Hello World!");
		try {
			SampleResult sampleResult = restTemplate.postForObject("http://localhost:8080/sampleMethod1", sampleRequest, SampleResult.class);
			System.out.println(sampleResult.getSampleProperty1());
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
