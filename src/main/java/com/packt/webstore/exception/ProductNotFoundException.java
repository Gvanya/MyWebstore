package com.packt.webstore.exception;

public class ProductNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 3935230281455340039L;
	private String productId;
	
	public ProductNotFoundException(String productId) {
		this.productId = productId;
	}

	public String getProductId() {
		return productId;
	}

}
