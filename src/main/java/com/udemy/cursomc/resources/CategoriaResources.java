package com.udemy.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.cursomc.domain.Categoria;
import com.udemy.cursomc.services.CategoriaService;

//Package responsável pelo controle do rest

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResources {
	
	@Autowired
	public CategoriaService service;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	//o pathVariable é para informar que o id que eu irei receber na url, é o id do parâmetro
	public ResponseEntity<?> buscar(@PathVariable Integer id) {
		
		Categoria obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
}
