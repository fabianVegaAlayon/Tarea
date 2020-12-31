package com.capacitacion2.capacitacion2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import java.util.List;

public class PageObjectoTourFrancia extends PageFactory 
{

	public PageObjectoTourFrancia(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(id = "selectweb")
	private WebElement listaSeleccionMultiple;

	@FindBy(className = "ue-table-ranking__cyclist-name")
	private List<WebElement>  listaCiclistas;
	
	
	
	public void seleccionListaDesplegable(String opcion) 
	{
		Select select = new Select(listaSeleccionMultiple);
		select.selectByVisibleText(opcion);
	}

	public void imprimirListaCiclistas() 
	{
		int acumulador = 0;
		for (WebElement posicion : listaCiclistas)
	  
		{
			System.out.println(acumulador + ": " + posicion.getText());
			
			acumulador++;
					  		
		}
		
		
	}
	
	public void imprimirCiclistaLider(int posicion) 
	{
	
		
		int acumulador = 0;
		for (WebElement ciclista : listaCiclistas)
	  
		{
			if(acumulador == posicion) 
			{
				System.out.println(acumulador + 1 + ": " + ciclista.getText());
				break;
			} 
			acumulador ++;					  
		
		}
		
	}
	
	public void seleccionListaDesplegablePorEtapa(int idEtapa) 
	{
		String descripcion = "Etapa "; 
		
		for(int i =1 ; i <= idEtapa; i++ ) 
		{
		
		  String etapa = descripcion + i;		
		  Select select = new Select(listaSeleccionMultiple);
		  select.selectByVisibleText(etapa);
		  imprimirCiclistaLider(0);
		}
	}
	
	
	
}
