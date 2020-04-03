package br.com.Modelo.Cliente;

import java.util.Date;

import br.com.Constantes.CONSTANTES;

public class Cliente {

	private int codigo;
	private String nome;
	private String cpf;
	private String telefone;
	private String rg;
	private String endereco_rua;
	private String endereco_numero;
	private String endereco_bairro;
	private String uf;
	private Date data_cadastro;
	private CONSTANTES STATUS;

	public Cliente(int codigo, String nome, String cpf, String telefone, String rg, String endereco_rua,
			String endereco_numero, String endereco_bairro, String uf, Date data_cadastro, CONSTANTES STATUS) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.rg = rg;
		this.endereco_rua = endereco_rua;
		this.endereco_numero = endereco_numero;
		this.endereco_bairro = endereco_bairro;
		this.uf = uf;
		this.data_cadastro = data_cadastro;
		this.STATUS = STATUS;
	}

	public Cliente() {
	}

	public CONSTANTES getStatus() {
		return STATUS;
	}

	public void setStatus(CONSTANTES constante) {
		this.STATUS = constante;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEndereco_rua() {
		return endereco_rua;
	}

	public void setEndereco_rua(String endereco_rua) {
		this.endereco_rua = endereco_rua;
	}

	public String getEndereco_numero() {
		return endereco_numero;
	}

	public void setEndereco_numero(String endereco_numero) {
		this.endereco_numero = endereco_numero;
	}

	public String getEndereco_bairro() {
		return endereco_bairro;
	}

	public void setEndereco_bairro(String endereco_bairro) {
		this.endereco_bairro = endereco_bairro;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public Date getData_cadastro() {
		return data_cadastro;
	}

	public void setData_cadastro(Date data_cadastro) {
		this.data_cadastro = data_cadastro;
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", rg=" + rg
				+ ", endereco_rua=" + endereco_rua + ", endereco_numero=" + endereco_numero + ", endereco_bairro="
				+ endereco_bairro + ", uf=" + uf + ", data_cadastro=" + data_cadastro + ", STATUS=" + STATUS.toString()
				+ "]";
	}

}
