package Pruebas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Service.Cliente;
import Service.Concesionario;

class PruebasTDD {

	@Test
	public void existeClienteResiveUnCliente () {
		Concesionario concesionario = new Concesionario("el gangazo");
		Cliente cliente = new Cliente("juan","Recreo",311755013,"juanj.orozc@uvq.co");
		concesionario.agregarCliente(cliente);
		assertTrue(concesionario.getClientes().contains(cliente));
		assertEquals(Cliente.class, cliente.getClass());
	}

}

