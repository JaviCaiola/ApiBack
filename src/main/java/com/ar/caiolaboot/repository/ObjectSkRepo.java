package com.ar.caiolaboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ar.caiolaboot.model.ObjectSk;

@Repository
public interface ObjectSkRepo extends JpaRepository<ObjectSk, Long>{

}
