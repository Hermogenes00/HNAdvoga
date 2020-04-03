package br.com.DAO.Cliente;

import java.util.ArrayList;

import br.com.DAO.InterfaceDAO;
import br.com.Modelo.Cliente.Cliente;

public class DAOCliente<T> implements InterfaceDAO<T> {

	public static ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	@Override
	public T carregar(int codigo) {

		Cliente cli = new Cliente();
		for (Cliente c : clientes) {

			if (c.getCodigo() == codigo) {
				cli = c;
			}

		}

		return (T) cli;
	}

	@Override
	public void excluir(T objeto) {

		Cliente c = (Cliente) objeto;

		if (this.carregar(c.getCodigo()) != null) {

			clientes.remove(c);
		}
	}

	@Override
	public ArrayList<T> consultar(String busca) {

		ArrayList<Cliente> lista = new ArrayList<Cliente>();

		for (Cliente c : clientes) {

			if (c.getNome().equals(busca)) {
				lista.add(c);
			}

		}

		return (ArrayList<T>) lista;
	}

	@Override
	public void alterar(T cliente) {

		Cliente c = (Cliente) cliente;

		if (this.carregar(c.getCodigo()) != null) {

			Cliente cli = (Cliente) this.carregar(c.getCodigo());

			clientes.remove(cli);
		}

		this.incluir(cliente);
	}

	@Override
	public void incluir(T objeto) {
		Cliente c = (Cliente) objeto;
		clientes.add(c);
	}

}
