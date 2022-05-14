package main;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Product {
	@Id
	@Column(name = "code", unique = true, nullable = false)
	private String code;
	private String description;
	private BigDecimal price;

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
