package com.alv.base.classes;

import java.io.Serializable;

public class PercentItem implements Serializable {
	
	private static final long serialVersionUID = -533697522712282382L;
	
	private String encabezado;
	private String label;
	private String value;
	private String totalValue;
	private String unitOfValue;
	
	
	@SuppressWarnings("unused")
	private PercentItem(){}
	
	public PercentItem(String encabezado, String label, String value, String totalValue, String unitOfValue){
		this.encabezado = encabezado;
		this.label = label;
		this.value = value;
		this.totalValue = totalValue;
		this.unitOfValue = unitOfValue;	
		
	}
	
	
	public String getEncabezado() {
		return encabezado;
	}
	public void setEncabezado(String encabezado) {
		this.encabezado = encabezado;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(String totalValue) {
		this.totalValue = totalValue;
	}
	public String getUnitOfValue() {
		return unitOfValue;
	}
	public void setUnitOfValue(String unitOfValue) {
		this.unitOfValue = unitOfValue;
	}


	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}
	
	
	
	

}
