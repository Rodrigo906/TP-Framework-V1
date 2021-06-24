package calizaya.utilizacion;

import calizaya.framework.Action;

public class AccionMostrarProductos implements Action {

	@Override
	public void ejecutar() {
		System.out.println("Resultados = Cuadernillo, Lapicera, Boligoma, Lapiz, Cartuchera");
	}

	@Override
	public String nombreItemMenu() {
		return "Mostrar Productos";
	}

	@Override
	public String descripcionItemMenu() {
		return "Lee desde un fichero una lista de productos y la muestra por pantalla";
	}

}
