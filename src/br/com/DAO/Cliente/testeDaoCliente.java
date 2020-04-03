package br.com.DAO.Cliente;

import java.util.Date;

import br.com.Constantes.CONSTANTES;
import br.com.Modelo.Cliente.Cliente;

public class testeDaoCliente {

	public static void main(String[] args) {

		Cliente c = new Cliente(0, "Neto", "000.000.000-75", "00 0 00000000", "000000000", "Endereço Rua",
				"Endereço Numero", "Endereço Bairro", "BA", new Date(), CONSTANTES.STATUS_ATIVO);

		DAOCliente<Cliente> daoCliente = new DAOCliente<Cliente>();

		daoCliente.incluir(c);

		daoCliente.clientes.forEach(cli -> {
			System.out.println(cli.toString());
		});

		c.setNome("Hermógenes");
		daoCliente.alterar(c);

		daoCliente.clientes.forEach(cli -> {
			System.out.println(cli.toString());
		});
	}

}
