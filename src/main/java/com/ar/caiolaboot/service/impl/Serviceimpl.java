package com.ar.caiolaboot.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ar.caiolaboot.model.Skill;
import com.ar.caiolaboot.repository.Skillrepointer;
import com.ar.caiolaboot.service.SkillService;


@Service
public class Serviceimpl implements SkillService {
	
	@Autowired
	private Skillrepointer repo;
	
	@Override
	public List<Skill> obtenertodas() {
		return repo.findAll();
	}

	@Override
	public Skill buscar(Integer id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public void borrar(Integer id) {
		this.repo.deleteById(id);
	}

	@Override
	public void crear(Skill skill) {
		//skill.setSkill(skill.getid());
		repo.save(skill);
	}

	@Override
	public Skill actualizar(Skill skill) {
		return repo.save(skill);
	}
	
	
}
