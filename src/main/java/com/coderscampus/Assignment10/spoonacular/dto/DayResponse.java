package com.coderscampus.Assignment10.spoonacular.dto;

import java.util.ArrayList;

public class DayResponse {

	private ArrayList<Meals> meals;
	private Nutrients nutrients;
	
	public ArrayList<Meals> getMeals() {
		return meals;
	}
	public void setMeals(ArrayList<Meals> meals) {
		this.meals = meals;
	}
	public Nutrients getNutrients() {
		return nutrients;
	}
	public void setNutrients(Nutrients nutrients) {
		this.nutrients = nutrients;
	}
	@Override
	public String toString() {
		return "DayResponse: Meals "+ meals + ", "+ nutrients + "]";
	}

}
