package com.sony.registration.domain;

import java.math.BigDecimal;

public class Charge {
	private long id;

	private Courier courier;
	private Product product;

	private BigDecimal firstPoundPrice;
	private BigDecimal perPoundPrice;

	private Integer maxPoundPerBox;
	private Boolean isTaxIncluded;
	private String extraRequirement;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Courier getCourier() {
		return courier;
	}

	public void setCourier(Courier courier) {
		this.courier = courier;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public BigDecimal getFirstPoundPrice() {
		return firstPoundPrice;
	}

	public void setFirstPoundPrice(BigDecimal firstPoundPrice) {
		this.firstPoundPrice = firstPoundPrice;
	}

	public BigDecimal getPerPoundPrice() {
		return perPoundPrice;
	}

	public void setPerPoundPrice(BigDecimal perPoundPrice) {
		this.perPoundPrice = perPoundPrice;
	}

	public Integer getMaxPoundPerBox() {
		return maxPoundPerBox;
	}

	public void setMaxPoundPerBox(Integer maxPoundPerBox) {
		this.maxPoundPerBox = maxPoundPerBox;
	}

	public Boolean getIsTaxIncluded() {
		return isTaxIncluded;
	}

	public void setIsTaxIncluded(Boolean isTaxIncluded) {
		this.isTaxIncluded = isTaxIncluded;
	}

	public String getExtraRequirement() {
		return extraRequirement;
	}

	public void setExtraRequirement(String extraRequirement) {
		this.extraRequirement = extraRequirement;
	}

}
