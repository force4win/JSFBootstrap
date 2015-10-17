package com.alv.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Miga implements Serializable {
	private static final long serialVersionUID = 1L;
	 
	private List<String> rastro;
	
	public Miga(){
		rastro= new ArrayList<String>();
		rastro.add("Admin");
		rastro.add("Users");
		rastro.add("Block");
		
	}

	public List<String> getRastro() {
		return rastro;
	}

	public void setRastro(List<String> rastro) {
		this.rastro = rastro;
	}
	
	
	
	
}
