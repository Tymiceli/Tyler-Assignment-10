package com.coderscampus.Assignment10.spoonacular.dto;

public class Nutrients {

	private Double calories;
	private Double protein;
	private Double fat;
	private Double carbohydrates;
	
	public Double getCalories() {
		return calories;
	}
	public void setCalories(Double calories) {
		this.calories = calories;
	}
	public Double getProtein() {
		return protein;
	}
	public void setProtein(Double protein) {
		this.protein = protein;
	}
	public Double getFat() {
		return fat;
	}
	public void setFat(Double fat) {
		this.fat = fat;
	}
	public Double getCarbohydrates() {
		return carbohydrates;
	}
	public void setCarbohydrates(Double carbohydrates) {
		this.carbohydrates = carbohydrates;
	}
	@Override
	public String toString() {
		return "Nutrients [calories=" + calories + ", protein=" + protein + ", fat=" + fat + ", carbohydrates="
				+ carbohydrates + "]";
	}
}
