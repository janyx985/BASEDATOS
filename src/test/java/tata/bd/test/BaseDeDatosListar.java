package tata.bd.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tata.bd.base.BaseDeDatos;
import tata.bd.dato.Dato;

public class BaseDeDatosListar {
	
	private BaseDeDatos base;
	@Before
	public void setUp() throws Exception {
		this.base = new BaseDeDatos();
	}

	@Test
	public void cuandoNoAgregaEntoncesListaSize0() {
		int largo = this.base.listar().size();
		assertTrue("\n***** Es de largo 0 pero retorna " + largo, largo == 0);
	}
	
	@Test
	public void cuandoAgrega1EntoncesListaSize1() {
		this.base.agregar(new Dato("Z1","DATOPrueba01"));
		int largo = this.base.listar().size();
		assertTrue("\n***** Es de largo 1 pero retorna " + largo, largo == 1);
	}
	
	@Test
	public void cuandoAgrega4EntoncesListaSize4() {
		this.base.agregar(new Dato("Z1","DATOPrueba01"));
		this.base.agregar(new Dato("Z2","DATOPrueba02"));
		this.base.agregar(new Dato("Z3","DATOPrueba03"));
		this.base.agregar(new Dato("Z4","DATOPrueba04"));
		int largo = this.base.listar().size();
		assertTrue("\n***** Es de largo 4 pero retorna " + largo, largo == 4);
	}
}
