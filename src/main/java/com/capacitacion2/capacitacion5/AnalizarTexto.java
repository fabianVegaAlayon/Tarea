package com.capacitacion2.capacitacion5;

public class AnalizarTexto 
{
	private String oracion; 
	public AnalizarTexto(String oracion) 
	{
		this.oracion = oracion; 
	}
	
	
	public  int determinarNumeroDePalabras() 
	{
	
	 return oracion.trim().split(" ").length;
		
	}

	
	public int cantidadDeCAracteres() 
	{
		return oracion.length();
	}
	
	
	
	public String getOracion() {
		return oracion;
	}

	public void setOracion(String oracion) {
		this.oracion = oracion;
	}

}
