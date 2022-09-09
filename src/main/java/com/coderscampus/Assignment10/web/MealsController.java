package com.coderscampus.Assignment10.web;

import java.net.URI;
import java.util.Random;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.Assignment10.spoonacular.dto.DayResponse;
import com.coderscampus.Assignment10.spoonacular.dto.WeekResponse;

@RestController
public class MealsController {

	@GetMapping("mealplanner/week")
	public ResponseEntity<WeekResponse> getWeekMeals(String numCalories, String diet, String exclusions) {
		Random rand = new Random();
		int randInt = rand.nextInt((3000 - 2000)+1) + 2000;
		RestTemplate rt = new RestTemplate();
		
 		URI url = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
				.queryParam("timeFrame", "week")
				.queryParam("diet", diet != null ? diet:"")
				.queryParam("targetCalories", numCalories != null ? numCalories:randInt)
				.queryParam("exclude", exclusions != null ? exclusions:"")				
				.queryParam("apiKey", "5c027d9edcef48308833cae198731ebe")
				.build()
				.toUri();

		ResponseEntity<WeekResponse> weekResponse = rt.getForEntity(url, WeekResponse.class);
		System.out.println(weekResponse.getBody());
		return weekResponse;
	}

	@GetMapping("mealplanner/day")
	public ResponseEntity<DayResponse> getDayMeals(String numCalories, String diet, String exclusions) {
		Random rand = new Random();
		int randInt = rand.nextInt((3000 - 2000)+1) + 2000;
		RestTemplate rt = new RestTemplate();

		URI url = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
				.queryParam("timeFrame", "day")
				.queryParam("diet", diet != null ? diet:"")
				.queryParam("targetCalories", numCalories != null ? numCalories:randInt)
				.queryParam("exclude", exclusions != null ? exclusions:"")			
				.queryParam("apiKey", "5c027d9edcef48308833cae198731ebe")
				.build()
				.toUri();

		ResponseEntity<DayResponse> dayResponse = rt.getForEntity(url, DayResponse.class);
		System.out.println(dayResponse.getBody());
		return dayResponse;
	
	}	

}
