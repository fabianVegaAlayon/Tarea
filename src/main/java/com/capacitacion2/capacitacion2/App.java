package com.capacitacion2.capacitacion2;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		String urlPagina = "https://www.marca.com/ciclismo/tour-francia/clasificacion.html";
		ManagerDriver objManager = new ManagerDriver("google", urlPagina);
		objManager.navegarAPagina();
		PageObjectoTourFrancia objTour = new PageObjectoTourFrancia(objManager.getWebDriver());

		// Seleccionar etapa especifica
		// objTour.seleccionListaDesplegable("Etapa 10");
		// espera(1);
		// objTour.imprimirListaCiclistas();
		// espera(5);
		// objTour.imprimirCiclistaLider(64);
		// espera(5);
		objTour.seleccionListaDesplegablePorEtapa(21);
		// espera(15);
		// objManager.cerrarNavegador();
		// espera(5);

	}

	public static void espera(int tiempo) {
		try {
			Thread.sleep(tiempo * 1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
