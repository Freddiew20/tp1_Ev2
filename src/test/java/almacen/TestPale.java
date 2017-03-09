package almacen;

import static org.junit.Assert.*;
import org.junit.Test;
import piladealmacen.*;
public class TestPale {

	@Test
	public void test() {
		Pale p = new Pale("54",9.2,354);
		assertEquals(p.getCodigo(),"54");
		assertEquals(p.getNumeroCajas(),354);
		System.out.println("El palé es creado sin problemas");
	}

}
