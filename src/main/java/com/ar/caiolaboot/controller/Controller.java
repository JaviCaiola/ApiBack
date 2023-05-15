package com.ar.caiolaboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ar.caiolaboot.model.Skill;
import com.ar.caiolaboot.service.impl.Serviceimpl;

@RestController
@RequestMapping("/api/reposkill")
public class Controller {
	
	@Autowired
	private Serviceimpl impl;
	
	//@RequestMapping(value="consultarSkill", method = RequestMethod.GET)
		@GetMapping("/verskill")
		@ResponseBody
		public List<Skill> Consultarskill(){
			/*List<Skill> listaSkill = this.impl.obtenertodas();
			return ResponseEntity.ok(listaSkill);*/
			return impl.obtenertodas();
		}
		
		//@RequestMapping(value="crearSkill", method = RequestMethod.POST)
		@PostMapping("/newskill")
		public void crearskill(@RequestBody Skill vSkill){
			/*Skill skillcreada = impl.crear(vSkill);
			return ResponseEntity.status(HttpStatus.CREATED).body(skillcreada);*/
			impl.crear(vSkill);
		}
		
		@PutMapping("/update")
		//@RequestMapping(value="actualizarSkill", method = RequestMethod.PUT)
		public Skill actualizarSkill(@RequestBody Skill vSkill){
			return impl.actualizar(vSkill);
		}
		
		//@RequestMapping(value="buscarSkill/{id}", method = RequestMethod.GET)
		@GetMapping("/buscar/{id}")
		public ResponseEntity<?> buscarSkill(@PathVariable Integer id){
			Skill resultadoskill = this.impl.buscar(id);
			return ResponseEntity.ok(resultadoskill);
		}
		
		//@RequestMapping(value="eliminarSkill/{id}", method = RequestMethod.DELETE)
		@DeleteMapping("/delete/{id}")
		public ResponseEntity<?> eliminarSkill(@PathVariable Integer id){
			this.impl.borrar(id);
			return ResponseEntity.ok().build();
		}
		
}
