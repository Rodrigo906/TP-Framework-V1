package calizaya.framework;

import java.util.List;
import java.util.Scanner;

public final class EstructuraMenu {

	private List<Action> acciones;

	public EstructuraMenu(List<Action> acciones) {
		this.acciones = acciones;
	}

	public void cargarMenu() {
		int opcionUsuario = -1;
		int opcionSalir = 0;
		System.out.println("Bienvenido, estas son sus opciones:");

		while (opcionUsuario != opcionSalir) {
			for (int i = 0; i < acciones.size(); i++) {
				System.out.println(
						i + 1 + ". " + acciones.get(i).nombreItemMenu() + ": " + acciones.get(i).descripcionItemMenu());
				opcionSalir = i + 2;
			}
			System.out.println(opcionSalir + ". " + "Salir");

			Scanner scaner = new Scanner(System.in);
			System.out.print("Ingrese su opcion: ");
			opcionUsuario = scaner.nextInt();
			if (opcionUsuario == opcionSalir) {
				salir(scaner);
			}
			try {
				acciones.get(opcionUsuario - 1).ejecutar();
			} catch (Exception e) {
				System.out.println(
						"OPCION INVALIDA, por favor ingrese solo una de las opciones que se muestran en pantalla");
			}
			System.out.println("\n");
		}

	}

	private void salir(Scanner scaner) {
		scaner.close();
		System.out.println("\n \n \n \n \n \n \n");
		System.out.println("Gracias por usar nuestro sistema");
		System.exit(0);
	}
}
