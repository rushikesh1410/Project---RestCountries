package com.project.restcountries.controller;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.restcountries.response.RestcountriesResponse;

@RestController
public class Controller {

//get mapping task 1

	@GetMapping("/restcountries")
	private String getrestcountries() throws IOException {

		String uri = "https://restcountries.com/v3.1/name/india";
		RestTemplate restTemplate = new RestTemplate();
		String restcountries = restTemplate.getForObject(uri, String.class);
		

		try {

			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

			String countryString = restcountries;
			RestcountriesResponse[] restCountriesResponse = mapper.readValue(countryString,	RestcountriesResponse[].class);
			
			
			String  arrayString = Arrays.asList(restCountriesResponse).toString();
			System.out.println(Arrays.asList(restCountriesResponse));
			
			
			return arrayString;
			
		} catch (final Exception e) {

			e.printStackTrace();
		}
		
		
		
		return null;
	}

}
