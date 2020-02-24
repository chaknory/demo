/**
 * 
 */
package fr.bpifrance.mendix.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import antlr.collections.List;
import fr.bpifrance.mendix.model.Event;
import fr.bpifrance.mendix.repository.EventRepository;

@Service
public class EventService {
	
	@Autowired
	EventRepository eventRepository;

	
	public Event save(Event event) {
		return eventRepository.save(event);
	}
	
	public List findByReference(String reference){
		return findByReference(reference);
	}
	
	public List findAll() {
		return (List) eventRepository.findAll();
	}
}
