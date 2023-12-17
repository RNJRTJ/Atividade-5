package br.org.com.recode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
	
	@Entity(name = "contatos")
	@Table(name = "contatos")
	public class Contato {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id")
		private Long id;
		
		private String cpf;

		private String nome;
		
		private String email;
		
		private String telefone;

		public Contato() {
			super();
		}

		public Contato(long id, String cpf, String nome, String email, String telefone) {
			super();
			this.id = id;
			this.cpf = cpf;
			this.nome = nome;
			this.email = email;
			this.telefone = telefone;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		
		

}
