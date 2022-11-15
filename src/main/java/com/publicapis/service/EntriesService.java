package com.publicapis.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.publicapis.exceptionhandler.EntryNotFoundException;
import com.publicapis.model.Entries;

@Service
public interface EntriesService{
	
	/*
	 This method will take entries Entity as parameter and save it into H2Database;  
	*/
	public Entries saveEntry(Entries entries);
	
	/*
	 This method will get all entries from H2Database;  
	*/
	public List<Entries> getEntryAllEntries()throws EntryNotFoundException;
	
	/*
	 This method will take entries Id as parameter and get entries from H2Database;  
	*/
	public Entries getEntryById(Integer id)throws EntryNotFoundException;
	
	/*
	 This method will take entries title as parameter and get entries from H2Database;  
	*/
	public List<Entries> getEntryByTitle(String title)throws EntryNotFoundException;
	
	/*
	 This method will take entries category as parameter and get entries from H2Database;    
	*/
	public List<Entries> getEntryByCategory(String category)throws EntryNotFoundException;

}
