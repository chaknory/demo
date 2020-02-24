package fr.bpifrance.mendix.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.bpifrance.mendix.model.Dossier;
import java.util.List;


@Repository
public interface DossierRepository  extends CrudRepository<Dossier, Long> {
	
	Dossier save(Dossier dossier);
	void delete(Dossier dossier);
	List<Dossier> findByReference(String reference);

}
