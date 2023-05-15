package com.ar.caiolaboot.repository;

import com.ar.caiolaboot.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Skillrepointer extends JpaRepository<Skill, Integer>{

}
