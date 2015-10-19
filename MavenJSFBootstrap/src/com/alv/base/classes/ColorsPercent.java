package com.alv.base.classes;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ColorsPercent implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int indiceColor = -1;
	
	private String  color;

	public String getColor() {
		String[] colores = new String[]{"yellow","blue","red","green","greenDark","pink","orange","greenLight","black"};
		
		
		//color = colores[indiceColor%colores.length];
		int indiceLocal;
		do{
			indiceLocal = ((int)(Math.random()*((double)colores.length)));
		} while(indiceColor == indiceLocal);
		indiceColor = indiceLocal;
		color = colores[indiceLocal];
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
}
