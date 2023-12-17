package br.org.com.recode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "promocoes")
@Table(name = "promocoes")
public class Promocoe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	private String preco;

	private String viagem;
	

	public Promocoe() {
		super();
	}


	public Promocoe(long id, String preco, String viagem) {
		super();
		this.id = id;
		this.preco = preco;
		this.viagem = viagem;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getPreco() {
		return preco;
	}


	public void setPreco(String preco) {
		this.preco = preco;
	}


	public String getViagem() {
		return viagem;
	}


	public void setViagem(String viagem) {
		this.viagem = viagem;
	}

	
	
	

}
