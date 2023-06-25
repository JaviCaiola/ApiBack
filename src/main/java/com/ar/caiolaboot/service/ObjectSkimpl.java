package com.ar.caiolaboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ar.caiolaboot.model.ObjectSk;
import com.ar.caiolaboot.repository.ObjectSkRepo;

@Service
public class ObjectSkimpl implements ObjectSkService {

	private final ObjectSkRepo repo;
	
	public ObjectSkimpl (ObjectSkRepo repo) {
		this.repo = repo;
	}
	
	@Override
	public List<ObjectSk> obtenerAll() {
		return repo.findAll();
	}

	@Override
	public ObjectSk buscarId(Long id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public ObjectSk crear(ObjectSk obj) {
		return repo.save(obj);
	}

	@Override
	public void delete(Long id) {
		repo.deleteById(id);
	}

	@Override
	public ObjectSk update(Long id, ObjectSk obj) {
		ObjectSk sk = repo.findById(id).orElse(null);
		if(sk != null) {
			sk.setName(obj.name);
			sk.setUrl(obj.url);
			return repo.save(sk);
		} else {
			return null;
		}
	}
	
}
