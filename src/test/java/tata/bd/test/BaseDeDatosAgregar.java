package tata.bd.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tata.bd.base.BaseDeDatos;
import tata.bd.dato.Dato;

public class BaseDeDatosAgregar {

	private BaseDeDatos base;
	
	@Before
	public void setUp() throws Exception {
		this.base = new BaseDeDatos();
	}

	@Test
	public void cuandoAgrega1EntoncesTrue() {
		boolean retorno = this.base.agregar(new Dato("Y1","DatosPrueba01"));
		assertTrue("\n***Retorna " + retorno + " porque NO agregó objeto", retorno);
	}

	@Test
	public void cuandoDatoIgualNullEntoncesFalse() {
		boolean retorno = this.base.agregar(new Dato(null, null));
		assertTrue("\n***1- Retorna " + retorno + " porque SI agregó \n objeto y no debió", !retorno);
	}
	
	@Test
	public void cuandoDato_IDIgualNullEntoncesFalse() {
		boolean retorno = this.base.agregar(new Dato(null,"DatosPrueba01"));
		assertTrue("\n***2- Retorna " + retorno + " porque SI agregó \n objeto y no debió", !retorno);
	}

	@Test
	public void cuandolengthDatoIDIgual1EntoncesFalse() {
		boolean retorno = this.base.agregar(new Dato("Y","DatosPrueba01"));
		assertTrue("\n***3- Retorna " + retorno + " porque SI agregó \n objeto y no debió", !retorno);
	}
	
	@Test
	public void cuandolengthDatoIDIgual0EntoncesFalse() {
		boolean retorno = this.base.agregar(new Dato("","DatosPrueba01"));
		assertTrue("\n***4- Retorna " + retorno + " porque SI agregó \n objeto y no debió", !retorno);
	}


}//corchete final
