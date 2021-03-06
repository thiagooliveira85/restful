package br.com.estudos.restful.model;

import java.util.List;

public class Informacao {
	
	private long id;
	private String numPedido;
	private String pedido;
	private String idFornecedor;
	private String fornecedor;
	private List<Item> itens;
	
	public Informacao() {}
	
	public Informacao(long id) {
		this.id = id;
	}
	
	public Informacao(long id, String numPedido, String pedido, String idFornecedor, String fornecedor, List<Item> itens) {
		this.id = id;
		this.numPedido = numPedido;
		this.pedido = pedido;
		this.idFornecedor = idFornecedor;
		this.fornecedor = fornecedor;
		this.itens = itens;
	}

	public String getNumPedido() {
		return numPedido;
	}
	public void setNumPedido(String numPedido) {
		this.numPedido = numPedido;
	}
	public String getPedido() {
		return pedido;
	}
	public void setPedido(String pedido) {
		this.pedido = pedido;
	}
	public String getIdFornecedor() {
		return idFornecedor;
	}
	public void setIdFornecedor(String idFornecedor) {
		this.idFornecedor = idFornecedor;
	}
	public String getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	public List<Item> getItens() {
		return itens;
	}
	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Informacao other = (Informacao) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
