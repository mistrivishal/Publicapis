package com.publicapis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.publicapis.model.Entries;

@Repository
public interface EntriesRepo extends JpaRepository<Entries, Integer>{
	 
	public List<Entries> findByTilte(String title);
	
	public List<Entries> findByCategory(String category);
}
