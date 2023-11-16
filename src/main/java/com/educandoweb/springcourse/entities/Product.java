package com.educandoweb.springcourse.entities;

import java.util.HashSet;
import java.util.Locale.Category;
import java.util.Set;

public class Product {
	
	private Long Id;
	private String name;
	private String description;
	private Double price;
	private String imgUrl;
	
	private Set<Category> categories = new HashSet<>();
}
