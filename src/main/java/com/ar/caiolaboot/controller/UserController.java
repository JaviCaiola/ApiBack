package com.ar.caiolaboot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ar.caiolaboot.model.User;
import com.ar.caiolaboot.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	private final UserService uservice;
	
	public UserController (UserService uservice) {
		this.uservice = uservice;
	}
	
	@GetMapping("/todos")
	public List<User> allUsers(){
		return uservice.allUsers();
	}
	
	@GetMapping("/buscar/{id}")
	public User searchId (@PathVariable Long id) {
		return uservice.buscarUser(id);
	}
	
	@PostMapping("/crear")
	public User crear (@RequestBody User us) {
		return uservice.crearUser(us);
	}
	
	@PutMapping("/update/{id}")
	public User actualizar (@RequestBody User us) {
		return uservice.updateUser(us);
	}
	
	@DeleteMapping("/borrar/{id}")
	public void borrar (@PathVariable Long id) {
		uservice.borrarUser(id);
	}
}
