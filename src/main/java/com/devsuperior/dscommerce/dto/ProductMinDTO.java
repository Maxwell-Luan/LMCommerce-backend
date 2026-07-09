package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Product;

public class ProductMinDTO {

	private Long id;
	private String name;
	private Double price;
	private String imgURL;
	
	public ProductMinDTO(Long id, String name, Double price, String imgURL) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.imgURL = imgURL;
	}

	public ProductMinDTO(Product entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.price = entity.getPrice();
		this.imgURL = entity.getImgUrl();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public String getImgURL() {
		return imgURL;
	}
	
}
