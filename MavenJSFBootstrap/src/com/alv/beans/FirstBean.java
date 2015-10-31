package com.alv.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.alv.base.classes.IndicatorReporterItem;
import com.alv.base.classes.PercentItem;
import com.alv.base.classes.TimeLineItem;

@ManagedBean
@SessionScoped
public class FirstBean implements Serializable {
	private static final long serialVersionUID = 1L;
	 
	private String name;
	private List<PercentItem> items;
	private List<TimeLineItem> task;
	
	private String cantidad;
	private String firstName;
	private String lastName;
	
	
	IndicatorReporterItem indicador;
	
	public FirstBean() {
		
		indicador = new IndicatorReporterItem("50,41,10,90,200,15,0", "546", "ventas", "icon-tasks", "http://www.google.com.co", "Ver reporte completo");
		cantidad="45";
	}
	
	
	
	public void accionRemota( ) {
		System.out.println("llego al metodo");
		cantidad="" + (Integer.parseInt(cantidad)+1);
	}
	
	
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void updateName() {
		name = "actualizado";
	}

	public List<PercentItem> getItems() {
		items= new ArrayList<PercentItem>();
		for(int i = 0; i < 20; i++) {
			items.add(new PercentItem("Enca " + i, "label " + i,String.valueOf((int)(Math.random()*100d)), "20" + (i*10), "MG" + i));
		}
		
		return items;
	}

	public void setItems(List<PercentItem> items) {
		this.items = items;
	}

	public List<TimeLineItem> getTask() {
		task = new ArrayList<TimeLineItem>();
		for(int i = 0; i < 100; i++) {
			task.add(new TimeLineItem("subject "+i, "message "+i, "remaningTime "+i, "icon-adjust", i+":43 PM"));
			
		}
		return task;
	}

	public void setTask(List<TimeLineItem> task) {
		this.task = task;
	}



	public String getCantidad() {
		return cantidad;
	}



	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public IndicatorReporterItem getIndicador() {
		return indicador;
	}



	public void setIndicador(IndicatorReporterItem indicador) {
		this.indicador = indicador;
	}
	
	
	
}
