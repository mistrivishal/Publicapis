package com.publicapis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.publicapis.model.Entries;
import com.publicapis.service.EntriesService;

@RestController
@RequestMapping("/publicapis")
public class EntryController {
	
	@Autowired
	private EntriesService entryService;
	
	@PostMapping("/saveEntrie")
	public ResponseEntity<Entries> saveEntries(@RequestBody Entries ent) {
		
		Entries entry = entryService.saveEntry(ent);
		
		return new ResponseEntity<Entries>(entry, HttpStatus.CREATED);
	}
	
	@GetMapping("/getEntrie")
	public ResponseEntity<List<Entries>> getAllEntries() {
		
		List<Entries> entries = entryService.getEntryAllEntries();
		
		return new ResponseEntity<List<Entries>>(entries, HttpStatus.OK);
	}
	
	@GetMapping("/id/{id}")
	public ResponseEntity<Entries> getEntriesById(@PathVariable(name = "id") Integer id) {
		
		Entries entries = entryService.getEntryById(id);
		
		return new ResponseEntity<Entries>(entries, HttpStatus.OK);
	}
	
	@GetMapping("/tilte/{tilte}")
	public ResponseEntity<List<Entries>> getEntriesByTitle(@PathVariable(name = "tilte") String tilte) {
		
		List<Entries> entries = entryService.getEntryByTitle(tilte);
		
		return new ResponseEntity<List<Entries>>(entries, HttpStatus.OK);
	}
	
	@GetMapping("/category/{category}")
	public ResponseEntity<List<Entries>> getEntryByCategory(@PathVariable(name = "tilte") String category) {
		
		List<Entries> entries = entryService.getEntryByCategory(category);
		
		return new ResponseEntity<List<Entries>>(entries, HttpStatus.OK);
	}
}
