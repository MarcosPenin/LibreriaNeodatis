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

public class Modificar {

	public static void modificarAutor(ODB odb) {
		String dni = PedirDatos.pedirDni();
		
		try {
			IQuery query = new CriteriaQuery(Autor.class, Where.equal("dni", dni));
			Autor a = (Autor) odb.getObjects(query).getFirst();
			String nuevaDireccion = PedirDatos.pedirNuevaDireccion();
			a.setDireccion(nuevaDireccion);
			odb.store(a);
			odb.commit();
			Mensajes.direccionmodificada(dni);
		} catch (ODBRuntimeException e) {
			Mensajes.autorNoEncontrado();
		}
	}

	public static void modificarPrecio(ODB odb) {
		String titulo = PedirDatos.pedirTitulo();
		String nombre = PedirDatos.pedirNombre();
	
		try {
			IQuery query = new CriteriaQuery(Autor.class, Where.equal("nombre", nombre));
			Autor a = (Autor) odb.getObjects(query).getFirst();
			float precio = PedirDatos.pedirPrecio();

			for (Libro l : a.getLibros()) {
				if (l.getTitulo().equalsIgnoreCase(titulo)) {
					l.setPrecio(precio);
					odb.store(a);
					odb.commit();
				}
			}
		} catch (ODBRuntimeException e) {
			Mensajes.autorNoEncontrado();
		}

	}
}
