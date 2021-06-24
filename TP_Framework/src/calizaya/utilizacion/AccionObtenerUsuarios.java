package calizaya.utilizacion;

import calizaya.framework.Action;

public class AccionObtenerUsuarios implements Action {

	@Override
	public void ejecutar() {
		System.out.println("Resultados = Rodrigo Calizaya, Juan Perez, German Lopez");
	}

	@Override
	public String nombreItemMenu() {
		return "Obtener usuarios";
	}

	@Override
	public String descripcionItemMenu() {
		return "Obtiene una lista de nombres de usuarios de BD";
	}

}
