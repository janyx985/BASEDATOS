package tata.bd.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tata.bd.base.BaseDeDatos;
import tata.bd.dato.Dato;

public class BaseDeDatosEliminar {
	private BaseDeDatos base;
	@Before
	public void setUp() throws Exception {
		this.base = new BaseDeDatos();
		this.base.agregar(new Dato("X1","DatosPrueba01"));
		this.base.agregar(new Dato("X2","DatosPrueba02"));
		this.base.agregar(new Dato("X3","DatosPrueba03"));
		this.base.agregar(new Dato("X4","DatosPrueba04"));
		this.base.agregar(new Dato("X5","DatosPrueba05"));
	}

	@Test
	public void cuandoElimina1EntoncesListaSize4() {
		this.base.eliminar("X3");
		int largo = this.base.listar().size();
		assertTrue("\n*****1- Es de largo 4 pero retorna " + largo, largo == 4);
	}
	
	@Test
	public void cuandoElimina1EntoncesTrue() {
		boolean respuesta = this.base.eliminar("X3");
		assertTrue("\n***2- Retorna " + respuesta + " porque NO eliminó objeto",respuesta);
	}
	
	@Test
	public void cuandoNoEliminaEntoncesFalse() {
		boolean respuesta = this.base.eliminar("X16");
		assertTrue("\n***3- Retorna " + respuesta + " porque SI eliminó \n objeto y no debió",!respuesta);
	}
	
	@Test
	public void cuandoEliminax3MinusculaEntoncesTrue() {
		boolean respuesta = this.base.eliminar("x3");
		assertTrue("\n***4- Retorna " + respuesta + " porque \n NO eliminó a pesar del equalsIgnoreCase",respuesta);
	}
}
