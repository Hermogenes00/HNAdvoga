package br.com.DAO;

import java.util.ArrayList;

public interface InterfaceDAO<T> {

	T carregar(int codigo);

	void excluir(T objeto);

	ArrayList<T> consultar(String busca);

	void alterar(T objeto);

	void incluir(T objeto);

}
