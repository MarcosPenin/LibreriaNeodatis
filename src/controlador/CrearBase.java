package controlador;

import java.sql.Date;
import java.time.LocalDate;

import org.neodatis.odb.ODB;

import modelo.Autor;
import modelo.Libro;

public class CrearBase {

	public static void crear(ODB odb) {
		Autor a1 = new Autor("34343434F", "Tolstoi", "Avenida Nevensky", 240, "Rusia");
		Autor a2 = new Autor("34343434L", "Asimov", "Segunda Fundación 14", 240, "EEUU");
		Autor a3 = new Autor("23232323P", "Carlos", "Avenida Los Robles", 24, "España");

		Date d1=new Date(1954-1900,10-1,10);
		Date d2=new Date(1962-1900,9-1,8);
		Date d3=new Date(1835-1900,12-1,12);
		
		
		Libro l1 = new Libro(1, "Fundación", "Ciencia ficción", 10,d1);
		Libro l2 = new Libro(2, "El fin de la eternidad", "Ciencia ficción", 10,d2);
		Libro l3 = new Libro(3, "Guerra y Paz", "Clásicos", 10,d3);

		a1.anadirLibro(l3);
		a2.anadirLibro(l2);
		a2.anadirLibro(l1);
		

		odb.store(a1);
		odb.store(a2);
		odb.store(a3);
		
		odb.commit();
	}
}
