package vista;

import modelo.Autor;

public class Mensajes {

	public static void autorNoEncontrado() {
		System.out.println("No se ha encontrado el autor");
	}

	public static void autorRepetido() {
		System.out.println("No se ha podido guardar, ya existe un autor con ese DNI en la base de datos");

	}

	public static void libroRepetido() {
		System.out.println("No se ha podido guardar, ya existe un libro con ese c�digo en la base de datos");

	}

	public static void libroNoEncontrado() {
		System.out.println("No se ha encontrado ning�n libro con ese c�digo");

	}

	public static void sinCoincidencias() {
		System.out.println("La b�squeda no ha encontrado ninguna coincidencia");
	}

	public static void libroBorrado(int cod) {
		System.out.println("Se ha borrado el libro con el c�digo " + cod);
	}

	public static void direccionmodificada(String dni) {
		System.out.println("Se ha modificado la direcci�n del autor con dni " + dni);

	}

	public static void autorInsertado(Autor autor) {
		System.out.println("Se ha insertado correctamente al autor con dni "+autor.getDni());
		
	}

}
