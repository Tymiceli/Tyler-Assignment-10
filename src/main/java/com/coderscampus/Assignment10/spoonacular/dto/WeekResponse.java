package com.coderscampus.Assignment10.spoonacular.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeekResponse {

	@JsonProperty("week")
	private Week week;

	public Week getWeek() {
		return week;
	}

	public void setWeek(Week week) {
		this.week = week;
	}

	@Override
	public String toString() {
		return "WeekResponse [week=" + week + "]";
	}

}
