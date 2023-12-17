package br.org.com.recode.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.org.com.recode.model.Contato;
import br.org.com.recode.repository.ContatoRepository;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
public class ContatoController {

	@Autowired
	private ContatoRepository contatoRepository;


	// get all clients
	@GetMapping("/contatos")
	public List<Contato> getAllContatos() {
		return contatoRepository.findAll();		
		
	}
	
	// get client by id rest api
	@GetMapping("/contatos/{id}")
	public Contato getContatoById(@PathVariable Long id) {
		return contatoRepository.findById(id).get();
	}

	// create client rest api
	@PostMapping("/contatos")
	public Contato createContato(@RequestBody Contato contato) {
		return contatoRepository.save(contato);
	}


	// update client rest api

	@PutMapping("/contatos/{id}")
	public Contato updateContato(@PathVariable Long id, @RequestBody Contato contatoDetails) {
		Contato contato = contatoRepository.findById(id).get();
		
		contato.setId(contatoDetails.getId());
		contato.setCpf(contatoDetails.getCpf());
		contato.setNome(contatoDetails.getNome());
		contato.setEmail(contatoDetails.getEmail());
		contato.setTelefone(contatoDetails.getTelefone());
	
		
		return contatoRepository.save(contato);

	}

	// delete client rest api
	@DeleteMapping("/contatos/{id}")
	public void deleteContato(@PathVariable Long id) {
		contatoRepository.deleteById(id);
	}

}
