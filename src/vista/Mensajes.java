package vista;

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
	
	
}
