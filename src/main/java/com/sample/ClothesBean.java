package com.sample;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean
@SessionScoped
public class ClothesBean implements Serializable {

private static final long serialVersionUID = 1L;
	
	private String type;
	private String brand;

	public String getType() {
		return type;
	}
	public String getBrand() {
		return brand;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
}
