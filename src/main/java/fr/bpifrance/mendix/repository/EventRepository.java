package fr.bpifrance.mendix.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.bpifrance.mendix.model.Event;

import java.util.List;

@Repository
public interface EventRepository extends CrudRepository<Event, Long> {
	
	//Event save(Event event);
	void delete(Event event);

	List<Event> findByReference(String reference);
}
