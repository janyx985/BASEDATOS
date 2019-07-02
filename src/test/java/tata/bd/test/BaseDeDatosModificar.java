package tata.bd.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tata.bd.base.BaseDeDatos;
import tata.bd.dato.Dato;

public class BaseDeDatosModificar {
	private BaseDeDatos base;
	@Before
	public void setUp() throws Exception {
		this.base = new BaseDeDatos();
		this.base.agregar(new Dato("W1","DatosPrueba01"));
		this.base.agregar(new Dato("W2","DatosPrueba02"));
		this.base.agregar(new Dato("W3","DatosPrueba03"));
		this.base.agregar(new Dato("W4","DatosPrueba04"));
		this.base.agregar(new Dato("W5","DatosPrueba05"));
	}

	@Test
	public void cuandoEsDatoModificarEntoncesTrue() {
		boolean resultado = this.base.modificar(new Dato("W4", "DATA PRUEBA W4"));
		assertTrue("\n***Retorna " + resultado + " porque NO modificó objeto", resultado);
	}
	
	@Test
	public void cuandoEsDatoNuevoEntoncesFalse() {
		boolean resultado = this.base.modificar(new Dato("M6", "DATA PRUEBA M6"));
		assertTrue("\n***Retorna " + resultado + " porque SI modificó \n objeto y no debió", !resultado);
	}
	
	@Test
	public void cuandoEsDatoNuevoconDatoNullEntoncesTrue() {
		boolean resultado = this.base.modificar(new Dato("W4", null));
		assertTrue("\n***Retorna " + resultado + " porque NO modificó \n objeto y si debió", resultado);
	}
	
}
