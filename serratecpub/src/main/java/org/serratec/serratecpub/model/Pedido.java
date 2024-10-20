package org.serratec.serratecpub.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate dataPedido;
	private LocalDate dataEntrega;
	private LocalDate dataEnvio;
	private StatusPedido statusPedido;
	private double valorTotal;
	
	@JsonBackReference
	@ManyToOne(cascade= CascadeType.ALL)
	private Cliente cliente;
	
	
	@OneToMany(mappedBy = "pedido",cascade = CascadeType.ALL)
	private List<ItemPedido> itemPedido =new ArrayList<>();
	
	
	public List<ItemPedido> getItemPedido() {
		return itemPedido;
	}
	public void setItensPedido(List<ItemPedido> ItemPedido) {
		ItemPedido.forEach(ip -> ip.setPedido(this));
		this.itemPedido = ItemPedido;
		
	}
	

	public Long getId() {
		return id;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public LocalDate getDataEntrega() {
		return dataEntrega;
	}

	public LocalDate getDataEnvio() {
		return dataEnvio;
	}

	public StatusPedido getStatusPedido() {
		return statusPedido;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = LocalDate.now();
	}

	public void setDataEntrega(LocalDate dataEntrega) {
		this.dataEntrega = LocalDate.now().plusDays(15);
	}

	public void setDataEnvio(LocalDate dataEnvio) {
		this.dataEnvio = dataEnvio;
	}

	public void setStatusPedido(StatusPedido statusPedido) {
		this.statusPedido = statusPedido;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
		
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
