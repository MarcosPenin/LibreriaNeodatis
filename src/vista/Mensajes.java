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
		System.out.println("No se ha podido guardar, ya existe un libro con ese código en la base de datos");

	}

	public static void libroNoEncontrado() {
		System.out.println("No se ha encontrado ningún libro con ese código");

	}

	public static void sinCoincidencias() {
		System.out.println("La búsqueda no ha encontrado ninguna coincidencia");
	}

	public static void libroBorrado(int cod) {
		System.out.println("Se ha borrado el libro con el código " + cod);
	}

	public static void direccionmodificada(String dni) {
		System.out.println("Se ha modificado la dirección del autor con dni " + dni);

	}

	public static void autorInsertado(Autor autor) {
		System.out.println("Se ha insertado correctamente al autor con dni "+autor.getDni());
		
	}

}
