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

import br.org.com.recode.model.Promocoe;
import br.org.com.recode.repository.PromocoeRepository;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
public class PromocoeController {

	@Autowired
	private PromocoeRepository promocoeRepository;


	// get all clients
	@GetMapping("/promocoes")
	public List<Promocoe> getAllPromocoes() {
		return promocoeRepository.findAll();		
		
	}
	
	// get client by id rest api
	@GetMapping("/promocoes/{id}")
	public Promocoe getPromocoeById(@PathVariable Long id) {
		return promocoeRepository.findById(id).get();
	}

	// create client rest api
	@PostMapping("/promocoes")
	public Promocoe createPromocoe(@RequestBody Promocoe promocoe) {
		return promocoeRepository.save(promocoe);
	}


	// update client rest api

	@PutMapping("/promocoes/{id}")
	public Promocoe updatePromocoe(@PathVariable Long id, @RequestBody Promocoe promocoeDetails) {
		Promocoe promocoe = promocoeRepository.findById(id).get();
		
		promocoe.setId(promocoeDetails.getId());
		promocoe.setPreco(promocoeDetails.getPreco());
		promocoe.setViagem(promocoeDetails.getViagem());

		return promocoeRepository.save(promocoe);

	}

	// delete client rest api
	@DeleteMapping("/promocoes/{id}")
	public void deletePromocoe(@PathVariable Long id) {
		promocoeRepository.deleteById(id);
	}

}
