package com.project.restcountries.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RestcountriesResponse {

	private Name name;
	private Object currencies;
	private List<String> capital;
	private int population;

	
	public RestcountriesResponse() {
		super();
	}
	
	public RestcountriesResponse(Name name, Object currencies, List<String> capital, int population) {
		super();
		this.name = name;
		this.currencies = currencies;
		this.capital = capital;
		this.population = population;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Object getCurrencies() {
		return currencies;
	}

	public void setCurrencies(Object currencies) {
		this.currencies = currencies;
	}

	public List<String> getCapital() {
		return capital;
	}

	public void setCapital(List<String> capital) {
		this.capital = capital;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return " [" + name + ", currencies:" + currencies + ", capital:" + capital
				+ ", population:" + population + "]";
	}
	
	
	
	

}
