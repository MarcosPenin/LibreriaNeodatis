package controlador;

import java.time.LocalDate;

import org.neodatis.odb.ODB;

import modelo.Autor;
import modelo.Libro;

public class CrearBase {

	public static void crear(ODB odb) {
		Autor a1 = new Autor("34343434F", "Tolstoi", "Avenida Nevensky", 240, "Rusia");
		Autor a2 = new Autor("34343434L", "Asimov", "Segunda Fundación 14", 240, "EEUU");

		Libro l1 = new Libro(1, "Fundación", "Ciencia ficción", 10);
		Libro l2 = new Libro(2, "El fin de la eternidad", "Ciencia ficción", 10);
		Libro l3 = new Libro(3, "Guerra y Paz", "Clásicos", 10);

		a1.anadirLibro(l3);
		a2.anadirLibro(l2);
		a2.anadirLibro(l1);

		odb.store(a1);
		odb.store(a2);

	}
}
