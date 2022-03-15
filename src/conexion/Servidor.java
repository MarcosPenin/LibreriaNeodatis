package conexion;

import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.ODBServer;

public class Servidor {

	public static ODBServer crearServidor() {
		ODBServer server=null;
		server=ODBFactory.openServer(8000);
		server.addBase("LIBRERIADB", "libreria.test");
		server.startServer(true);
		System.out.println("Servidor iniciado");
		return server;
	
	}
	
	
}
