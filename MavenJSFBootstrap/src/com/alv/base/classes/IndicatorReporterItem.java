package com.alv.base.classes;

import java.io.Serializable;
import java.util.List;

public class IndicatorReporterItem implements Serializable {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2151012063077274421L;
	private String values;
	private String valueToday;
	private String title;
	private String icono;
	private String externalLink;
	private String footerLabel;
	
	
	@SuppressWarnings("unused")
	private IndicatorReporterItem(){}
	
	public IndicatorReporterItem(String values,String valueToday,String title, String icono,String externalLink, String footerLabel ) {
		this.values=values;
		this.valueToday=valueToday;
		this.title=title;
		this.icono=icono;
		this.externalLink = externalLink;
		this.footerLabel = footerLabel;
 	}

	public String getValues() {
		return values;
	}

	public void setValues(String values) {
		this.values = values;
	}

	public String getValueToday() {
		return valueToday;
	}

	public void setValueToday(String valueToday) {
		this.valueToday = valueToday;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIcono() {
		return icono;
	}

	public void setIcono(String icono) {
		this.icono = icono;
	}

	public String getExternalLink() {
		return externalLink;
	}

	public void setExternalLink(String externalLink) {
		this.externalLink = externalLink;
	}

	public String getFooterLabel() {
		return footerLabel;
	}

	public void setFooterLabel(String footerLabel) {
		this.footerLabel = footerLabel;
	}
	
	
	
	
	
	
	

}
