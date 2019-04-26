package br.com.estudos.restful.ws;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import br.com.estudos.restful.model.Item;

public class ItemBuilder {
	
	private Item item;
	
	public ItemBuilder() {
		item = new Item();
	}

	public ItemBuilder comId(long id) {
		item.setId(id);
		return this;
	}

	public ItemBuilder comItem(String item) {
		this.item.setItem(item);
		return this;
	}

	public ItemBuilder comDescricao(String descricao) {
		item.setDescricao(descricao);
		return this;
	}

	public ItemBuilder comDtEntrega(String dtEntrega) {
		item.setDataEntrega(dtEntrega);
		return this;
	}

	public ItemBuilder comQTD(Integer quantidade) {
		item.setQuantidade(quantidade);
		return this;
	}

	public ItemBuilder comValor(double valor) {
		item.setValorUnitario(new BigDecimal(valor));
		return this;
	}

	public ItemBuilder comValorTotal(double valorTotal) {
		item.setValorTotal(new BigDecimal(valorTotal));
		return this;
	}

	public ItemBuilder comStatus(String status) {
		item.setStatus(status);
		return this;
	}
	
	public Item build() {
		return item;
	}


}
