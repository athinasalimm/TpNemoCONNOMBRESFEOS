package Nemoo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;
import org.junit.jupiter.api.function.Executable;

public class NemoTest {

	@Test public void test00FindingNemo() {
		assertEquals ( new Nemo3(new Posicion3(0,0), new RotacionNorte()).getProfundidad(), 0 );
		assertEquals ( new Nemo3(new Posicion3(0,0), new RotacionNorte()).getRotacion(), "norte");
		assertEquals ( new Nemo3(new Posicion3(0,0), new RotacionNorte()).getY(), 0 );
		assertEquals ( new Nemo3(new Posicion3(0,0), new RotacionNorte()).getX(), 0 );
	}

	@Test public void test01NemoDoesNotMove() {
		assertEquals ( new Nemo3(new Posicion3(0,0), new RotacionNorte()).movimientovacio(' ').getProfundidad(), 0 );
		assertEquals ( new Nemo3(new Posicion3(0,0), new RotacionNorte()).getRotacion(), "norte");
		assertEquals ( new Nemo3(new Posicion3(0,0), new RotacionNorte()).getY(), 0 );
		assertEquals ( new Nemo3(new Posicion3(0,0), new RotacionNorte()).getX(), 0 );
	}
	
	//@Test public void test02NemoGoesDown() {
		//assertEquals ( new Nemo3().movimientoD('d').getProfundidad(), 1 );
	//}
	
	//@Test public void test03NemoGoesUp() {
		//assertEquals ( new Nemo3().movimientoU('u').getProfundidad(), -1 );
	//}
	
	@Test public void test04NemoGoesLeft() {
		assertEquals ( new Nemo3(new Posicion3(0,0), new RotacionNorte()).ejecutarComandos("l").getRotacion(), "oeste" );
	}
	@Test public void test05NemoGoesRight() {
		assertEquals ( new Nemo3(new Posicion3(0,0), new RotacionNorte()).ejecutarComandos("r").getRotacion(), "este" );
	}
	@Test public void test06NemoMovesNorthForward() {
		assertEquals ( new Nemo3(new Posicion3(0,0), new RotacionNorte()).ejecutarComandos("f").getY(), 1 );
	}
	
	@Test public void test07NemoReleasesCapsule() {
	}
	@Test public void test08NemoHaceMuchosMovs() { 
		// cambiar nombre
		Nemo3 nemin = new Nemo3(new Posicion3(0,0), new RotacionNorte());
		nemin.ejecutarComandos("duddrff");
		assertEquals ( nemin.getProfundidad(), 2 );
		assertEquals ( nemin.getRotacion(), "este");
		assertEquals ( nemin.getX(), 2 );
	}
	
	@Test public void test09NemoEndsinEast() {
		Nemo3 nemo = new Nemo3(new Posicion3(0,0), new RotacionNorte());
		nemo.ejecutarComandos("rllrfur");
		assertEquals(nemo.getRotacion(), "este");

	}
	
	@Test public void test10NemoGoesSouth() {
		Nemo3 nemin = new Nemo3(new Posicion3(0,0), new RotacionNorte());
		nemin.ejecutarComandos("lluuddmlr");
		assertEquals ( nemin.getRotacion(), "sur");
	}
	

	@Test public void test10NemoCannotThrowCapsule() {

		Nemo3 nemin = new Nemo3(new Posicion3(0,0), new RotacionNorte());

		nemin.ejecutarComandos("duddrff");

		try {

			 nemin.movimientoM('m');

		}

		catch (Error e){

			assertThrowsLike(() -> nemin.movimientoM('m'), "no se puede tirar misil en estas condiciones");

			

		}

	}

	  private void assertThrowsLike(Executable exectuable, String message) {

		  assertEquals(message, (assertThrows(Error.class, exectuable)).getMessage());

	  }
	
}