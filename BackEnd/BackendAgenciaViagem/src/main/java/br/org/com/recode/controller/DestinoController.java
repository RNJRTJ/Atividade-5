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

import br.org.com.recode.model.Destino;
import br.org.com.recode.repository.DestinoRepository;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
public class DestinoController {

	@Autowired
	private DestinoRepository destinoRepository;
	
	
	

	// get all clients
	@GetMapping("/destinos")
	public List<Destino> getAllDestinos() {
		return destinoRepository.findAll();		
		
	}
	
	// get client by id rest api
	@GetMapping("/destinos/{id}")
	public Destino getDestinoById(@PathVariable Long id) {
		return destinoRepository.findById(id).get();
	}

	// create client rest api
	@PostMapping("/destinos")
	public Destino createDestino(@RequestBody Destino destino) {
		return destinoRepository.save(destino);
	}


	// update client rest api

	@PutMapping("/destinos/{id}")
	public Destino updateDestino(@PathVariable Long id, @RequestBody Destino destinoDetails) {
		Destino destino = destinoRepository.findById(id).get();
		
		destino.setId(destinoDetails.getId());
		destino.setDataviagem(destinoDetails.getDataviagem());
		destino.setContato(destinoDetails.getContato());
		destino.setPromocoe(destinoDetails.getPromocoe());
		
		return destinoRepository.save(destino);

	}

	// delete client rest api
	@DeleteMapping("/destinos/{id}")
	public void deleteDestino(@PathVariable Long id) {
		destinoRepository.deleteById(id);
	}

}
