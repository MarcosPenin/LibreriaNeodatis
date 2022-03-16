package controlador;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBRuntimeException;
import org.neodatis.odb.core.query.IQuery;
import org.neodatis.odb.core.query.criteria.Where;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;

import modelo.Autor;
import modelo.Libro;
import vista.Mensajes;
import vista.PedirDatos;

public class Borrar {

	public static void libro(ODB odb) {
		int cod=PedirDatos.pedirCodigo();		
		try{
			IQuery query = new CriteriaQuery(Autor.class, Where.equal("cod", cod));
			Libro l = (Libro) odb.getObjects(query).getFirst();
			odb.delete(l);
			odb.commit();		
		}catch (ODBRuntimeException e) {
			Mensajes.libroNoEncontrado();
		}
		
		
	}

}
