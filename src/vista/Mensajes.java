package vista;

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
	
	
}
