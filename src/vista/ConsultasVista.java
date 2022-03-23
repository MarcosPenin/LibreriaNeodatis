package vista;

import org.neodatis.odb.Objects;

import modelo.Autor;
import modelo.Libro;

public class ConsultasVista {

	public static void imprimirAutoresMenores60(Objects autores) {
		System.out.println("-----LISTA DE AUTORES ESPAÑOLES MENORES DE 60---");
		System.out.printf("%-20s %-20s %-20s %n", "NOMBRE", "EDAD", "LIBROS");
		while (autores.hasNext()) {
			Autor autor = (Autor) autores.next();
			System.out.printf("%-20s %-20s %-80s %n", autor.getNombre(), autor.getEdad(), autor.getLibros().toString());
		}
	}

	public static void imprimirLibro(Libro libro) {
		System.out.println(libro.toString());

	}

	public static void imprimirAutor(Autor autor) {
		System.out.println(autor.toString());
	}

	public static void imprimirNumAutoresNacion(String nacion, int contador) {
		System.out.println("Hay un total de " + contador + " autores con la nacionalidad " + nacion);
	}

	public static void autoresItalianos(Objects italianos) {
		System.out.println("-----LISTA DE AUTORES ITALIANOS---");
		System.out.printf("%-20s %-20s %-20s %n", "NOMBRE", "EDAD", "LIBROS");
		while (italianos.hasNext()) {
			Autor autor = (Autor) italianos.next();
			System.out.printf("%-20s %-20s %-20s %n", autor.getNombre(), autor.getEdad(), autor.getLibros());

		}

	}

}
