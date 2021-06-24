package calizaya.main;

import calizaya.framework.MostrarConsola;

public class Main {
	public static void main(String[] args) {
		MostrarConsola star = new MostrarConsola("/config/archivoPropiedades.properties");
		star.mostrarMenu();
	}
}