/**
 * 
 */
package fr.bpifrance.mendix.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.bpifrance.mendix.model.Event;
import fr.bpifrance.mendix.service.EventService;
import io.swagger.annotations.Api;

@Api( description="API pour es opérations CRUD sur les events.")
@RestController
@RequestMapping("/event")
public class EventController {
	
	@Autowired 
	EventService eventService;
	
	@GetMapping
    public ResponseEntity<antlr.collections.List> findAll() {
        return ResponseEntity.ok(eventService.findAll());
    }
	
	 @GetMapping("/{reference}")
	 public ResponseEntity<Event> getEmployeeById(@PathVariable("reference") String reference){
		 Event event = (Event) eventService.findByReference(reference);	 
		 return new ResponseEntity<Event>(event, new HttpHeaders(), HttpStatus.OK);
	 }
	 
	 @PostMapping("/{addUpdate}")
	 public ResponseEntity<Event> createOrUpdateEvent(Event event){
		 Event updated = eventService.save(event);
		 return new ResponseEntity<Event>(updated, new HttpHeaders(), HttpStatus.OK);
	 }
	
	
}
