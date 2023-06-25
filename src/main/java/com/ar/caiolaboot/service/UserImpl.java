package com.ar.caiolaboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ar.caiolaboot.model.User;
import com.ar.caiolaboot.repository.UserRepo;

@Service
public class UserImpl implements UserService{

	private final UserRepo repo;
	
	public UserImpl(UserRepo repo) {
		this.repo = repo;
	}
	
	
	@Override
	public List<User> allUsers() {
		return repo.findAll();
	}

	@Override
	public User buscarUser(Long id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public User crearUser(User us) {
		return repo.save(us);
	}

	@Override
	public void borrarUser(Long id) {
		repo.deleteById(id);
	}

	@Override
	public User updateUser(Long id, User us) {
		User user = repo.findById(id).orElse(null);
		if(user != null) {
			user.setNombre(us.nombre);
			user.setEmail(us.email);
			user.setContraseña(us.contraseña);
			return repo.save(user);
		} else {
			return null;
		}
	}

}
