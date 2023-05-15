package com.ar.caiolaboot.service;

import java.util.List;
import com.ar.caiolaboot.model.Skill;

public interface SkillService {
	
	public List<Skill> obtenertodas();
	public Skill buscar(Integer id);
	public void borrar(Integer id);
	public void crear (Skill skill);
	public Skill actualizar (Skill skill);
}
