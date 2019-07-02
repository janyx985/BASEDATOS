package tata.bd.test;

import static org.junit.Assert.*;


import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import tata.bd.base.BaseDeDatos;
import tata.bd.dato.Dato;

public class BaseDeDatosAgregarOrdenado {

	private BaseDeDatos base;
	
	@Before
	public void setUp() throws Exception {
		this.base = new BaseDeDatos();
	}

	@Test
	public void cuandoAgregaPrimerDatoEntoncesTrue() {
		boolean retorno = this.base.agregar(new Dato("V1","DatosPrueba01"));
		assertTrue("\n***Retorna " + retorno + " porque NO agregó objeto", retorno);
	}
	
	@Test
	public void cuandoAgrega3DatosDesordenadoEntoncesResultadoOrdenadoTrue() {
		this.base.agregar(new Dato("V3","DatosPrueba03"));
		this.base.agregar(new Dato("V1","DatosPrueba01"));
		this.base.agregar(new Dato("V2","DatosPrueba02"));
		String comparaID = "";
		boolean resultadoOrdenado = true;
		Iterator<Dato> ite = this.base.listar().iterator();
		while(ite.hasNext()) {
			String IDactual = ite.next().getId();
			if(comparaID.compareTo(IDactual)>0) {
				resultadoOrdenado = false;
				break;
			}else
				comparaID = IDactual;
		}
		assertTrue("\n***Resultado es  " + resultadoOrdenado + " porque NO ordenó", resultadoOrdenado);
	}
}
