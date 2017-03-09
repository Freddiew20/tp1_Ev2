package almacen;

import static org.junit.Assert.assertEquals;
import almacen.*;
import org.junit.Test;


public class TesterAlmacen {
	Almacen a=new Almacen();
	@Test
	public void testexistePale() {
		Pale p=new Pale("2",20.0,20);
		 
		assertEquals(a.existePale(p.getCodigo()),false);
		System.out.println("el metodo existe pale funciona correctamente");
	}

}
