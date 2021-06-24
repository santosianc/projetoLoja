package myapp;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import myapp.cadastros.CD;
import myapp.cadastros.Cadastro;
import myapp.cadastros.Produto;
import myapp.factory.FabricaCadastro;
import myapp.pedidos.Pedido;
import myapp.pedidos.PedidoItem;

public class Application {
	public static void main(String[] args) {
		//REQUISITO
		//1 CRIAR OBJETOS QUE RELACIONANDO-SE EU TEREI UMA PESRPECTIVA DE TER UM PEDIDO COM
		//TODAS AS INFORMAÇÕES
		
		//2 IMPRIMIR ESTE PEDIDO NO ESTILO CUPOM
		
		
		

	
		Cadastro artista = FabricaCadastro.criarCadastro("Flávio José", "flaviojose@gmail.com", 8399457812L);
		// O "craircadastro" é usado no lugarf dos set
		//artista.setNome("Flávio José");
		//artista.setTelefone(8399457812L);
	
		//a jvm nao sabe se é um cd ou livro
		//Se utilizasse prodoto p1 não teríamos acesso as características do CD
		//Produto p1 = new CD(); //Livro()
		CD p1 = new CD(); //Livro()
		p1.setCodigoBarras("179535435");
		p1.setTitulo("Flávio José ao vivo");
		p1.setValorVenda(20.50);
		p1.setFaixa(10);
		p1.setArtista(artista);
		
		
		artista =  FabricaCadastro.criarCadastro("Zeca Pagodinho", "zecanaroda@gmail.com", 1399457812L);

		
		
		CD p2 = new CD(); //Livro()
		p2.setCodigoBarras("179535442");
		p2.setTitulo("Faixa Amarela");
		p2.setValorVenda(20.50);
		p2.setFaixa(10);
		p2.setArtista(artista);
		
		
		System.out.println(p1.getArtista().getNome());
		
		System.out.println(p2.getArtista().getNome());
		
		
		Pedido pedido = new Pedido();
		Cadastro comprador = FabricaCadastro.criarCadastro("Clienton", "clienton@gmail.com", 83994512456L);
		
		
		pedido.setComprador(comprador);
		pedido.setData(new Date(2021,6,22));
		pedido.setValorTotal(45.50);
		pedido.setId(123);
		
		List<PedidoItem> itens = new ArrayList<>();
		PedidoItem item = new PedidoItem();
		item.setProduto(p1);
		item.setQuantidade(2.0);
		item.setValorVenda(p1.getValorVenda());
		item.setValorTotal(item.getQuantidade() * item.getValorVenda());
		
		
		itens.add(item);
		
		item = new PedidoItem();
		item.setProduto(p2);
		item.setQuantidade(6.0);
		item.setValorVenda(p1.getValorVenda());
		item.setValorTotal(item.getQuantidade() * item.getValorVenda());
		
		itens.add(item);
		
		
		pedido.setItens(itens);
		
		System.out.println("Pedido cliente" + pedido.getComprador().getNome());
		for(PedidoItem i: pedido.getItens()) {
			System.out.println(i.getProduto().getTitulo() + " " + i.getValorVenda() + " " + i.getValorTotal());
		}
	}
	

}






 







//String nome = "Carlão dos teclado";
//Cadastro cadastro = new Cadastro();

//cadastro.setEmail("carlao_teclado@gmail.com");
//cadastro.setNome("carlão dos teclado");

//System.out.println(cadastro.getNome());