package conexion;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;

public class Cliente {

	public static ODB iniciarCliente() {
		ODB odb=ODBFactory.openClient("localhost", 8000, "LIBRERIA.DB");		
		System.out.println("Cliente conectado");	
		return odb;	
	}
	
}
