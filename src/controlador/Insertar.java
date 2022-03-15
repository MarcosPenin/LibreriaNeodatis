package controlador;

import java.time.LocalDate;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.Objects;
import org.neodatis.odb.core.query.IQuery;
import org.neodatis.odb.core.query.criteria.Where;

import modelo.Autor;
import modelo.Libro;
import vista.PedirDatos;

public class Insertar {

	public static void insertarAutor(ODB odb) {
		Autor autor = PedirDatos.pedirAutor();
		odb.store(autor);
		odb.commit();
	}

	public static void anadirLibroAutor(ODB odb) {
		Libro libro = PedirDatos.pedirLibro();
		String dni = PedirDatos.pedirDni();

		Objects autores = odb.getObjects(Autor.class);
		while (autores.hasNext()) {
			Autor a = (Autor) autores.next();
			if (a.getDni().equals(dni)) {
				a.anadirLibro(libro);
				odb.store(a);
				odb.commit();
			}

		}

	}

}

/*
 * 1- Altas de un autor con todos sus libros. 2-Añadir un libro nuevo a un autor
 * ya existente. 3-Modificación de la dirección de un autor
 * determinado,recibiendo su dni. 4-Modificación del precio de un libro
 * determinado,recibiendo el título y el nombre del autor. 5- Borrado de
 * libros,introduciendo el nombre de un autor y código del libro. 6-Consulta de
 * todos los autores cuya nacionalidad sea ITALIANA. 7-Consulta de los libros
 * escritos por un autor determinado entre dos fechas . 8-Visualiza todos los
 * autores cuya nacionalidad sea ESPAÑOLA y su edad sea < de 60 años.En el
 * listado poner una cabecera en la que figure: Nombre Edad Libros -----------
 * ------- -------- 9- Visualiza por cada nación, el nº de Autores.
 * 10-Introduciendo el nombre de un autor, nos visualice todos sus libros.
 * Título Precio -------- -------- 11- Consultas. “Introduciendo el título de un
 * libro visualice los datos del libro y autor”. 12- Fin.
 */