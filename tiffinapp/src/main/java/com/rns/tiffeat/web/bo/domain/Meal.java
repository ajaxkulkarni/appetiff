package com.rns.tiffeat.web.bo.domain;

import java.math.BigDecimal;

public class Meal {

	private long id;
	private String title;
	private String description;
	private String image;
	private BigDecimal rating;
	private BigDecimal price;
	private MealStatus status;
	private Vendor vendor;
	private DailyContent content;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public BigDecimal getRating() {
		return rating;
	}
	public void setRating(BigDecimal rating) {
		this.rating = rating;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Vendor getVendor() {
		return vendor;
	}
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	public MealStatus getStatus() {
		return status;
	}
	public void setStatus(MealStatus status) {
		this.status = status;
	}
	public DailyContent getContent() {
		return content;
	}
	public void setContent(DailyContent content) {
		this.content = content;
	}
	
	
}	
