package com.ar.caiolaboot.service;

import java.util.List;

import com.ar.caiolaboot.model.User;

public interface UserService {
	
	public List<User> allUsers();
	public User buscarUser (Long id);
	public User crearUser (User us);
	public void borrarUser (Long id);
	public User updateUser (Long id, User us);
}
