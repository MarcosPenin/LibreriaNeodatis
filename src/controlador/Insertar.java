package controlador;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBRuntimeException;
import org.neodatis.odb.Objects;
import org.neodatis.odb.core.query.IQuery;
import org.neodatis.odb.core.query.criteria.Where;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;

import modelo.Autor;
import modelo.Libro;
import vista.Mensajes;
import vista.PedirDatos;

public class Insertar {

	public static void insertarAutor(ODB odb) {
		Autor autor = PedirDatos.pedirAutor();
		IQuery query = new CriteriaQuery(Autor.class, Where.equal("dni", autor.getDni()));
		Objects repetidos = odb.getObjects(query);
		if (repetidos.isEmpty()) {
			odb.store(autor);
			odb.commit();
			Mensajes.autorInsertado(autor);
		} else {
			Mensajes.autorRepetido();
		}
	}

	public static void anadirLibroAutor(ODB odb) {
		Libro libro = PedirDatos.pedirLibro();
		String dni = PedirDatos.pedirDni();
		IQuery query = new CriteriaQuery(Autor.class, Where.equal("dni", dni));
		Autor autor = null;
		try {
			autor = (Autor) odb.getObjects(query).getFirst();
		} catch (ODBRuntimeException e) {
			Mensajes.autorNoEncontrado();
		}

		IQuery query2 = new CriteriaQuery(Libro.class, Where.equal("cod", libro.getCod()));
		Objects repetidos = odb.getObjects(query2);

		if (repetidos.isEmpty()) {
			if (autor != null) {
				autor.anadirLibro(libro);
				odb.store(autor);
				odb.commit();
			} else {
				Mensajes.autorNoEncontrado();
			}
		} else {
			Mensajes.libroRepetido();
		}
	}
}
