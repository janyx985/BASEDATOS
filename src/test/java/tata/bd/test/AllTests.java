package tata.bd.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BaseDeDatosAgregar.class, BaseDeDatosAgregarOrdenado.class, BaseDeDatosEliminar.class,
		BaseDeDatosListar.class, BaseDeDatosModificar.class })
public class AllTests {

}
