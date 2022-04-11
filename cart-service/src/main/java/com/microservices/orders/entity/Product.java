package com.microservices.orders.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.annotations.ApiModelProperty;

@Document(collection = "product")
public class Product {
	
	@ApiModelProperty(notes="productId",  name = "id", required = true)
    @Id
    private String id;
	
	@ApiModelProperty(notes="product name",  name = "name", required = true)
    private String name;
	
	@ApiModelProperty(notes="category",  name = "category", required = true)
    private String category;
	
	@ApiModelProperty(notes="price of product",  name = "price", required = true)
    private Double price;
	
	@ApiModelProperty(notes="quantity of product",  name = "quantity", required = true)
    private int quantity;
	
	@ApiModelProperty(notes="url of product",  name = "url", required = true)
    private String url;

    public Product(String name, String category, Double price, int quantity, String  url) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.url = url;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + ", quantity="
				+ quantity + ", url=" + url + "]";
	}
	
	
    
}
