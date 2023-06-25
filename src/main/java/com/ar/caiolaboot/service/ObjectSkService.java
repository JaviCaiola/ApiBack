package com.ar.caiolaboot.service;

import java.util.List;

import com.ar.caiolaboot.model.ObjectSk;

public interface ObjectSkService {
	
	public List<ObjectSk> obtenerAll();
	public ObjectSk buscarId(Long id);
	public ObjectSk crear(ObjectSk obj);
	public void delete(Long id);
	public ObjectSk update(Long id, ObjectSk obj);
}
