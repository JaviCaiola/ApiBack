package com.ar.caiolaboot.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ar.caiolaboot.model.ObjectSk;
import com.ar.caiolaboot.service.ObjectSkService;

@RestController
@RequestMapping("/api")
public class ObjSkController {

	private final ObjectSkService service;
	
	public ObjSkController (ObjectSkService service) {
		this.service = service;
	}
	
	@GetMapping("/all")
	public List<ObjectSk> todo(){
		return service.obtenerAll();
	}
	
	@GetMapping("buscar/{id}")
	public ObjectSk search(@PathVariable Long id) {
		return service.buscarId(id);
	}
	
	@PostMapping("/crear")
	public ObjectSk crear (@RequestBody ObjectSk sk) {
		return service.crear(sk);
	}
	
	@PutMapping("update/{id}")
	public ResponseEntity<ObjectSk> update (@PathVariable Long id ,@RequestBody ObjectSk sk) {
		ObjectSk skill = service.update(id, sk);
		if(skill != null) {
			return ResponseEntity.ok(skill);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@DeleteMapping("borrar/{id}")
	public void delete(@PathVariable Long id){
		service.delete(id);
	}
}
