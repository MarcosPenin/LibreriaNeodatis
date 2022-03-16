package controlador;

import java.sql.Date;
import java.time.LocalDate;

import org.neodatis.odb.ODB;

import modelo.Autor;
import modelo.Libro;

public class CrearBase {

	public static void crear(ODB odb) {
		Autor a1 = new Autor("34343434F", "Tolstoi", "Avenida Nevensky", 240, "Rusia");
		Autor a2 = new Autor("34343434L", "Asimov", "Segunda Fundaci�n 14", 240, "EEUU");

		Date d1=new Date(1954,10,10);
		Date d2=new Date(1962,9,8);
		Date d3=new Date(1835,12,12);
		
		
		Libro l1 = new Libro(1, "Fundaci�n", "Ciencia ficci�n", 10,d1);
		Libro l2 = new Libro(2, "El fin de la eternidad", "Ciencia ficci�n", 10,d2);
		Libro l3 = new Libro(3, "Guerra y Paz", "Cl�sicos", 10,d3);

		a1.anadirLibro(l3);
		a2.anadirLibro(l2);
		a2.anadirLibro(l1);

		odb.store(a1);
		odb.store(a2);

	}
}
