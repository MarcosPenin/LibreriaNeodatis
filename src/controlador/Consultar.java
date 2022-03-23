package controlador;

import java.sql.Date;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBRuntimeException;
import org.neodatis.odb.Objects;
import org.neodatis.odb.core.query.IQuery;
import org.neodatis.odb.core.query.criteria.And;
import org.neodatis.odb.core.query.criteria.ICriterion;
import org.neodatis.odb.core.query.criteria.Where;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;

import modelo.Autor;
import modelo.Libro;
import vista.ConsultasVista;
import vista.Mensajes;
import vista.PedirDatos;

public class Consultar {

	public static void autoresItalianos(ODB odb) {
		IQuery query = new CriteriaQuery(Autor.class, Where.equal("nacionalidad", "Rusia"));
		Objects italianos = odb.getObjects(query);
		if (italianos.isEmpty()) {
			Mensajes.sinCoincidencias();
		} else {
			ConsultasVista.autoresItalianos(italianos);
			
		
		}
	}

	public static void librosEntreFechas(ODB odb) {
		String dni = PedirDatos.pedirDni();
		Date fechaInicio = PedirDatos.pedirFechaInicio();
		Date fechaFin = PedirDatos.pedirFechaFin();

		try {
			IQuery query = new CriteriaQuery(Autor.class, Where.equal("dni", dni));
			Autor a = (Autor) odb.getObjects(query).getFirst();
			for (Libro l : a.getLibros()) {
				if (l.getFechaPublicacion().after(fechaInicio) && l.getFechaPublicacion().before(fechaFin)) {
					ConsultasVista.imprimirLibro(l);
				}
			}
		} catch (ODBRuntimeException e) {
			Mensajes.autorNoEncontrado();
		}

	}

	public static void autoresEspanolesMenores60(ODB odb) {

		ICriterion criterio = new And().add(Where.equal("nacionalidad", "España")).add(Where.lt("edad", 60));
		IQuery query = new CriteriaQuery(Autor.class, criterio);

		Objects espanolesMenores60 = odb.getObjects(query);
		if (espanolesMenores60.isEmpty()) {
			Mensajes.sinCoincidencias();
		} else {
			ConsultasVista.imprimirAutoresMenores60(espanolesMenores60);
					
		}

	}

	public static void librosAutor(ODB odb) {
		String nombre = PedirDatos.pedirNombre();

		try {
			IQuery query = new CriteriaQuery(Autor.class, Where.equal("nombre", nombre));
			Autor a = (Autor) odb.getObjects(query).getFirst();
			for (Libro l : a.getLibros()) {
				ConsultasVista.imprimirLibro(l);
			}
		} catch (ODBRuntimeException e) {
			Mensajes.autorNoEncontrado();
		}
	}

	public static void libroConAutor(ODB odb) {
		String titulo = PedirDatos.pedirTitulo();
		Objects autores = odb.getObjects(Autor.class);
		
		while (autores.hasNext()) {
			Autor autor = (Autor) autores.next();
			for (Libro l : autor.getLibros()) {
				if (l.getTitulo().equals(titulo)) {
					ConsultasVista.imprimirLibro(l);
					ConsultasVista.imprimirAutor(autor);
				}
			}

		}
	}

	public static void numAutoresNacion(ODB odb) {

		String nacion = PedirDatos.pedirNacion();
		Objects autores = odb.getObjects(Autor.class);
		int contador = 0;
		while (autores.hasNext()) {
			Autor autor = (Autor) autores.next();
			if (autor.getNacionalidad().equalsIgnoreCase(nacion)) {
				contador++;
			}
		}

		ConsultasVista.imprimirNumAutoresNacion(nacion, contador);

	}

}

