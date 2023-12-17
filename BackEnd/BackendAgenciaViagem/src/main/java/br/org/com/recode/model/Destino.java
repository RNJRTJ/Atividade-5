package br.org.com.recode.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity(name = "destinos")
@Table(name = "destinos")
public class Destino {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd-MM-yyyy kk:mm")
	private Date dataviagem;


	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "contato_id")
	private Contato contato;
	

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "promocoe_id")
	private Promocoe promocoe;
	
	public Destino() {
		super();
	}

	public Destino(Long id, Date dataviagem, Contato contato, Promocoe promocoe) {
		super();
		this.id = id;
		this.dataviagem = dataviagem;
		this.contato = contato;
		this.promocoe = promocoe;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDataviagem() {
		return dataviagem;
	}

	public void setDataviagem(Date dataviagem) {
		this.dataviagem = dataviagem;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public Promocoe getPromocoe() {
		return promocoe;
	}

	public void setPromocoe(Promocoe promocoe) {
		this.promocoe = promocoe;
	}

}
