package paquete;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;


class VehiculoTest {
	
	private Automovil auto;
	private Remis remis;
	
	@BeforeEach
	public void setUp() {
		auto = new Automovil("Hernan");
		remis = new Remis("Bigote");
	}

	@Test
	void testQueConocenSusTipos() {
		assertEquals("automovil", auto.getTipo());
		assertEquals("remis", remis.getTipo());
	}
	
	@Test
	void testQueAutomovilSeDesplaza() {

		String cadena = "Soy un automovil. Me conduce Hernan. \nMe desplazo de palermo a almagro";
		
		assertEquals(cadena, auto.desplazarse("palermo", "almagro"));
	}
	
	@Test
	void testQueRemisSeDesplazaVacio() {
		String origen = "almagro";
		String frase = "estoy yendo a " + origen + " a recoger a un pasajero";
		
		assertEquals(frase, remis.desplazarse(origen, "palermo"));
	}
	
	@Test
	void testQueRemisSeDesplazaConDosPasajeros() {
		String origen = "almagro";
		remis.subirPasajero("pasajero1");
		remis.subirPasajero("pasajero2");
		
		String frase = "Soy un remis. Me conduce Bigote. \nMe desplazo de almagro a palermo\nLlevo 2 pasajeros";
		
		assertEquals(frase, remis.desplazarse(origen, "palermo"));
	}

}
