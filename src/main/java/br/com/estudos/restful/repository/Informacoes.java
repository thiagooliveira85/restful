package br.com.estudos.restful.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.estudos.restful.model.Item;
import br.com.estudos.restful.ws.Informacao;
import br.com.estudos.restful.ws.ItemBuilder;

@Service
public class Informacoes {
	
	public static List<Informacao> informacoes = new ArrayList<Informacao>();
	
	static{
		
		Item item1 = new ItemBuilder()
				.comId(1)
				.comItem("12345678")
				.comDescricao("14.00 R 24 XKD1 A ***")
				.comDtEntrega("20/05/2019")
				.comQTD(40)
				.comValor(500.00)
				.comValorTotal(20000.00)
				.comStatus("Pendente")
				.build();
		
		Item item2 = new ItemBuilder()
				.comId(2)
				.comItem("65432225")
				.comDescricao("14.00 R 24 XSM D2+ TL ***")
				.comDtEntrega("08/07/2019")
				.comQTD(10)
				.comValor(800.00)
				.comValorTotal(8000.00)
				.comStatus("Confirmado")
				.build();
		
		Item item3 = new ItemBuilder()
				.comId(3)
				.comItem("87865434")
				.comDescricao("14.00 R 20 XMINE D2 TL")
				.comDtEntrega("25/12/2019")
				.comQTD(100)
				.comValor(40.00)
				.comValorTotal(4000.00)
				.comStatus("Pendente")
				.build();
		
		Informacao pedido1 = new Informacao(1, "154254658", "Pedido Vale", "450521316056126", 
				" MICHELIN IMPORTAÇÃO E EXPORTAÇÃO", Arrays.asList(item1, item2, item3));
		
		
		informacoes.add(pedido1);
	}
	
	public Informacao findById(long id) {
		for (Informacao info : informacoes) {
			if (info.getId() == id)
				return info;
		}
		throw new RuntimeException("Id não encontrado");
	}

	public List<Informacao> findAll() {
		return informacoes;
	}

	public void save(Informacao contato) {
		informacoes.add(contato);
	}

}
