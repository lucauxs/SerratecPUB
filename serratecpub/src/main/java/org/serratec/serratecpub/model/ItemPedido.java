package org.serratec.serratecpub.model;

import jakarta.persistence.Entity;

@Entity
public class ItemPedido {
	
	private Long id;
	private int quantidade;
	private Double precoVenda;
	private int percentualDesconto;
	private Double valorBruto;
	private Double valorLiquido;
	
	private Pedido pedido;
	
	private Produto produto;

	
	public Long getId() {
		return id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public Double getPrecoVenda() {
		return precoVenda;
	}

	public int getPercentualDesconto() {
		return percentualDesconto;
	}

	public Double getValorBruto() {
		return valorBruto;
	}

	public Double getValorLiquido() {
		return valorLiquido;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void setPrecoVenda(Double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public void setPercentualDesconto(int percentualDesconto) {
		this.percentualDesconto = percentualDesconto;
	}

	public void setValorBruto(Double valorBruto) {
		this.valorBruto = valorBruto;
	}

	public void setValorLiquido(Double valorLiquido) {
		this.valorLiquido = valorLiquido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
