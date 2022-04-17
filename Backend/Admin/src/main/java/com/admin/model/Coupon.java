package com.admin.model;




public class Coupon {

 
    private String id;
    private String provider;
    private String code;
    private String description;
    private String expiryDate;
    private String price;
    

    public Coupon() {
    }

    public Coupon(String id, String provider, String code, String description, String expiryDate, String price) {
        this.id = id;
        this.provider = provider;
        this.code = code;
        this.description = description;
        this.expiryDate = expiryDate;
        this.price =price;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getProvider() {
        return provider;
    }
    public void setProvider(String provider) {
        this.provider = provider;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}


    @Override
    public String toString() {
        return "Coupon{" +
                "id='" + id + '\'' +
                ", provider='" + provider + '\'' +
                ", code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
