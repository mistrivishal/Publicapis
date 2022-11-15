package com.publicapis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.publicapis.exceptionhandler.EntryNotFoundException;
import com.publicapis.model.Entries;
import com.publicapis.repository.EntriesRepo;

@Service
public class EntriesServiceImpl implements EntriesService{

	
	@Autowired
	private EntriesRepo eRepo;
	
	@Override
	public Entries saveEntry(Entries entries) {
		return eRepo.save(entries);
	}

	@Override
	public Entries getEntryById(Integer id) throws EntryNotFoundException{
		
		Optional<Entries> entry = eRepo.findById(id);
		
		return entry.orElseThrow(()-> new EntryNotFoundException("Entry not found with id " + id));
	}

	@Override
	public List<Entries> getEntryByTitle(String title) {
		
		List<Entries> entries = eRepo.findByTitle(title);
		
		return entries;
	}

	@Override
	public List<Entries> getEntryByCategory(String category) {
		
		List<Entries> entries = eRepo.findByCategory(category);
		
		return entries;
	}

	@Override
	public List<Entries> getEntryAllEntries() throws EntryNotFoundException {
		
		return eRepo.findAll();
	}

}
